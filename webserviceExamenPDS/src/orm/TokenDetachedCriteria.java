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

public class TokenDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression token;
	public final LongExpression tiempo_inicio;
	
	public TokenDetachedCriteria() {
		super(orm.Token.class, orm.TokenCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		token = new StringExpression("token", this.getDetachedCriteria());
		tiempo_inicio = new LongExpression("tiempo_inicio", this.getDetachedCriteria());
	}
	
	public TokenDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.TokenCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		token = new StringExpression("token", this.getDetachedCriteria());
		tiempo_inicio = new LongExpression("tiempo_inicio", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario"));
	}
	
	public ConsultaDetachedCriteria createConsultaCriteria() {
		return new ConsultaDetachedCriteria(createCriteria("ORM_consulta"));
	}
	
	public Token uniqueToken(PersistentSession session) {
		return (Token) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Token[] listToken(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Token[]) list.toArray(new Token[list.size()]);
	}
}

