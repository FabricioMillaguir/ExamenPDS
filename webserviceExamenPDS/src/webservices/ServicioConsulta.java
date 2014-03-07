package webservices;

import java.util.List;
import domain.ConsultaVO;
import domain.Negocio;

/**
 * Servicio Consulta
 * 
 * @author Fabricio Millaguir
 * 
 */

public class ServicioConsulta {

	/**
	 * Servicio para agregar consulta
	 * 
	 * @param consultaVO
	 * @return
	 */
	public static String agregarConsulta(ConsultaVO consultaVO) {
		return Negocio.agregarConsulta(consultaVO);
	}

	/**
	 * Servicio para mostrar consultas
	 * 
	 * @return lista de consultas
	 */
	public static List<ConsultaVO> mostrarConsultas() {
		return Negocio.mostrarConsultas();
	}

}
