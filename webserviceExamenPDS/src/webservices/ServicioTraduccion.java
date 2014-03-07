package webservices;

import domain.Negocio;
import domain.PalabraVO;

/**
 * Servicio de traduccion
 * 
 * @author Fabricio Millaguir
 * 
 */
public class ServicioTraduccion {

	/**
	 * traduce una palabra
	 * 
	 * @param palabraVO
	 * @return
	 */
	public static PalabraVO traducir(PalabraVO palabraVO) {
		return Negocio.traducir(palabraVO);
	}

}
