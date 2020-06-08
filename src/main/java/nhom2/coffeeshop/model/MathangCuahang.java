package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mathang_cuahang database table.
 * 
 */
@Entity
@Table(name="mathang_cuahang")
@NamedQuery(name="MathangCuahang.findAll", query="SELECT m FROM MathangCuahang m")
public class MathangCuahang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idmathangcuahang;

	@Temporal(TemporalType.DATE)
	private Date ngay;

	//bi-directional many-to-one association to Cuahang
	@ManyToOne
	@JoinColumn(name="idcuahang")
	private Cuahang cuahang;

	//bi-directional many-to-one association to Giamgia
	@ManyToOne
	@JoinColumn(name="idgiamgia")
	private Giamgia giamgia;

	//bi-directional many-to-one association to Mathang
	@ManyToOne
	@JoinColumn(name="idmathang")
	private Mathang mathang;

	public MathangCuahang() {
	}

	public long getIdmathangcuahang() {
		return this.idmathangcuahang;
	}

	public void setIdmathangcuahang(long idmathangcuahang) {
		this.idmathangcuahang = idmathangcuahang;
	}

	public Date getNgay() {
		return this.ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	public Cuahang getCuahang() {
		return this.cuahang;
	}

	public void setCuahang(Cuahang cuahang) {
		this.cuahang = cuahang;
	}

	public Giamgia getGiamgia() {
		return this.giamgia;
	}

	public void setGiamgia(Giamgia giamgia) {
		this.giamgia = giamgia;
	}

	public Mathang getMathang() {
		return this.mathang;
	}

	public void setMathang(Mathang mathang) {
		this.mathang = mathang;
	}

}