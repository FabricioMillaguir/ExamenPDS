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
 * Token
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Token")
public class Token implements Serializable {
	public Token() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TOKEN_CONSULTA) {
			return ORM_consulta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_TOKEN_USUARIO) {
			this.usuario = (orm.Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_TOKEN_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_TOKEN_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="token", nullable=false, unique=true, length=255)	
	private String token;
	
	@Column(name="tiempo_inicio", nullable=false, length=100)	
	private long tiempo_inicio;
	
	@ManyToOne(targetEntity=orm.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuarioid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Usuario usuario;
	
	@OneToMany(mappedBy="token", targetEntity=orm.Consulta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_consulta = new java.util.HashSet();
	
	/**
	 * Id token
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id token
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * token
	 */
	public void setToken(String value) {
		this.token = value;
	}
	
	/**
	 * token
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * tiempo de inicio
	 */
	public void setTiempo_inicio(long value) {
		this.tiempo_inicio = value;
	}
	
	/**
	 * tiempo de inicio
	 */
	public long getTiempo_inicio() {
		return tiempo_inicio;
	}
	
	public void setUsuario(orm.Usuario value) {
		if (usuario != null) {
			usuario.token.remove(this);
		}
		if (value != null) {
			value.token.add(this);
		}
	}
	
	public orm.Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario(orm.Usuario value) {
		this.usuario = value;
	}
	
	private orm.Usuario getORM_Usuario() {
		return usuario;
	}
	
	private void setORM_Consulta(java.util.Set value) {
		this.ORM_consulta = value;
	}
	
	private java.util.Set getORM_Consulta() {
		return ORM_consulta;
	}
	
	@Transient	
	public final orm.ConsultaSetCollection consulta = new orm.ConsultaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TOKEN_CONSULTA, orm.ORMConstants.KEY_CONSULTA_TOKEN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
