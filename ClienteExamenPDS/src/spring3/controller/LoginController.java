package spring3.controller;

import java.rmi.RemoteException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import webservices.ServicioLoginStub;
import webservices.ServicioLoginStub.Loggear;
import webservices.ServicioLoginStub.LoggearResponse;
import webservices.ServicioLoginStub.TokenVO;
import webservices.ServicioLoginStub.UsuarioVO;
import domain.Usuario;

/**
 * Controlador del Login
 * 
 * @author Fabricio Millaguir
 * 
 */

@Controller
@SessionAttributes
public class LoginController {

	/**
	 * 
	 * @return vista del login
	 */
	@RequestMapping("login.html")
	public ModelAndView mostrarLogin() {
		return new ModelAndView("login", "command", new Usuario());
	}

	/**
	 * metodo que llama al servicio loggear
	 * 
	 * @param usuario
	 * @param result
	 * @param session
	 * @return vista con el menu
	 */
	@RequestMapping("loggear.html")
	public ModelAndView loggear(
			@ModelAttribute("Usuario") @Valid Usuario usuario,
			BindingResult result, HttpSession session) {

		if (usuario.getUsername().isEmpty() || usuario.getPassword().isEmpty()) {
			return new ModelAndView("login", "message",
					"error en el usuario o password");
		}

		try {

			ServicioLoginStub oStub = new ServicioLoginStub();

			UsuarioVO usuarioVO = new UsuarioVO();
			usuarioVO.setUsername(usuario.getUsername());
			usuarioVO.setPassword(usuario.getPassword());
			Loggear loggear = new Loggear();
			loggear.setUsuarioVO(usuarioVO);
			LoggearResponse objResponse = oStub.loggear(loggear);
			TokenVO tokenVO = objResponse.get_return();

			session.setAttribute("token", tokenVO);

			if (tokenVO.getToken() == null) {
				return new ModelAndView("login", "message",
						"error en el usuario o password");
			}

			return new ModelAndView("menu");

		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("login", "message",
					"error en el usuario o password");

		}

	}

	/**
	 * metodo para cerrar la sesion
	 * 
	 * @param session
	 * @return vista del login
	 */
	@RequestMapping("salir.html")
	public ModelAndView salir(HttpSession session) {
		session.invalidate();
		return new ModelAndView("login");
	}

	/**
	 * 
	 * @return vista del menu
	 */
	@RequestMapping("menu.html")
	public ModelAndView mostrarMenu() {
		return new ModelAndView("menu");
	}

}
