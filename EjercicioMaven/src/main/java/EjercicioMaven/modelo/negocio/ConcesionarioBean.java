package EjercicioMaven.modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "concesionarios")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ConcesionarioBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idConcesionario;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "cif")
	private String cif;

	@Column(name = "localidad")
	private String localidad;

	@Column(name = "provincia")
	private String provincia;

	@Column(name = "telefono")
	private int telefono;

	// Trabajan muchos en un solo concesionario
	@OneToMany(mappedBy = "concesionario")
	private List<TrabajadorBean> trabajadores = new ArrayList<TrabajadorBean>();

	// Un concesionario para muchos coches
	@ManyToMany(mappedBy = "concesionarios", cascade = CascadeType.MERGE)
	private List<CocheBean> coches = new ArrayList<CocheBean>();

	public void addTrabajador(TrabajadorBean trabajador) {

		if (!trabajadores.contains(trabajador)) {

			trabajadores.add(trabajador);
			trabajador.setConcesionario(this);
		}
	}

	public void addCoche(CocheBean coche) {

		if (!coches.contains(coche)) {

			coches.add(coche);

			// decirle al coche que añada este concesionario
			List<ConcesionarioBean> concesionarios = coche.getConcesionarios();
			if (!concesionarios.contains(this)) {

				concesionarios.add(this);
			}
		}
	}

	public long getIdConcesionario() {
		return idConcesionario;
	}

	public void setIdConcesionario(long idConcesionario) {
		this.idConcesionario = idConcesionario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<CocheBean> getCoches() {
		return coches;
	}

	public void setCoches(List<CocheBean> coches) {
		this.coches = coches;
	}

}
