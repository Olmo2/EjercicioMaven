package EjercicioMaven.modelo.reparacion;

import javax.persistence.EntityManager;

import EjercicioMaven.modelo.negocio.ReparacionBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class DeleteReparacion {

	/**
	 * Borra una reparacion
	 * @param reparacion Bean de la reparacion a borrar
	 */
	public void delete(ReparacionBean reparacion) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacción
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		ReparacionBean reparacionBorrar = entityManager.find(ReparacionBean.class, reparacion.getIdReparacion());
		if(reparacionBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(reparacionBorrar);
		}
		// Cierra la transacción y la conexión ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	
}
