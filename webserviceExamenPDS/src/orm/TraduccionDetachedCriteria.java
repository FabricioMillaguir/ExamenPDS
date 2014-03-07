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

public class TraduccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression traduccion;
	
	public TraduccionDetachedCriteria() {
		super(orm.Traduccion.class, orm.TraduccionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		traduccion = new StringExpression("traduccion", this.getDetachedCriteria());
	}
	
	public TraduccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.TraduccionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		traduccion = new StringExpression("traduccion", this.getDetachedCriteria());
	}
	
	public ConsultaDetachedCriteria createConsultaCriteria() {
		return new ConsultaDetachedCriteria(createCriteria("ORM_consulta"));
	}
	
	public Traduccion uniqueTraduccion(PersistentSession session) {
		return (Traduccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Traduccion[] listTraduccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Traduccion[]) list.toArray(new Traduccion[list.size()]);
	}
}

