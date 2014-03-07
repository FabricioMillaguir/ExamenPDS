package domain;

import java.util.ArrayList;

import java.util.List;
import java.util.UUID;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.ExamenPDSPersistentManager;
import orm.Palabra;
import orm.Token;
import orm.TokenDAO;
import orm.Traduccion;
import orm.Usuario;

/**
 * Negocio
 * 
 * @author Fabricio Millaguir
 * 
 */
public abstract class Negocio {

	/**
	 * guarda el token
	 * 
	 * @param tokenVO
	 * @return true si fue guardado el token o false en caso contrario
	 */
	public static boolean guardarToken(TokenVO tokenVO) {

		try {
			PersistentTransaction t = ExamenPDSPersistentManager.instance()
					.getSession().beginTransaction();
			try {
				orm.Token ormToken = orm.TokenDAO.createToken();
				ormToken.setToken(tokenVO.getToken());
				ormToken.setTiempo_inicio(tokenVO.getTiempoInicio());

				ormToken.setUsuario(orm.UsuarioDAO.getUsuarioByORMID(tokenVO
						.getUsuarioVO().getId()));

				TokenDAO.save(ormToken);
				t.commit();
				return true;

			} catch (Exception e) {
				t.rollback();
				return false;
			}
		} catch (PersistentException e) {

			e.printStackTrace();
			return false;
		}

	}

	/**
	 * loggea al usuario
	 * 
	 * @param usuarioVO
	 * @return Token de la sesion del usuario
	 */
	public static TokenVO loggearUsuario(UsuarioVO usuarioVO) {
		try {
			TokenVO tokenVO = new TokenVO();

			if (orm.UsuarioDAO.queryUsuario(
					"username = '" + usuarioVO.getUsername() + "'", null)
					.isEmpty()) {
				return tokenVO;
			}

			orm.Usuario ormUsuario = (Usuario) orm.UsuarioDAO.queryUsuario(
					"username = '" + usuarioVO.getUsername() + "'", null)
					.get(0);

			if (ormUsuario.getPassword().equals(usuarioVO.getPassword())) {
				usuarioVO.setId(ormUsuario.getId());
				tokenVO.setToken(generarToken());
				tokenVO.setUsuarioVO(usuarioVO);
				tokenVO.setTiempoInicio(System.currentTimeMillis());

				guardarToken(tokenVO);
			}
			return tokenVO;

		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * genera el token usando identificador universalmente único (uuid)
	 * 
	 * @return token
	 */
	private static String generarToken() {
		String uuid = UUID.randomUUID().toString();

		return uuid;

	}

	/**
	 * agrega un usuario
	 * 
	 * @param usuarioVO
	 * @return
	 */
	public static String agregarUsuario(UsuarioVO usuarioVO) {

		try {
			PersistentTransaction t = ExamenPDSPersistentManager.instance()
					.getSession().beginTransaction();
			try {
				orm.Usuario usuario = orm.UsuarioDAO.createUsuario();

				usuario.setUsername(usuarioVO.getUsername());
				usuario.setPassword(usuarioVO.getPassword());

				orm.UsuarioDAO.save(usuario);
				t.commit();
				return "guardado con exito";

			} catch (Exception e) {
				t.rollback();
				return null;
			}
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * traduce una palabra
	 * 
	 * @param palabraVO
	 * @return palabra
	 */
	public static PalabraVO traducir(PalabraVO palabraVO) {
		try {

			orm.Palabra[] ormPalabras;
			if (palabraVO.getIdioma() == 1) {
				ormPalabras = orm.PalabraDAO.listPalabraByQuery("espanol = '"
						+ palabraVO.getEspanol() + "'", null);
				if (ormPalabras.length == 0) {

					return null;
				}
				palabraVO.setId(ormPalabras[0].getId());
				palabraVO.setMapudungun(ormPalabras[0].getMapudungun());
			}

			if (palabraVO.getIdioma() == 2) {
				ormPalabras = orm.PalabraDAO.listPalabraByQuery(
						"mapudungun = '" + palabraVO.getMapudungun() + "'",
						null);
				if (ormPalabras.length == 0) {

					return null;
				}
				palabraVO.setId(ormPalabras[0].getId());
				palabraVO.setEspanol(ormPalabras[0].getEspanol());
			}

			return palabraVO;
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * agrega una consulta
	 * 
	 * @param consultaVO
	 * @return
	 */
	public static String agregarConsulta(ConsultaVO consultaVO) {

		try {
			PersistentTransaction t = ExamenPDSPersistentManager.instance()
					.getSession().beginTransaction();
			try {
				orm.Consulta consulta = orm.ConsultaDAO.createConsulta();

				Token token = (Token) orm.TokenDAO.queryToken(
						"token = '" + consultaVO.getTokenVO().getToken() + "'",
						null).get(0);
				Palabra palabra = new Palabra();
				palabra = (Palabra) orm.PalabraDAO.getPalabraByORMID(consultaVO
						.getPalabraVO().getId());
				Traduccion traduccion = new Traduccion();
				traduccion = (Traduccion) orm.TraduccionDAO
						.getTraduccionByORMID(consultaVO.getTraduccionVO()
								.getId());
				consulta.setFecha(consultaVO.getFecha());
				consulta.setToken(token);
				consulta.setPalabra(palabra);
				consulta.setTraduccion(traduccion);

				orm.ConsultaDAO.save(consulta);
				t.commit();
				return "guardada con exito";

			} catch (Exception e) {
				t.rollback();
				return null;
			}
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * 
	 * @return lista de consultas
	 */
	public static List<ConsultaVO> mostrarConsultas() {
		List<domain.ConsultaVO> consultaVOs = new ArrayList<domain.ConsultaVO>();
		orm.Consulta[] ormConsultas;
		try {

			ormConsultas = orm.ConsultaDAO.listConsultaByQuery(null, null);

			int length = ormConsultas.length;
			for (int i = 0; i < length; i++) {

				TokenVO tokenVO = new TokenVO(ormConsultas[i].getToken()
						.getId(), ormConsultas[i].getToken().getToken(),
						ormConsultas[i].getToken().getTiempo_inicio(),
						new UsuarioVO(ormConsultas[i].getToken().getUsuario()
								.getId()));

				PalabraVO palabraVO = new PalabraVO(ormConsultas[i]
						.getPalabra().getId(), ormConsultas[i].getPalabra()
						.getEspanol(), ormConsultas[i].getPalabra()
						.getMapudungun());

				TraduccionVO traduccionVO = new TraduccionVO(ormConsultas[i]
						.getTraduccion().getId(), ormConsultas[i]
						.getTraduccion().getTraduccion());

				consultaVOs.add(new ConsultaVO(ormConsultas[i].getId(),
						ormConsultas[i].getFecha(), tokenVO, palabraVO,
						traduccionVO));

			}

			return consultaVOs;
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

}
