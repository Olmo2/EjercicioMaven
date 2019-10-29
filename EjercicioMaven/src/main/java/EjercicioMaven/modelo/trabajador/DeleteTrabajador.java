package EjercicioMaven.modelo.trabajador;

import javax.persistence.EntityManager;

import EjercicioMaven.modelo.negocio.TrabajadorBean;
import EjercicioMaven.util.ConnectionEntityManagerFactory;

public class DeleteTrabajador {
	
	/**
	 * Borra un trabajador
	 * @param trabajador Bean del concesionario a borrar
	 */
	public void delete(TrabajadorBean trabajador) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacci�n
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		TrabajadorBean trabajadorBorrar = entityManager.find(TrabajadorBean.class, trabajador.getIdTrabajador());
		if(trabajadorBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(trabajadorBorrar);
		}
		// Cierra la transacci�n y la conexi�n ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	

}
