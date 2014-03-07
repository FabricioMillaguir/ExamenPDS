package domain;

/**
 * Clase con los datos de un usuario
 * 
 * @author Fabricio Millaguir
 * 
 */

public class Usuario {

	public int id;
	public String username;
	public String password;

	/**
	 * Constructor vacio
	 */
	public Usuario() {
	}

	/**
	 * 
	 * @param id
	 *            id del usuario
	 */
	public Usuario(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @param username
	 *            nombre de usuario
	 * @param password
	 *            contraseña
	 */
	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/**
	 * 
	 * @param id
	 *            id del usuario
	 * @param username
	 *            nombre de usuario
	 * @param password
	 *            contraseña
	 */
	public Usuario(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	/**
	 * 
	 * @return id del usuario
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            cambia el id del usuario
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return el nombre de usuario
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username
	 *            cambia el nombre de usuario
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
