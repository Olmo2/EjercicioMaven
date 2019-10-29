package EjercicioMaven.modelo.taller;

import javax.persistence.EntityManager;

import EjercicioMaven.modelo.negocio.TallerBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class DeleteTaller {

	/**
	 * Borra un taller
	 * @param taller Bean del concesionario a borrar
	 */
	public void delete(TallerBean taller) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacción
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		TallerBean tallerBorrar = entityManager.find(TallerBean.class, taller.getIdTaller());
		if(tallerBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(tallerBorrar);
		}
		// Cierra la transacción y la conexión ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
