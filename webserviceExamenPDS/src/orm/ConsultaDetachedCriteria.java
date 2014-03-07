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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ConsultaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final DateExpression fecha;
	
	public ConsultaDetachedCriteria() {
		super(orm.Consulta.class, orm.ConsultaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public ConsultaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ConsultaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public TokenDetachedCriteria createTokenCriteria() {
		return new TokenDetachedCriteria(createCriteria("token"));
	}
	
	public PalabraDetachedCriteria createPalabraCriteria() {
		return new PalabraDetachedCriteria(createCriteria("palabra"));
	}
	
	public TraduccionDetachedCriteria createTraduccionCriteria() {
		return new TraduccionDetachedCriteria(createCriteria("traduccion"));
	}
	
	public Consulta uniqueConsulta(PersistentSession session) {
		return (Consulta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Consulta[] listConsulta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Consulta[]) list.toArray(new Consulta[list.size()]);
	}
}

