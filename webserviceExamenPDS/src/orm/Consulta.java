/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import java.io.Serializable;
import javax.persistence.*;
/**
 * Consulta de una palabra
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Consulta")
public class Consulta implements Serializable {
	public Consulta() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CONSULTA_TOKEN) {
			this.token = (orm.Token) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CONSULTA_PALABRA) {
			this.palabra = (orm.Palabra) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CONSULTA_TRADUCCION) {
			this.traduccion = (orm.Traduccion) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_CONSULTA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_CONSULTA_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="fecha", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@ManyToOne(targetEntity=orm.Token.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Tokenid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Token token;
	
	@ManyToOne(targetEntity=orm.Palabra.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Palabraid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Palabra palabra;
	
	@ManyToOne(targetEntity=orm.Traduccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Traduccionid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Traduccion traduccion;
	
	/**
	 * Id de la consulta
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id de la consulta
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Fecha de la consulta
	 */
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	/**
	 * Fecha de la consulta
	 */
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setToken(orm.Token value) {
		if (token != null) {
			token.consulta.remove(this);
		}
		if (value != null) {
			value.consulta.add(this);
		}
	}
	
	public orm.Token getToken() {
		return token;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Token(orm.Token value) {
		this.token = value;
	}
	
	private orm.Token getORM_Token() {
		return token;
	}
	
	public void setPalabra(orm.Palabra value) {
		if (palabra != null) {
			palabra.consulta.remove(this);
		}
		if (value != null) {
			value.consulta.add(this);
		}
	}
	
	public orm.Palabra getPalabra() {
		return palabra;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Palabra(orm.Palabra value) {
		this.palabra = value;
	}
	
	private orm.Palabra getORM_Palabra() {
		return palabra;
	}
	
	public void setTraduccion(orm.Traduccion value) {
		if (traduccion != null) {
			traduccion.consulta.remove(this);
		}
		if (value != null) {
			value.consulta.add(this);
		}
	}
	
	public orm.Traduccion getTraduccion() {
		return traduccion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Traduccion(orm.Traduccion value) {
		this.traduccion = value;
	}
	
	private orm.Traduccion getORM_Traduccion() {
		return traduccion;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
