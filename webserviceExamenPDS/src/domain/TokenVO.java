package domain;

/**
 * TokenVO
 * 
 * @author Fabricio Millaguir
 * 
 */
public class TokenVO {

	public int id;
	public String token;
	public long tiempoInicio;
	public UsuarioVO usuarioVO;

	/**
	 * Constructor vacio
	 */
	public TokenVO() {
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 */
	public TokenVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor
	 * 
	 * @param token
	 */
	public TokenVO(String token) {
		this.token = token;
	}

	/**
	 * Constructor
	 * 
	 * @param token
	 * @param tiempoInicio
	 * @param usuarioVO
	 */
	public TokenVO(String token, long tiempoInicio, UsuarioVO usuarioVO) {
		this.token = token;
		this.tiempoInicio = tiempoInicio;
		this.usuarioVO = usuarioVO;
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param token
	 * @param tiempoInicio
	 * @param usuarioVO
	 */
	public TokenVO(int id, String token, long tiempoInicio, UsuarioVO usuarioVO) {
		this.id = id;
		this.token = token;
		this.tiempoInicio = tiempoInicio;
		this.usuarioVO = usuarioVO;
	}

	/**
	 * 
	 * @return id del tokenVO
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
	 * @return token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * 
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * 
	 * @return tiempoInicio
	 */
	public long getTiempoInicio() {
		return tiempoInicio;
	}

	/**
	 * 
	 * @param tiempoInicio
	 */
	public void setTiempoInicio(long tiempoInicio) {
		this.tiempoInicio = tiempoInicio;
	}

	/**
	 * 
	 * @return usuarioVO
	 */
	public UsuarioVO getUsuarioVO() {
		return usuarioVO;
	}

	/**
	 * 
	 * @param usuarioVO
	 */
	public void setUsuarioVO(UsuarioVO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}

}
