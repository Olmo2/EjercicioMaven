package EjercicioMaven.modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CategoriaBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idCategoria;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "plus")
	private int plus;

	// muchos empleados pueden tener la misma categoria
	@OneToMany(mappedBy = "categoria")
	private List<TrabajadorBean> trabajadores = new ArrayList<TrabajadorBean>();

	public void addTrabajador(TrabajadorBean trabajador) {

		if (!trabajadores.contains(trabajador)) {

			trabajadores.add(trabajador);
			trabajador.setCategoria(this);
		}
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}

	public List<TrabajadorBean> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<TrabajadorBean> trabajadores) {
		this.trabajadores = trabajadores;
	}

}
