package EjercicioMaven.modelo.concesionario;

import javax.persistence.EntityManager;

import EjercicioMaven.negocio.ConcesionarioBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class DeleteConcesionario {
	

	/**
	 * Borra un concesionario
	 * @param concesionario Bean del concesionario a borrar
	 */
	public void delete(ConcesionarioBean concesionario) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacción
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		ConcesionarioBean concesionarioBorrar = entityManager.find(ConcesionarioBean.class, concesionario.getIdConcesionario());
		if(concesionarioBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(concesionarioBorrar);
		}
		// Cierra la transacción y la conexión ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	

}
