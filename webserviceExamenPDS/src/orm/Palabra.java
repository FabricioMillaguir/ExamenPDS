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
 * Palabra
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Palabra")
public class Palabra implements Serializable {
	public Palabra() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PALABRA_CONSULTA) {
			return ORM_consulta;
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
	@GeneratedValue(generator="ORM_PALABRA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_PALABRA_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="espanol", nullable=false, length=255)	
	private String espanol;
	
	@Column(name="mapudungun", nullable=false, length=255)	
	private String mapudungun;
	
	@OneToMany(mappedBy="palabra", targetEntity=orm.Consulta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_consulta = new java.util.HashSet();
	
	/**
	 * id de la palabra
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * id de la palabra
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * palabra en idioma espanol
	 */
	public void setEspanol(String value) {
		this.espanol = value;
	}
	
	/**
	 * palabra en idioma espanol
	 */
	public String getEspanol() {
		return espanol;
	}
	
	/**
	 * palabra en mapudungun
	 */
	public void setMapudungun(String value) {
		this.mapudungun = value;
	}
	
	/**
	 * palabra en mapudungun
	 */
	public String getMapudungun() {
		return mapudungun;
	}
	
	private void setORM_Consulta(java.util.Set value) {
		this.ORM_consulta = value;
	}
	
	private java.util.Set getORM_Consulta() {
		return ORM_consulta;
	}
	
	@Transient	
	public final orm.ConsultaSetCollection consulta = new orm.ConsultaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PALABRA_CONSULTA, orm.ORMConstants.KEY_CONSULTA_PALABRA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
