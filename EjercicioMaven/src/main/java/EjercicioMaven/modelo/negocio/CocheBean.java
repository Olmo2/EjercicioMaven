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
import javax.persistence.Table;



@Entity
@Table(name="coches")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CocheBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idCoche;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="num_bastidor")
	private String bastidor;
	
	@Column (name="modelo")
	private String modelo;
	
	@Column(name="color")
	private String color;
	
	@Column (name="num_plazas")
	private int plazas;
	
	@Column(name="caballos") 
	private int caballos;
	
	@Column(name="num_ejes")
	private int ejes;
	
	@Column(name="precio_minimo")
	private int pvp;
	
	//Un coche esta en muchos concesionarios 
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<ConcesionarioBean> concesionarios = new ArrayList<ConcesionarioBean>();

	public long getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(long idCoche) {
		this.idCoche = idCoche;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public int getPvp() {
		return pvp;
	}

	public void setPvp(int pvp) {
		this.pvp = pvp;
	}

	public List<ConcesionarioBean> getConcesionarios() {
		return concesionarios;
	}

	public void setConcesionarios(List<ConcesionarioBean> concesionarios) {
		this.concesionarios = concesionarios;
	}
}
