package domain;

import java.text.DateFormat;
import java.util.Date;

/**
 * Clase que contiene una consulta historica
 * 
 * @author Fabricio Millaguir
 * 
 */

public class ConsultaHistorica {

	public String fecha;
	public String traduccion;
	public String palabra;
	public String significado;

	/**
	 * Constructor vacio
	 */
	public ConsultaHistorica() {
	}

	/**
	 * 
	 * @param fecha
	 *            la fecha en que se realizo la consulta
	 * @param traduccion
	 *            el idioma de origen y destino
	 * @param palabra
	 *            la palabra a traducir
	 * @param significado
	 *            el significado en el idioma solicitado
	 */
	public ConsultaHistorica(String fecha, String traduccion, String palabra,
			String significado) {
		this.fecha = fecha;
		this.traduccion = traduccion;
		this.palabra = palabra;
		this.significado = significado;
	}

	/**
	 * 
	 * @return fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * 
	 * @param fecha
	 *            cambia el valor de la fecha
	 */
	public void setFecha(Date fecha) {
		DateFormat df = DateFormat.getDateInstance();
		String s = df.format(fecha);
		this.fecha = s;
	}

	/**
	 * 
	 * @return el idioma de origen y destino
	 */
	public String getTraduccion() {
		return traduccion;
	}

	/**
	 * 
	 * @param traduccion
	 *            cambia el idioma de origen y destino
	 */
	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}

	/**
	 * 
	 * @return palabra a traducir
	 */
	public String getPalabra() {
		return palabra;
	}

	/**
	 * 
	 * @param palabra
	 *            cambia la palabra a traducir
	 */
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	/**
	 * 
	 * @return el significado en el idioma solicitado
	 */
	public String getSignificado() {
		return significado;
	}

	/**
	 * 
	 * @param significado
	 *            cambia el valor de significado
	 */
	public void setSignificado(String significado) {
		this.significado = significado;
	}

}
