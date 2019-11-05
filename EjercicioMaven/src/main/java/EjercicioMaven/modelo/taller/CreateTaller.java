package EjercicioMaven.modelo.taller;

import javax.persistence.EntityManager;

import EjercicioMaven.negocio.TallerBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class CreateTaller {

public void create(TallerBean taller) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(taller);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
