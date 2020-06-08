package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietphieunhap database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietphieunhap.findAll", query="SELECT c FROM Chitietphieunhap c")
public class Chitietphieunhap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idchitietphieunhap;

	private float dongia;

	private long soluongtheochungtu;

	private long soluongthucxuat;

	private float thanhtien;

	//bi-directional many-to-one association to Mathang
	@ManyToOne
	@JoinColumn(name="idmathang")
	private Mathang mathang;

	//bi-directional many-to-one association to Phieunhapkho
	@ManyToOne
	@JoinColumn(name="idphieunhapkho")
	private Phieunhapkho phieunhapkho;

	public Chitietphieunhap() {
	}

	public long getIdchitietphieunhap() {
		return this.idchitietphieunhap;
	}

	public void setIdchitietphieunhap(long idchitietphieunhap) {
		this.idchitietphieunhap = idchitietphieunhap;
	}

	public float getDongia() {
		return this.dongia;
	}

	public void setDongia(float dongia) {
		this.dongia = dongia;
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

	public float getThanhtien() {
		return this.thanhtien;
	}

	public void setThanhtien(float thanhtien) {
		this.thanhtien = thanhtien;
	}

	public Mathang getMathang() {
		return this.mathang;
	}

	public void setMathang(Mathang mathang) {
		this.mathang = mathang;
	}

	public Phieunhapkho getPhieunhapkho() {
		return this.phieunhapkho;
	}

	public void setPhieunhapkho(Phieunhapkho phieunhapkho) {
		this.phieunhapkho = phieunhapkho;
	}

}