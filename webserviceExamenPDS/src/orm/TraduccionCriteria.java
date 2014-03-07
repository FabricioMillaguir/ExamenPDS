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

public class TraduccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression traduccion;
	
	public TraduccionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		traduccion = new StringExpression("traduccion", this);
	}
	
	public TraduccionCriteria(PersistentSession session) {
		this(session.createCriteria(Traduccion.class));
	}
	
	public TraduccionCriteria() throws PersistentException {
		this(orm.ExamenPDSPersistentManager.instance().getSession());
	}
	
	public ConsultaCriteria createConsultaCriteria() {
		return new ConsultaCriteria(createCriteria("ORM_consulta"));
	}
	
	public Traduccion uniqueTraduccion() {
		return (Traduccion) super.uniqueResult();
	}
	
	public Traduccion[] listTraduccion() {
		java.util.List list = super.list();
		return (Traduccion[]) list.toArray(new Traduccion[list.size()]);
	}
}

