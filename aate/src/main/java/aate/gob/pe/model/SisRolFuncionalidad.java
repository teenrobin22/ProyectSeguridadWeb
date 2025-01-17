package aate.gob.pe.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "ACSE_TV_SIS_ROL_FUNC")
@Entity(name = "SisRolFuncionalidad")
public class SisRolFuncionalidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACSE_SQ_SISROLFUN")
    @SequenceGenerator(sequenceName = "ACSE_SQ_SISROLFUN", allocationSize = 1, name = "ACSE_SQ_SISROLFUN")
	@Column(name = "SISROLFUNCOD")
	private Integer SISROLFUNCOD;
	
	@ManyToOne
	@JoinColumn(name = "ROLCOD", nullable = false, foreignKey = @ForeignKey(name = "FK_ACSE_ROLFUN_TM_ROL"))
	private Rol rol;

	@ManyToOne
	@JoinColumn(name = "FUNCOD", nullable = false, foreignKey = @ForeignKey(name = "FK_ROLFUN_FUN"))
	private Funcionalidad funcionalidad;
	
	@Column(name = "SISCOD")
	private Integer SISCOD;
	
	@Column(name = "USUREG", nullable = true, length = 30)
	private String USUREG;
	@Column(name = "FECREG", nullable = true)
	private LocalDate FECREG = LocalDate.now();
	@Column(name = "USUMOD", nullable = true, length = 30)
	private String USUMOD;
	@Column(name = "FECMOD", nullable = true)
	private LocalDate FECMOD;
	@Column(name = "ESTREG")
	private char ESTREG;

	public Integer getSISROLFUNCOD() {
		return SISROLFUNCOD;
	}
	public void setSISROLFUNCOD(Integer sISROLFUNCOD) {
		SISROLFUNCOD = sISROLFUNCOD;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Integer getSISCOD() {
		return SISCOD;
	}
	public void setSISCOD(Integer sISCOD) {
		SISCOD = sISCOD;
	}
	public Funcionalidad getFuncionalidad() {
		return funcionalidad;
	}
	public void setFuncionalidad(Funcionalidad funcionalidad) {
		this.funcionalidad = funcionalidad;
	}
	public String getUSUREG() {
		return USUREG;
	}
	public void setUSUREG(String uSUREG) {
		USUREG = uSUREG;
	}
	public LocalDate getFECREG() {
		return FECREG;
	}
	public void setFECREG(LocalDate fECREG) {
		FECREG = fECREG;
	}
	public String getUSUMOD() {
		return USUMOD;
	}
	public void setUSUMOD(String uSUMOD) {
		USUMOD = uSUMOD;
	}
	public LocalDate getFECMOD() {
		return FECMOD;
	}
	public void setFECMOD(LocalDate fECMOD) {
		FECMOD = fECMOD;
	}
	public char getESTREG() {
		return ESTREG;
	}
	public void setESTREG(char eSTREG) {
		ESTREG = eSTREG;
	}
	
	
}
