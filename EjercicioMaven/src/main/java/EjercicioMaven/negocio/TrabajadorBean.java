package EjercicioMaven.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trabajadores")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TrabajadorBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idTrabajador;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "dni")
	private String dni;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "localidad")
	private String localidad;

	@Column(name = "provincia")
	private String provincia;

	@Column(name = "telefono")
	private int telefono;

	@Column(name = "salario_base")
	private int salario;

	// Un trabajador solo trabaja en un concesionario
	@ManyToOne(cascade = CascadeType.MERGE)
	private ConcesionarioBean concesionario;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private CategoriaBean categoria;

	public CategoriaBean getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaBean categoria) {
		this.categoria = categoria;
	}

	public long getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(long idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}

}
