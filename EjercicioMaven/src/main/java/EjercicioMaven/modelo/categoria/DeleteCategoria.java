package EjercicioMaven.modelo.categoria;

import javax.persistence.EntityManager;

import EjercicioMaven.negocio.CategoriaBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class DeleteCategoria {
	

	/**
	 * Borra un coche
	 * @param categoria Bean del concesionario a borrar
	 */
	public void delete(CategoriaBean categoria) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacci�n
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		CategoriaBean categoriaBorrar = entityManager.find(CategoriaBean.class, categoria.getIdCategoria());
		if(categoriaBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(categoriaBorrar);
		}
		// Cierra la transacci�n y la conexi�n ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	

}
