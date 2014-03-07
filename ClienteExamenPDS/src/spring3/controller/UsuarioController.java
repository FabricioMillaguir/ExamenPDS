package spring3.controller;

import java.rmi.RemoteException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import webservices.ServicioUsuarioStub;
import webservices.ServicioUsuarioStub.AgregarUsuario;
import webservices.ServicioUsuarioStub.AgregarUsuarioResponse;
import webservices.ServicioUsuarioStub.UsuarioVO;
import domain.Usuario;

/**
 * controlador del usuario
 * 
 * @author Fabricio Millaguir
 * 
 */

@Controller
@SessionAttributes
public class UsuarioController {

	/**
	 * 
	 * @return vista para registrar un usuario
	 */
	@RequestMapping("mostrarRegistrarUsuario")
	public ModelAndView mostrarRegistrarUsuario() {

		return new ModelAndView("registrarUsuario");
	}

	/**
	 * llama al servicio de registro de usuario
	 * 
	 * @param usuario
	 * @param result
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/registrarUsuario", method = RequestMethod.POST)
	public ModelAndView registrarUsuario(
			@ModelAttribute("usuario") @Valid Usuario usuario,
			BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			System.out.println("ERROR");
		}

		if (usuario.getUsername().isEmpty() || usuario.getPassword().isEmpty()) {
			return new ModelAndView("registrarUsuario", "message",
					"No ha creado ningun usuario");
		}

		try {

			ServicioUsuarioStub oStub = new ServicioUsuarioStub();

			UsuarioVO usuarioVO = new UsuarioVO();

			usuarioVO.setUsername(usuario.getUsername());
			usuarioVO.setPassword(usuario.getPassword());

			AgregarUsuario agregarUsuario = new AgregarUsuario();

			agregarUsuario.setUsuarioVO(usuarioVO);
			AgregarUsuarioResponse objResponse = oStub
					.agregarUsuario(agregarUsuario);

			String mensaje = objResponse.get_return();

			return new ModelAndView("saludo", "message", mensaje);
		} catch (RemoteException e) {
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

	}

}
