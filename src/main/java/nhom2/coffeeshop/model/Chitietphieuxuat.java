package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietphieuxuat database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietphieuxuat.findAll", query="SELECT c FROM Chitietphieuxuat c")
public class Chitietphieuxuat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idchitietphieuxuat;

	private long dongiaxuat;

	private long soluongtheochungtu;

	private long soluongthucxuat;

	//bi-directional many-to-one association to Mathang
	@ManyToOne
	@JoinColumn(name="idmathang")
	private Mathang mathang;

	//bi-directional many-to-one association to Phieuxuatkho
	@ManyToOne
	@JoinColumn(name="idphieuxuatkho")
	private Phieuxuatkho phieuxuatkho;

	public Chitietphieuxuat() {
	}

	public long getIdchitietphieuxuat() {
		return this.idchitietphieuxuat;
	}

	public void setIdchitietphieuxuat(long idchitietphieuxuat) {
		this.idchitietphieuxuat = idchitietphieuxuat;
	}

	public long getDongiaxuat() {
		return this.dongiaxuat;
	}

	public void setDongiaxuat(long dongiaxuat) {
		this.dongiaxuat = dongiaxuat;
	}

	public long getSoluongtheochungtu() {
		return this.soluongtheochungtu;
	}

	public void setSoluongtheochungtu(long soluongtheochungtu) {
		this.soluongtheochungtu = soluongtheochungtu;
	}

	public long getSoluongthucxuat() {
		return this.soluongthucxuat;
	}

	public void setSoluongthucxuat(long soluongthucxuat) {
		this.soluongthucxuat = soluongthucxuat;
	}

	public Mathang getMathang() {
		return this.mathang;
	}

	public void setMathang(Mathang mathang) {
		this.mathang = mathang;
	}

	public Phieuxuatkho getPhieuxuatkho() {
		return this.phieuxuatkho;
	}

	public void setPhieuxuatkho(Phieuxuatkho phieuxuatkho) {
		this.phieuxuatkho = phieuxuatkho;
	}

}