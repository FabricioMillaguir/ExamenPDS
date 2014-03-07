package webservices;

import domain.Negocio;
import domain.UsuarioVO;

/**
 * Servicio de usuario
 * 
 * @author Fabricio Millaguir
 * 
 */
public class ServicioUsuario {

	/**
	 * agrega un usuario
	 * 
	 * @param usuarioVO
	 * @return
	 */
	public static String agregarUsuario(UsuarioVO usuarioVO) {
		return Negocio.agregarUsuario(usuarioVO);
	}

}
