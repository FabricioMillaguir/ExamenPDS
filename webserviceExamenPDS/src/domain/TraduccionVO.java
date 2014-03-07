package domain;

/**
 * TraduccionVO
 * 
 * @author Fabricio Millaguir
 * 
 */
public class TraduccionVO {

	public int id;
	public String traduccion;

	/**
	 * Constructor vacio
	 */
	public TraduccionVO() {
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 */
	public TraduccionVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor
	 * 
	 * @param traduccion
	 */
	public TraduccionVO(String traduccion) {
		this.traduccion = traduccion;
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param traduccion
	 */
	public TraduccionVO(int id, String traduccion) {
		this.id = id;
		this.traduccion = traduccion;
	}

	/**
	 * 
	 * @return id de la traduccion
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return traduccion
	 */
	public String getTraduccion() {
		return traduccion;
	}

	/**
	 * 
	 * @param traduccion
	 */
	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}

}
