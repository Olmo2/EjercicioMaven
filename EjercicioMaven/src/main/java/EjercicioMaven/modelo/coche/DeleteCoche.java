package EjercicioMaven.modelo.coche;

import javax.persistence.EntityManager;

import EjercicioMaven.negocio.CocheBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class DeleteCoche {
	
	/**
	 * Borra un coche
	 * @param coche Bean del concesionario a borrar
	 */
	public void delete(CocheBean coche) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacci�n
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		CocheBean cocheBorrar = entityManager.find(CocheBean.class, coche.getIdCoche());
		if(cocheBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(cocheBorrar);
		}
		// Cierra la transacci�n y la conexi�n ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	

}
