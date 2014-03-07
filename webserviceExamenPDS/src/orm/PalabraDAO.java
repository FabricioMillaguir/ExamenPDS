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

public class PalabraDAO {
	public static Palabra loadPalabraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadPalabraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra getPalabraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return getPalabraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra loadPalabraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadPalabraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra getPalabraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return getPalabraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra loadPalabraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Palabra) session.load(orm.Palabra.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra getPalabraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Palabra) session.get(orm.Palabra.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra loadPalabraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Palabra) session.load(orm.Palabra.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra getPalabraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Palabra) session.get(orm.Palabra.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPalabra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return queryPalabra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPalabra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return queryPalabra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra[] listPalabraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return listPalabraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra[] listPalabraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return listPalabraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPalabra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Palabra as Palabra");
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
	
	public static List queryPalabra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Palabra as Palabra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Palabra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra[] listPalabraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPalabra(session, condition, orderBy);
			return (Palabra[]) list.toArray(new Palabra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra[] listPalabraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPalabra(session, condition, orderBy, lockMode);
			return (Palabra[]) list.toArray(new Palabra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra loadPalabraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadPalabraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra loadPalabraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return loadPalabraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra loadPalabraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Palabra[] palabras = listPalabraByQuery(session, condition, orderBy);
		if (palabras != null && palabras.length > 0)
			return palabras[0];
		else
			return null;
	}
	
	public static Palabra loadPalabraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Palabra[] palabras = listPalabraByQuery(session, condition, orderBy, lockMode);
		if (palabras != null && palabras.length > 0)
			return palabras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePalabraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return iteratePalabraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePalabraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPDSPersistentManager.instance().getSession();
			return iteratePalabraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePalabraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Palabra as Palabra");
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
	
	public static java.util.Iterator iteratePalabraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Palabra as Palabra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Palabra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra createPalabra() {
		return new orm.Palabra();
	}
	
	public static boolean save(orm.Palabra palabra) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().saveObject(palabra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Palabra palabra) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().deleteObject(palabra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Palabra palabra)throws PersistentException {
		try {
			orm.Consulta[] lConsultas = palabra.consulta.toArray();
			for(int i = 0; i < lConsultas.length; i++) {
				lConsultas[i].setPalabra(null);
			}
			return delete(palabra);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Palabra palabra, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Consulta[] lConsultas = palabra.consulta.toArray();
			for(int i = 0; i < lConsultas.length; i++) {
				lConsultas[i].setPalabra(null);
			}
			try {
				session.delete(palabra);
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
	
	public static boolean refresh(orm.Palabra palabra) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().getSession().refresh(palabra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Palabra palabra) throws PersistentException {
		try {
			orm.ExamenPDSPersistentManager.instance().getSession().evict(palabra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Palabra loadPalabraByCriteria(PalabraCriteria palabraCriteria) {
		Palabra[] palabras = listPalabraByCriteria(palabraCriteria);
		if(palabras == null || palabras.length == 0) {
			return null;
		}
		return palabras[0];
	}
	
	public static Palabra[] listPalabraByCriteria(PalabraCriteria palabraCriteria) {
		return palabraCriteria.listPalabra();
	}
}
