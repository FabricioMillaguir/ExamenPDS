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
 * Usuario
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario")
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_USUARIO_TOKEN) {
			return ORM_token;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_USUARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_USUARIO_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="username", nullable=false, unique=true, length=255)	
	private String username;
	
	@Column(name="password", nullable=false, length=255)	
	private String password;
	
	@OneToMany(mappedBy="usuario", targetEntity=orm.Token.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_token = new java.util.HashSet();
	
	/**
	 * Id Usuario
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id Usuario
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Username
	 */
	public void setUsername(String value) {
		this.username = value;
	}
	
	/**
	 * Username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Password
	 */
	public void setPassword(String value) {
		this.password = value;
	}
	
	/**
	 * Password
	 */
	public String getPassword() {
		return password;
	}
	
	private void setORM_Token(java.util.Set value) {
		this.ORM_token = value;
	}
	
	private java.util.Set getORM_Token() {
		return ORM_token;
	}
	
	@Transient	
	public final orm.TokenSetCollection token = new orm.TokenSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_USUARIO_TOKEN, orm.ORMConstants.KEY_TOKEN_USUARIO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
