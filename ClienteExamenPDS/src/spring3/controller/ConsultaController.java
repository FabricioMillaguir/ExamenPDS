package spring3.controller;

import java.rmi.RemoteException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import domain.ConsultaHistorica;
import spring3.form.ConsultaHistoricaForm;
import webservices.ServicioConsultaStub;
import webservices.ServicioConsultaStub.AgregarConsulta;
import webservices.ServicioConsultaStub.AgregarConsultaResponse;
import webservices.ServicioConsultaStub.ConsultaVO;
import webservices.ServicioConsultaStub.MostrarConsultas;
import webservices.ServicioConsultaStub.MostrarConsultasResponse;
import webservices.ServicioConsultaStub.TokenVO;
import webservices.ServicioConsultaStub.TraduccionVO;
import webservices.ServicioConsultaStub.UsuarioVO;
import webservices.ServicioTraduccionStub.PalabraVO;

/**
 * Controlador de consulta
 * 
 * @author Fabricio Millaguir
 * 
 */

@Controller
@SessionAttributes
public class ConsultaController {

	/**
	 * metodo que agrega una consulta
	 * 
	 * @param palabraVO
	 * @param session
	 */
	public static void agregarConsulta(PalabraVO palabraVO, HttpSession session) {

		try {

			ServicioConsultaStub oStub = new ServicioConsultaStub();

			ConsultaVO consultaVO = new ConsultaVO();
			consultaVO.setFecha(new Date());
			TokenVO tokenVO = new TokenVO();
			webservices.ServicioLoginStub.TokenVO token = (webservices.ServicioLoginStub.TokenVO) session
					.getAttribute("token");

			tokenVO.setToken(token.getToken());
			UsuarioVO usuarioVO = new UsuarioVO();
			tokenVO.setUsuarioVO(usuarioVO);

			consultaVO.setTokenVO(tokenVO);

			webservices.ServicioConsultaStub.PalabraVO palabra = new webservices.ServicioConsultaStub.PalabraVO();
			palabra.setId(palabraVO.getId());
			palabra.setEspanol(palabraVO.getEspanol());
			palabra.setMapudungun(palabraVO.getMapudungun());
			palabra.setIdioma(palabraVO.getIdioma());
			consultaVO.setPalabraVO(palabra);

			TraduccionVO traduccionVO = new TraduccionVO();
			traduccionVO.setId(palabraVO.getIdioma());

			consultaVO.setTraduccionVO(traduccionVO);

			AgregarConsulta agregarConsulta = new AgregarConsulta();

			agregarConsulta.setConsultaVO(consultaVO);

			AgregarConsultaResponse objResponse = oStub
					.agregarConsulta(agregarConsulta);

			String mensaje = objResponse.get_return();

			System.out.println(mensaje);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que muestra las consultas
	 * 
	 * @return vista con las consultas
	 */
	@RequestMapping("mostrarConsultas")
	public ModelAndView mostrarConsultas() {
		ConsultaHistoricaForm consultaForm = new ConsultaHistoricaForm();
		try {

			ServicioConsultaStub oStub = new ServicioConsultaStub();
			MostrarConsultas mostrarConsultas = new MostrarConsultas();

			MostrarConsultasResponse objResponse = oStub
					.mostrarConsultas(mostrarConsultas);

			ConsultaVO[] consultaVOs = objResponse.get_return();
			int length = consultaVOs.length;

			List<ConsultaHistorica> consultaHistoricas = new ArrayList<ConsultaHistorica>();
			for (int i = 0; i < length; i++) {
				ConsultaHistorica con = new ConsultaHistorica();
				con.setFecha(consultaVOs[i].getFecha());
				con.setTraduccion(consultaVOs[i].getTraduccionVO()
						.getTraduccion());

				if (consultaVOs[i].getTraduccionVO().getId() == 1) {
					con.setPalabra(consultaVOs[i].getPalabraVO().getEspanol());
					con.setSignificado(consultaVOs[i].getPalabraVO()
							.getMapudungun());
				}
				if (consultaVOs[i].getTraduccionVO().getId() == 2) {
					con.setPalabra(consultaVOs[i].getPalabraVO()
							.getMapudungun());
					con.setSignificado(consultaVOs[i].getPalabraVO()
							.getEspanol());
				}
				consultaHistoricas.add(con);
			}

			consultaForm.setConsultas(consultaHistoricas);
			return new ModelAndView("mostrarConsultas", "consultaForm",
					consultaForm);
		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");
		}
	}

}
