package webservices;

import domain.Negocio;
import domain.TokenVO;
import domain.UsuarioVO;

/**
 * Servicio de login
 * 
 * @author Fabricio Millaguir
 * 
 */
public class ServicioLogin {

	/**
	 * Servicio loggear
	 * 
	 * @param usuarioVO
	 * @return
	 */
	public static TokenVO loggear(UsuarioVO usuarioVO) {
		return Negocio.loggearUsuario(usuarioVO);
	}

}
