package domain;

import java.util.Date;

/**
 * 
 * @author Fabricio Millaguir
 * 
 */
public class ConsultaVO {

	public int id;
	public Date fecha;
	public TokenVO tokenVO;
	public PalabraVO palabraVO;
	public TraduccionVO traduccionVO;

	/**
	 * Constructor vacio
	 */
	public ConsultaVO() {
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 */
	public ConsultaVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor
	 * 
	 * @param fecha
	 * @param tokenVO
	 * @param palabraVO
	 * @param traduccionVO
	 */
	public ConsultaVO(Date fecha, TokenVO tokenVO, PalabraVO palabraVO,
			TraduccionVO traduccionVO) {
		this.fecha = fecha;
		this.tokenVO = tokenVO;
		this.palabraVO = palabraVO;
		this.traduccionVO = traduccionVO;
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param fecha
	 * @param tokenVO
	 * @param palabraVO
	 * @param traduccionVO
	 */
	public ConsultaVO(int id, Date fecha, TokenVO tokenVO, PalabraVO palabraVO,
			TraduccionVO traduccionVO) {
		this.id = id;
		this.fecha = fecha;
		this.tokenVO = tokenVO;
		this.palabraVO = palabraVO;
		this.traduccionVO = traduccionVO;
	}

	/**
	 * 
	 * @return el id de la consulta
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
	 * @return fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * 
	 * @return tokenVO
	 */
	public TokenVO getTokenVO() {
		return tokenVO;
	}

	/**
	 * 
	 * @param tokenVO
	 */
	public void setTokenVO(TokenVO tokenVO) {
		this.tokenVO = tokenVO;
	}

	/**
	 * 
	 * @return palabraVO
	 */
	public PalabraVO getPalabraVO() {
		return palabraVO;
	}

	/**
	 * 
	 * @param palabraVO
	 */
	public void setPalabraVO(PalabraVO palabraVO) {
		this.palabraVO = palabraVO;
	}

	/**
	 * 
	 * @return traduccionVO
	 */
	public TraduccionVO getTraduccionVO() {
		return traduccionVO;
	}

	/**
	 * 
	 * @param traduccionVO
	 */
	public void setTraduccionVO(TraduccionVO traduccionVO) {
		this.traduccionVO = traduccionVO;
	}

}
