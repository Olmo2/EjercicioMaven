package EjercicioMaven.modelo.reparacion;

import javax.persistence.EntityManager;

import EjercicioMaven.modelo.negocio.ReparacionBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class CreateReparacion {

public void create(ReparacionBean reparacion) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(reparacion);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
