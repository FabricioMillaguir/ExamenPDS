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

public class ConsultaDAO {
	public static Consulta loadConsultaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadConsultaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta getConsultaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return getConsultaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta loadConsultaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadConsultaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta getConsultaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return getConsultaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta loadConsultaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Consulta) session.load(orm.Consulta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta getConsultaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Consulta) session.get(orm.Consulta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta loadConsultaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Consulta) session.load(orm.Consulta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta getConsultaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Consulta) session.get(orm.Consulta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsulta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return queryConsulta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsulta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return queryConsulta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta[] listConsultaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return listConsultaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta[] listConsultaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return listConsultaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsulta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Consulta as Consulta");
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
	
	public static List queryConsulta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Consulta as Consulta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Consulta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta[] listConsultaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryConsulta(session, condition, orderBy);
			return (Consulta[]) list.toArray(new Consulta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta[] listConsultaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryConsulta(session, condition, orderBy, lockMode);
			return (Consulta[]) list.toArray(new Consulta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta loadConsultaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadConsultaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta loadConsultaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadConsultaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta loadConsultaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Consulta[] consultas = listConsultaByQuery(session, condition, orderBy);
		if (consultas != null && consultas.length > 0)
			return consultas[0];
		else
			return null;
	}
	
	public static Consulta loadConsultaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Consulta[] consultas = listConsultaByQuery(session, condition, orderBy, lockMode);
		if (consultas != null && consultas.length > 0)
			return consultas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateConsultaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return iterateConsultaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConsultaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return iterateConsultaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConsultaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Consulta as Consulta");
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
	
	public static java.util.Iterator iterateConsultaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Consulta as Consulta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Consulta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta createConsulta() {
		return new orm.Consulta();
	}
	
	public static boolean save(orm.Consulta consulta) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().saveObject(consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Consulta consulta) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().deleteObject(consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Consulta consulta)throws PersistentException {
		try {
			if(consulta.getToken() != null) {
				consulta.getToken().consulta.remove(consulta);
			}
			
			if(consulta.getPalabra() != null) {
				consulta.getPalabra().consulta.remove(consulta);
			}
			
			if(consulta.getTraduccion() != null) {
				consulta.getTraduccion().consulta.remove(consulta);
			}
			
			return delete(consulta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Consulta consulta, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(consulta.getToken() != null) {
				consulta.getToken().consulta.remove(consulta);
			}
			
			if(consulta.getPalabra() != null) {
				consulta.getPalabra().consulta.remove(consulta);
			}
			
			if(consulta.getTraduccion() != null) {
				consulta.getTraduccion().consulta.remove(consulta);
			}
			
			try {
				session.delete(consulta);
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
	
	public static boolean refresh(orm.Consulta consulta) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().getSession().refresh(consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Consulta consulta) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().getSession().evict(consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consulta loadConsultaByCriteria(ConsultaCriteria consultaCriteria) {
		Consulta[] consultas = listConsultaByCriteria(consultaCriteria);
		if(consultas == null || consultas.length == 0) {
			return null;
		}
		return consultas[0];
	}
	
	public static Consulta[] listConsultaByCriteria(ConsultaCriteria consultaCriteria) {
		return consultaCriteria.listConsulta();
	}
}
