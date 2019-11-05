package EjercicioMaven.modelo.coche;

import javax.persistence.EntityManager;

import EjercicioMaven.negocio.CocheBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class CreateCoche {
	
public void create(CocheBean coche) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(coche);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
