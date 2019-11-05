package EjercicioMaven.modelo.concesionario;

import javax.persistence.EntityManager;

import EjercicioMaven.negocio.ConcesionarioBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;


public class CreateConcesionario {
	
	
public void create(ConcesionarioBean concesionario) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(concesionario);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
