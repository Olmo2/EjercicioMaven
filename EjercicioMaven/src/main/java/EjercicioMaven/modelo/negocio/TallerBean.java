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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trabajadores")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TallerBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idTaller;
	
	@OneToOne
	@JoinColumn(name="FK_concesionario")
	private ConcesionarioBean concesionario;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private List<ReparacionBean> reparaciones = new ArrayList<ReparacionBean>();

	public long getIdTaller() {
		return idTaller;
	}

	public void setIdTaller(long idTaller) {
		this.idTaller = idTaller;
	}

	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}

	public List<ReparacionBean> getReparaciones() {
		return reparaciones;
	}

	public void setReparaciones(List<ReparacionBean> reparaciones) {
		this.reparaciones = reparaciones;
	}

}
