/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateExamenPDSData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ExamenPDSPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			orm.UsuarioDAO.save(lormUsuario);
			orm.Token lormToken = orm.TokenDAO.loadTokenByQuery(null, null);
			// Update the properties of the persistent object
			orm.TokenDAO.save(lormToken);
			orm.Palabra lormPalabra = orm.PalabraDAO.loadPalabraByQuery(null, null);
			// Update the properties of the persistent object
			orm.PalabraDAO.save(lormPalabra);
			orm.Consulta lormConsulta = orm.ConsultaDAO.loadConsultaByQuery(null, null);
			// Update the properties of the persistent object
			orm.ConsultaDAO.save(lormConsulta);
			orm.Traduccion lormTraduccion = orm.TraduccionDAO.loadTraduccionByQuery(null, null);
			// Update the properties of the persistent object
			orm.TraduccionDAO.save(lormTraduccion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		orm.UsuarioCriteria lormUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormUsuarioCriteria.id.eq();
		System.out.println(lormUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Token by TokenCriteria");
		orm.TokenCriteria lormTokenCriteria = new orm.TokenCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormTokenCriteria.id.eq();
		System.out.println(lormTokenCriteria.uniqueToken());
		
		System.out.println("Retrieving Palabra by PalabraCriteria");
		orm.PalabraCriteria lormPalabraCriteria = new orm.PalabraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPalabraCriteria.id.eq();
		System.out.println(lormPalabraCriteria.uniquePalabra());
		
		System.out.println("Retrieving Consulta by ConsultaCriteria");
		orm.ConsultaCriteria lormConsultaCriteria = new orm.ConsultaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormConsultaCriteria.id.eq();
		System.out.println(lormConsultaCriteria.uniqueConsulta());
		
		System.out.println("Retrieving Traduccion by TraduccionCriteria");
		orm.TraduccionCriteria lormTraduccionCriteria = new orm.TraduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormTraduccionCriteria.id.eq();
		System.out.println(lormTraduccionCriteria.uniqueTraduccion());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateExamenPDSData retrieveAndUpdateExamenPDSData = new RetrieveAndUpdateExamenPDSData();
			try {
				retrieveAndUpdateExamenPDSData.retrieveAndUpdateTestData();
				//retrieveAndUpdateExamenPDSData.retrieveByCriteria();
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
