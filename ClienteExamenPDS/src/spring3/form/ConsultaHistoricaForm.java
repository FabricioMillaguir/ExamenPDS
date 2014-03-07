package spring3.form;

import java.io.Serializable;

/**
 * 
 * @author Fabricio Millaguir
 * 
 */

public class ConsultaHistoricaForm implements Serializable {

	public Object consultas;

	/**
	 * Constructor vacio
	 */
	public ConsultaHistoricaForm() {
	}

	/**
	 * Constructor
	 * 
	 * @param consultas
	 */
	public ConsultaHistoricaForm(Object consultas) {
		this.consultas = consultas;
	}

	/**
	 * 
	 * @return las consultas hechas
	 */
	public Object getConsultas() {
		return consultas;
	}

	/**
	 * 
	 * @param consultas
	 *            cambia las consultas
	 */
	public void setConsultas(Object consultas) {
		this.consultas = consultas;
	}

}
