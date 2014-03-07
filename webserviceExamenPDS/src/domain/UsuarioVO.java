package domain;

/**
 * UsuarioVO
 * 
 * @author Fabricio Millaguir
 * 
 */
public class UsuarioVO {

	public int id;
	public String username;
	public String password;

	/**
	 * Constructor
	 */
	public UsuarioVO() {
	}

	/**
	 * 
	 * @param id
	 */
	public UsuarioVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor
	 * 
	 * @param username
	 * @param password
	 */
	public UsuarioVO(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param username
	 * @param password
	 */
	public UsuarioVO(int id, String username, String password) {
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
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username
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
