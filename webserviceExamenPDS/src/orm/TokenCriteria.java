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

public class TokenCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression token;
	public final LongExpression tiempo_inicio;
	
	public TokenCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		token = new StringExpression("token", this);
		tiempo_inicio = new LongExpression("tiempo_inicio", this);
	}
	
	public TokenCriteria(PersistentSession session) {
		this(session.createCriteria(Token.class));
	}
	
	public TokenCriteria() throws PersistentException {
		this(orm.ExamenPDSPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuario"));
	}
	
	public ConsultaCriteria createConsultaCriteria() {
		return new ConsultaCriteria(createCriteria("ORM_consulta"));
	}
	
	public Token uniqueToken() {
		return (Token) super.uniqueResult();
	}
	
	public Token[] listToken() {
		java.util.List list = super.list();
		return (Token[]) list.toArray(new Token[list.size()]);
	}
}

