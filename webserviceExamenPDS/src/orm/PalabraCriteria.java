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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PalabraCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression espanol;
	public final StringExpression mapudungun;
	
	public PalabraCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		espanol = new StringExpression("espanol", this);
		mapudungun = new StringExpression("mapudungun", this);
	}
	
	public PalabraCriteria(PersistentSession session) {
		this(session.createCriteria(Palabra.class));
	}
	
	public PalabraCriteria() throws PersistentException {
		this(orm.ExamenPDSPersistentManager.instance().getSession());
	}
	
	public ConsultaCriteria createConsultaCriteria() {
		return new ConsultaCriteria(createCriteria("ORM_consulta"));
	}
	
	public Palabra uniquePalabra() {
		return (Palabra) super.uniqueResult();
	}
	
	public Palabra[] listPalabra() {
		java.util.List list = super.list();
		return (Palabra[]) list.toArray(new Palabra[list.size()]);
	}
}

