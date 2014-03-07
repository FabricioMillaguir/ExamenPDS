package spring3.controller;

import java.rmi.RemoteException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import webservices.ServicioTraduccionStub;
import webservices.ServicioTraduccionStub.PalabraVO;
import webservices.ServicioTraduccionStub.Traducir;
import webservices.ServicioTraduccionStub.TraducirResponse;
import domain.Busqueda;

/**
 * controlador de Palabra
 * 
 * @author Fabricio Millaguir
 * 
 */

@Controller
@SessionAttributes
public class PalabraController {

	/**
	 * 
	 * @return vista para buscar una palabra a traducir
	 */
	@RequestMapping("mostrarBusqueda")
	public ModelAndView mostrarBusqueda() {
		return new ModelAndView("mostrarBusqueda");
	}

	/**
	 * llama al servicio traducir
	 * 
	 * @param busqueda
	 * @param result
	 * @param session
	 * @param request
	 * @return una vista con el resultado encontrado
	 */
	@RequestMapping("traducir")
	public ModelAndView traducir(
			@ModelAttribute("busqueda") @Valid Busqueda busqueda,
			BindingResult result, HttpSession session,
			HttpServletRequest request) {
		if (busqueda.getBusqueda().isEmpty()) {
			return mostrarBusqueda();
		}

		try {
			ServicioTraduccionStub oStub = new ServicioTraduccionStub();
			PalabraVO palabraVO = new PalabraVO();
			palabraVO.setIdioma(busqueda.getIdioma());

			if (busqueda.getIdioma() == 1) {
				palabraVO.setEspanol(busqueda.getBusqueda());
			}
			if (busqueda.getIdioma() == 2) {
				palabraVO.setMapudungun(busqueda.getBusqueda());
			}

			Traducir traducir = new Traducir();
			traducir.setPalabraVO(palabraVO);
			TraducirResponse objResponse = oStub.traducir(traducir);
			palabraVO = objResponse.get_return();

			if (palabraVO == null) {
				return new ModelAndView("resultado", "message",
						"no existe la palabra en este idioma");
			}
			session = request.getSession(true);
			ConsultaController.agregarConsulta(palabraVO, session);
			return new ModelAndView("resultado", "palabra", palabraVO);
		} catch (RemoteException e) {
			return new ModelAndView("mostrarBusqueda", "message",
					"no existe la palabra");
		}

	}

}
