/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListExamenPDSData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		orm.Usuario[] ormUsuarios = orm.UsuarioDAO.listUsuarioByQuery(null, null);
		int length = Math.min(ormUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Token...");
		orm.Token[] ormTokens = orm.TokenDAO.listTokenByQuery(null, null);
		length = Math.min(ormTokens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTokens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Palabra...");
		orm.Palabra[] ormPalabras = orm.PalabraDAO.listPalabraByQuery(null, null);
		length = Math.min(ormPalabras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPalabras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Consulta...");
		orm.Consulta[] ormConsultas = orm.ConsultaDAO.listConsultaByQuery(null, null);
		length = Math.min(ormConsultas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormConsultas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Traduccion...");
		orm.Traduccion[] ormTraduccions = orm.TraduccionDAO.listTraduccionByQuery(null, null);
		length = Math.min(ormTraduccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTraduccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Usuario by Criteria...");
		orm.UsuarioCriteria lormUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormUsuarioCriteria.id.eq();
		lormUsuarioCriteria.setMaxResults(ROW_COUNT);
		orm.Usuario[] ormUsuarios = lormUsuarioCriteria.listUsuario();
		int length =ormUsuarios== null ? 0 : Math.min(ormUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Token by Criteria...");
		orm.TokenCriteria lormTokenCriteria = new orm.TokenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormTokenCriteria.id.eq();
		lormTokenCriteria.setMaxResults(ROW_COUNT);
		orm.Token[] ormTokens = lormTokenCriteria.listToken();
		length =ormTokens== null ? 0 : Math.min(ormTokens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormTokens[i]);
		}
		System.out.println(length + " Token record(s) retrieved."); 
		
		System.out.println("Listing Palabra by Criteria...");
		orm.PalabraCriteria lormPalabraCriteria = new orm.PalabraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPalabraCriteria.id.eq();
		lormPalabraCriteria.setMaxResults(ROW_COUNT);
		orm.Palabra[] ormPalabras = lormPalabraCriteria.listPalabra();
		length =ormPalabras== null ? 0 : Math.min(ormPalabras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPalabras[i]);
		}
		System.out.println(length + " Palabra record(s) retrieved."); 
		
		System.out.println("Listing Consulta by Criteria...");
		orm.ConsultaCriteria lormConsultaCriteria = new orm.ConsultaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormConsultaCriteria.id.eq();
		lormConsultaCriteria.setMaxResults(ROW_COUNT);
		orm.Consulta[] ormConsultas = lormConsultaCriteria.listConsulta();
		length =ormConsultas== null ? 0 : Math.min(ormConsultas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormConsultas[i]);
		}
		System.out.println(length + " Consulta record(s) retrieved."); 
		
		System.out.println("Listing Traduccion by Criteria...");
		orm.TraduccionCriteria lormTraduccionCriteria = new orm.TraduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormTraduccionCriteria.id.eq();
		lormTraduccionCriteria.setMaxResults(ROW_COUNT);
		orm.Traduccion[] ormTraduccions = lormTraduccionCriteria.listTraduccion();
		length =ormTraduccions== null ? 0 : Math.min(ormTraduccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormTraduccions[i]);
		}
		System.out.println(length + " Traduccion record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListExamenPDSData listExamenPDSData = new ListExamenPDSData();
			try {
				listExamenPDSData.listTestData();
				//listExamenPDSData.listByCriteria();
			}
			finally {
				orm.ExamenPDSPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
