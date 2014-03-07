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

public class ConsultaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final DateExpression fecha;
	
	public ConsultaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fecha = new DateExpression("fecha", this);
	}
	
	public ConsultaCriteria(PersistentSession session) {
		this(session.createCriteria(Consulta.class));
	}
	
	public ConsultaCriteria() throws PersistentException {
		this(orm.ExamenPDSPersistentManager.instance().getSession());
	}
	
	public TokenCriteria createTokenCriteria() {
		return new TokenCriteria(createCriteria("token"));
	}
	
	public PalabraCriteria createPalabraCriteria() {
		return new PalabraCriteria(createCriteria("palabra"));
	}
	
	public TraduccionCriteria createTraduccionCriteria() {
		return new TraduccionCriteria(createCriteria("traduccion"));
	}
	
	public Consulta uniqueConsulta() {
		return (Consulta) super.uniqueResult();
	}
	
	public Consulta[] listConsulta() {
		java.util.List list = super.list();
		return (Consulta[]) list.toArray(new Consulta[list.size()]);
	}
}

