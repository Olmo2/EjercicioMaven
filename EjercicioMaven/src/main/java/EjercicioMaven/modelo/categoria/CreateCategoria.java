package EjercicioMaven.modelo.categoria;

import javax.persistence.EntityManager;

import EjercicioMaven.modelo.negocio.CategoriaBean;
import EjercicioMaven.modelo.negocio.CocheBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class CreateCategoria {
	
public void create(CategoriaBean categoria) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
