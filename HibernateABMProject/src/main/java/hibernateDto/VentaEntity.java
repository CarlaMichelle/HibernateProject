
package hibernateDto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "venta", uniqueConstraints = {

		@UniqueConstraint(columnNames = "ID"), })

public class VentaEntity implements Serializable {

	private static final long serialVersionUID = -1798070786993154676L;

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	private Integer ventaId;

	@Column(name = "FECHA", unique = false, nullable = false, length = 100)
	private Date fechaVenta;

	@Column(name = "IMPORTE", unique = false, nullable = false, length = 100)
	private float importe;

	@ManyToOne

	@JoinColumn(name = "ID_PERSONA", nullable = true)

	private PersonaEntity persona;

	public Integer getVentaId() {
		return ventaId;
	}

	public void setVentaId(Integer ventaId) {
		this.ventaId = ventaId;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public PersonaEntity getPersona() {
		return persona;
	}

	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}

}