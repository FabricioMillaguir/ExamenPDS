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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TokenDAO {
	public static Token loadTokenByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadTokenByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token getTokenByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return getTokenByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token loadTokenByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadTokenByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token getTokenByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return getTokenByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token loadTokenByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Token) session.load(orm.Token.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token getTokenByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Token) session.get(orm.Token.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token loadTokenByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Token) session.load(orm.Token.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token getTokenByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Token) session.get(orm.Token.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryToken(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return queryToken(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryToken(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return queryToken(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token[] listTokenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return listTokenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token[] listTokenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return listTokenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryToken(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Token as Token");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryToken(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Token as Token");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Token", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token[] listTokenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryToken(session, condition, orderBy);
			return (Token[]) list.toArray(new Token[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token[] listTokenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryToken(session, condition, orderBy, lockMode);
			return (Token[]) list.toArray(new Token[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token loadTokenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadTokenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token loadTokenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadTokenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token loadTokenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Token[] tokens = listTokenByQuery(session, condition, orderBy);
		if (tokens != null && tokens.length > 0)
			return tokens[0];
		else
			return null;
	}
	
	public static Token loadTokenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Token[] tokens = listTokenByQuery(session, condition, orderBy, lockMode);
		if (tokens != null && tokens.length > 0)
			return tokens[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTokenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return iterateTokenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTokenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return iterateTokenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTokenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Token as Token");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTokenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Token as Token");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Token", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token createToken() {
		return new orm.Token();
	}
	
	public static boolean save(orm.Token token) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().saveObject(token);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Token token) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().deleteObject(token);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Token token)throws PersistentException {
		try {
			if(token.getUsuario() != null) {
				token.getUsuario().token.remove(token);
			}
			
			orm.Consulta[] lConsultas = token.consulta.toArray();
			for(int i = 0; i < lConsultas.length; i++) {
				lConsultas[i].setToken(null);
			}
			return delete(token);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Token token, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(token.getUsuario() != null) {
				token.getUsuario().token.remove(token);
			}
			
			orm.Consulta[] lConsultas = token.consulta.toArray();
			for(int i = 0; i < lConsultas.length; i++) {
				lConsultas[i].setToken(null);
			}
			try {
				session.delete(token);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Token token) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().getSession().refresh(token);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Token token) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().getSession().evict(token);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Token loadTokenByCriteria(TokenCriteria tokenCriteria) {
		Token[] tokens = listTokenByCriteria(tokenCriteria);
		if(tokens == null || tokens.length == 0) {
			return null;
		}
		return tokens[0];
	}
	
	public static Token[] listTokenByCriteria(TokenCriteria tokenCriteria) {
		return tokenCriteria.listToken();
	}
}
