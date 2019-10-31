package EjercicioMaven.inicio;

import EjercicioMaven.modelo.categoria.CreateCategoria;
import EjercicioMaven.modelo.coche.CreateCoche;
import EjercicioMaven.modelo.concesionario.CreateConcesionario;
import EjercicioMaven.modelo.negocio.CategoriaBean;
import EjercicioMaven.modelo.negocio.CocheBean;
import EjercicioMaven.modelo.negocio.ConcesionarioBean;
import EjercicioMaven.modelo.negocio.ReparacionBean;
import EjercicioMaven.modelo.negocio.TallerBean;
import EjercicioMaven.modelo.negocio.TrabajadorBean;
import EjercicioMaven.modelo.reparacion.CreateReparacion;
import EjercicioMaven.modelo.taller.CreateTaller;
import EjercicioMaven.modelo.trabajador.CreateTrabajador;

public class Start {

	public static void main(String[] args) {

		/*
		 * ********************************
		 * C R E A N D O    O B J E T O S
		 * ********************************
		 */

		ConcesionarioBean cochesPaco = new ConcesionarioBean();
		cochesPaco.setNombre("Coches Paco");

		ConcesionarioBean autosJuan = new ConcesionarioBean();
		autosJuan.setNombre("Autos Juan");

		ConcesionarioBean vehiculosPedro = new ConcesionarioBean();
		vehiculosPedro.setNombre("Vehiculos Pedro");
		
		

		CocheBean fordfiesta = new CocheBean();
		fordfiesta.setNombre("Ford Fiesta");

		CocheBean c3aircross = new CocheBean();
		c3aircross.setNombre("C3 Aircross");
		
		CocheBean c4cactus = new CocheBean();
		c4cactus.setNombre("C4 Cactus");
		
		CocheBean czero = new CocheBean();
		czero.setNombre("C-Zero");
		
		

		TrabajadorBean antonio = new TrabajadorBean();
		antonio.setNombre("Antonio");
//		antonio.setConcesionario(cochesPaco);

		TrabajadorBean luis = new TrabajadorBean();
		luis.setNombre("Luis");
//		luis.setConcesionario(cochesPaco);

		TrabajadorBean ana = new TrabajadorBean();
		ana.setNombre("Ana");
//		ana.setConcesionario(vehiculosPedro);
		
		CategoriaBean gerente= new CategoriaBean();
		gerente.setNombre("Gerente");
		gerente.setPlus(500);
		
		CategoriaBean responsable= new CategoriaBean();
		responsable.setNombre("Responsable");
		responsable.setPlus(350);
		
		CategoriaBean jefetaller= new CategoriaBean();
		jefetaller.setNombre("Jefe De Taller");
		jefetaller.setPlus(250);
		
		CategoriaBean mecanico= new CategoriaBean();
		mecanico.setNombre("Mecanico");
		mecanico.setPlus(150);
		
		CategoriaBean vendedor= new CategoriaBean();
		vendedor.setNombre("Vendedor");
		vendedor.setPlus(150);
		
		CategoriaBean aprendiz= new CategoriaBean();
		aprendiz.setNombre("Aprendiz");
		aprendiz.setPlus(0);
		
		
		
		
		TallerBean ada = new TallerBean();
		ada.setConcesionario(cochesPaco);
		
		ReparacionBean reparacion1 = new ReparacionBean();
		reparacion1.setModelo("Ford Mierda GTI");
		
		
		/*
		 * **************************************************
		 * A Ñ A D I E N D O    I N F O R M A C I Ó N
		 * **************************************************
		 */		

		cochesPaco.addCoche(fordfiesta);
		vehiculosPedro.addCoche(c3aircross);
		autosJuan.addCoche(c4cactus);
		cochesPaco.addCoche(czero);
		
		gerente.addTrabajador(luis);
		vendedor.addTrabajador(ana);
		jefetaller.addTrabajador(antonio);
		
		
		cochesPaco.addTrabajador(antonio);
		cochesPaco.addTrabajador(ana);
		autosJuan.addTrabajador(luis);
		
		ada.addReparacion(reparacion1);
	
		
		
		/*
		 * **************************************************
		 * P E R S I S T I E N D O    L O S     D A T O S
		 * **************************************************
		 */
		
		
		CreateConcesionario createConcesionario = new CreateConcesionario();
		createConcesionario.create(cochesPaco);
		createConcesionario.create(vehiculosPedro);
		createConcesionario.create(autosJuan);
		
		CreateCoche createCoche = new CreateCoche();
		createCoche.create(fordfiesta);
		createCoche.create(c3aircross);
		createCoche.create(c4cactus);
		createCoche.create(czero);
		
		CreateCategoria createCategoria = new CreateCategoria();
		createCategoria.create(gerente);
		createCategoria.create(responsable);
		createCategoria.create(jefetaller);
		createCategoria.create(mecanico);
		createCategoria.create(vendedor);
		createCategoria.create(aprendiz);
		
		
		CreateTrabajador createTrabajdor= new CreateTrabajador();
		createTrabajdor.create(ana);
		createTrabajdor.create(antonio);
		createTrabajdor.create(luis);
		
		
		CreateTaller createTaller= new CreateTaller();
		createTaller.create(ada);
		
		CreateReparacion createReparacion= new CreateReparacion();
		createReparacion.create(reparacion1);
		
		
		
		
		

	}

}
