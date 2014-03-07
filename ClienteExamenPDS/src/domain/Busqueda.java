package domain;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Clase que contiene los datos de la busqueda
 * 
 * @author Fabricio Millaguir
 * 
 */

public class Busqueda {

	public int idioma;
	@NotEmpty
	public String busqueda;

	/**
	 * Constructor vacio
	 */
	public Busqueda() {
	}

	/**
	 * 
	 * @param idioma
	 * @param busqueda
	 */
	public Busqueda(int idioma, String busqueda) {
		this.idioma = idioma;
		this.busqueda = busqueda;
	}

	/**
	 * 
	 * @return codigo del idioma de origen
	 */
	public int getIdioma() {
		return idioma;
	}

	/**
	 * 
	 * @param idioma
	 *            codigo del idioma
	 */
	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}

	/**
	 * 
	 * @return la palabra buscada
	 */
	public String getBusqueda() {
		return busqueda;
	}

	/**
	 * 
	 * @param busqueda
	 *            la palabra a buscar
	 */
	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}

}
