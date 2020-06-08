package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitiethoadon database table.
 * 
 */
@Entity
@NamedQuery(name="Chitiethoadon.findAll", query="SELECT c FROM Chitiethoadon c")
public class Chitiethoadon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idchitiethoadon;

	private float giatienbandau;

	private float giatienhientai;

	private long soluong;

	private float thanhtien;

	//bi-directional many-to-one association to Hoadon
	@ManyToOne
	@JoinColumn(name="idhoadon")
	private Hoadon hoadon;

	//bi-directional many-to-one association to Mathang
	@ManyToOne
	@JoinColumn(name="idmathang")
	private Mathang mathang;

	public Chitiethoadon() {
	}

	public long getIdchitiethoadon() {
		return this.idchitiethoadon;
	}

	public void setIdchitiethoadon(long idchitiethoadon) {
		this.idchitiethoadon = idchitiethoadon;
	}

	public float getGiatienbandau() {
		return this.giatienbandau;
	}

	public void setGiatienbandau(float giatienbandau) {
		this.giatienbandau = giatienbandau;
	}

	public float getGiatienhientai() {
		return this.giatienhientai;
	}

	public void setGiatienhientai(float giatienhientai) {
		this.giatienhientai = giatienhientai;
	}

	public long getSoluong() {
		return this.soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public float getThanhtien() {
		return this.thanhtien;
	}

	public void setThanhtien(float thanhtien) {
		this.thanhtien = thanhtien;
	}

	public Hoadon getHoadon() {
		return this.hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}

	public Mathang getMathang() {
		return this.mathang;
	}

	public void setMathang(Mathang mathang) {
		this.mathang = mathang;
	}

}