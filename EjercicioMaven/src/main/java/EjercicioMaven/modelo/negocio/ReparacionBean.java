package EjercicioMaven.modelo.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reparaciones")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ReparacionBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idReparacion;
	
	@Column(name="num_bastidor")
	private String bastidor;
	
	@Column (name="modelo")
	private String modelo;
	
	@Column(name="color")
	private String color;
	
	@Column(name="matricula")
	private String matricula;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="presupuesto")
	private int presupuesto;
	
	@Column(name="marca")
	private String marca;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private TallerBean taller;

	public long getIdReparacion() {
		return idReparacion;
	}

	public void setIdReparacion(long idReparacion) {
		this.idReparacion = idReparacion;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TallerBean getTaller() {
		return taller;
	}

	public void setTaller(TallerBean taller) {
		this.taller = taller;
	}
	
}
