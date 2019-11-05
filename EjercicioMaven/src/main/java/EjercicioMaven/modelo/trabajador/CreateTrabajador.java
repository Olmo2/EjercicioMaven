package EjercicioMaven.modelo.trabajador;

import javax.persistence.EntityManager;

import EjercicioMaven.negocio.TrabajadorBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class CreateTrabajador {

public void create(TrabajadorBean trabajador) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(trabajador);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
