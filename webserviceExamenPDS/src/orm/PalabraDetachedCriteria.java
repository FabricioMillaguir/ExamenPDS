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

public class PalabraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression espanol;
	public final StringExpression mapudungun;
	
	public PalabraDetachedCriteria() {
		super(orm.Palabra.class, orm.PalabraCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		espanol = new StringExpression("espanol", this.getDetachedCriteria());
		mapudungun = new StringExpression("mapudungun", this.getDetachedCriteria());
	}
	
	public PalabraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PalabraCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		espanol = new StringExpression("espanol", this.getDetachedCriteria());
		mapudungun = new StringExpression("mapudungun", this.getDetachedCriteria());
	}
	
	public ConsultaDetachedCriteria createConsultaCriteria() {
		return new ConsultaDetachedCriteria(createCriteria("ORM_consulta"));
	}
	
	public Palabra uniquePalabra(PersistentSession session) {
		return (Palabra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Palabra[] listPalabra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Palabra[]) list.toArray(new Palabra[list.size()]);
	}
}

