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

public class TraduccionDAO {
	public static Traduccion loadTraduccionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadTraduccionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion getTraduccionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return getTraduccionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion loadTraduccionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadTraduccionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion getTraduccionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return getTraduccionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion loadTraduccionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Traduccion) session.load(orm.Traduccion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion getTraduccionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Traduccion) session.get(orm.Traduccion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion loadTraduccionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Traduccion) session.load(orm.Traduccion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion getTraduccionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Traduccion) session.get(orm.Traduccion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTraduccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return queryTraduccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTraduccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return queryTraduccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion[] listTraduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return listTraduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion[] listTraduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return listTraduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTraduccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Traduccion as Traduccion");
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
	
	public static List queryTraduccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Traduccion as Traduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Traduccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion[] listTraduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTraduccion(session, condition, orderBy);
			return (Traduccion[]) list.toArray(new Traduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion[] listTraduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTraduccion(session, condition, orderBy, lockMode);
			return (Traduccion[]) list.toArray(new Traduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion loadTraduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadTraduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion loadTraduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadTraduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion loadTraduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Traduccion[] traduccions = listTraduccionByQuery(session, condition, orderBy);
		if (traduccions != null && traduccions.length > 0)
			return traduccions[0];
		else
			return null;
	}
	
	public static Traduccion loadTraduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Traduccion[] traduccions = listTraduccionByQuery(session, condition, orderBy, lockMode);
		if (traduccions != null && traduccions.length > 0)
			return traduccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTraduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return iterateTraduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTraduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return iterateTraduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTraduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Traduccion as Traduccion");
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
	
	public static java.util.Iterator iterateTraduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Traduccion as Traduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Traduccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion createTraduccion() {
		return new orm.Traduccion();
	}
	
	public static boolean save(orm.Traduccion traduccion) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().saveObject(traduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Traduccion traduccion) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().deleteObject(traduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Traduccion traduccion)throws PersistentException {
		try {
			orm.Consulta[] lConsultas = traduccion.consulta.toArray();
			for(int i = 0; i < lConsultas.length; i++) {
				lConsultas[i].setTraduccion(null);
			}
			return delete(traduccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Traduccion traduccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Consulta[] lConsultas = traduccion.consulta.toArray();
			for(int i = 0; i < lConsultas.length; i++) {
				lConsultas[i].setTraduccion(null);
			}
			try {
				session.delete(traduccion);
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
	
	public static boolean refresh(orm.Traduccion traduccion) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().getSession().refresh(traduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Traduccion traduccion) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().getSession().evict(traduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traduccion loadTraduccionByCriteria(TraduccionCriteria traduccionCriteria) {
		Traduccion[] traduccions = listTraduccionByCriteria(traduccionCriteria);
		if(traduccions == null || traduccions.length == 0) {
			return null;
		}
		return traduccions[0];
	}
	
	public static Traduccion[] listTraduccionByCriteria(TraduccionCriteria traduccionCriteria) {
		return traduccionCriteria.listTraduccion();
	}
}
