package domain;

/**
 * PalabraVO
 * 
 * @author Fabricio Millaguir
 * 
 */
public class PalabraVO {

	public int id;
	public String espanol;
	public String mapudungun;
	public int idioma;

	/**
	 * Constructor vacio
	 */
	public PalabraVO() {
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 */
	public PalabraVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor
	 * 
	 * @param espanol
	 * @param mapudungun
	 */
	public PalabraVO(String espanol, String mapudungun) {
		this.espanol = espanol;
		this.mapudungun = mapudungun;
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param espanol
	 * @param mapudungun
	 */
	public PalabraVO(int id, String espanol, String mapudungun) {
		this.id = id;
		this.espanol = espanol;
		this.mapudungun = mapudungun;
	}

	/**
	 * 
	 * @return id de la palabra
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            de la palabra
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return palabra en español
	 */
	public String getEspanol() {
		return espanol;
	}

	/**
	 * 
	 * @param espanol
	 */
	public void setEspanol(String espanol) {
		this.espanol = espanol;
	}

	/**
	 * 
	 * @return palabra en mapudungun
	 */
	public String getMapudungun() {
		return mapudungun;
	}

	/**
	 * 
	 * @param mapudungun
	 */
	public void setMapudungun(String mapudungun) {
		this.mapudungun = mapudungun;
	}

	/**
	 * 
	 * @return idioma de origen
	 */
	public int getIdioma() {
		return idioma;
	}

	/**
	 * 
	 * @param idioma
	 */
	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}

}
