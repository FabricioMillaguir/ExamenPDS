/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateExamenPDSData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ExamenPDSPersistentManager.instance().getSession().beginTransaction();
		try {
			/*orm.Usuario lormUsuario = orm.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : token, password, username
			lormUsuario.setUsername("fabricio");
			lormUsuario.setPassword("fabricio");
			orm.UsuarioDAO.save(lormUsuario);
			
			orm.Token lormToken = orm.TokenDAO.createToken();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consulta, usuario, tiempo_inicio, token
			orm.TokenDAO.save(lormToken);
			orm.Palabra lormPalabra = orm.PalabraDAO.createPalabra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consulta, mapudungun, espanol
			orm.PalabraDAO.save(lormPalabra);
			orm.Consulta lormConsulta = orm.ConsultaDAO.createConsulta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : traduccion, palabra, token, fecha
			orm.ConsultaDAO.save(lormConsulta);*/
			orm.Traduccion lormTraduccion = orm.TraduccionDAO.createTraduccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consulta, traduccion
			lormTraduccion.setTraduccion("Mapudungun-Español");
			orm.TraduccionDAO.save(lormTraduccion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateExamenPDSData createExamenPDSData = new CreateExamenPDSData();
			try {
				createExamenPDSData.createTestData();
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
