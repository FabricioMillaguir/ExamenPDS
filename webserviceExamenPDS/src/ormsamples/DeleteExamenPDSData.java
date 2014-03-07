/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteExamenPDSData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.ExamenPDSPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			orm.UsuarioDAO.delete(lormUsuario);
			orm.Token lormToken = orm.TokenDAO.loadTokenByQuery(null, null);
			// Delete the persistent object
			orm.TokenDAO.delete(lormToken);
			orm.Palabra lormPalabra = orm.PalabraDAO.loadPalabraByQuery(null, null);
			// Delete the persistent object
			orm.PalabraDAO.delete(lormPalabra);
			orm.Consulta lormConsulta = orm.ConsultaDAO.loadConsultaByQuery(null, null);
			// Delete the persistent object
			orm.ConsultaDAO.delete(lormConsulta);
			orm.Traduccion lormTraduccion = orm.TraduccionDAO.loadTraduccionByQuery(null, null);
			// Delete the persistent object
			orm.TraduccionDAO.delete(lormTraduccion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteExamenPDSData deleteExamenPDSData = new DeleteExamenPDSData();
			try {
				deleteExamenPDSData.deleteTestData();
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
