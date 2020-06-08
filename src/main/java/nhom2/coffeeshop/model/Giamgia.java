package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the giamgia database table.
 * 
 */
@Entity
@NamedQuery(name="Giamgia.findAll", query="SELECT g FROM Giamgia g")
public class Giamgia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idgiamgia;

	private String mota;

	private float phantram;

	private long sotien;

	//bi-directional many-to-one association to Hoadon
	@OneToMany(mappedBy="giamgia", cascade={CascadeType.ALL})
	private List<Hoadon> hoadons;

	//bi-directional many-to-one association to KhachhangGiamgia
	@OneToMany(mappedBy="giamgia", cascade={CascadeType.ALL})
	private List<KhachhangGiamgia> khachhangGiamgias;

	//bi-directional many-to-one association to LoaikhachhangGiamgia
	@OneToMany(mappedBy="giamgia", cascade={CascadeType.ALL})
	private List<LoaikhachhangGiamgia> loaikhachhangGiamgias;

	//bi-directional many-to-one association to MathangCuahang
	@OneToMany(mappedBy="giamgia", cascade={CascadeType.ALL})
	private List<MathangCuahang> mathangCuahangs;

	public Giamgia() {
	}

	public long getIdgiamgia() {
		return this.idgiamgia;
	}

	public void setIdgiamgia(long idgiamgia) {
		this.idgiamgia = idgiamgia;
	}

	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public float getPhantram() {
		return this.phantram;
	}

	public void setPhantram(float phantram) {
		this.phantram = phantram;
	}

	public long getSotien() {
		return this.sotien;
	}

	public void setSotien(long sotien) {
		this.sotien = sotien;
	}

	@JsonIgnore
	public List<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(List<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

	public Hoadon addHoadon(Hoadon hoadon) {
		getHoadons().add(hoadon);
		hoadon.setGiamgia(this);

		return hoadon;
	}

	public Hoadon removeHoadon(Hoadon hoadon) {
		getHoadons().remove(hoadon);
		hoadon.setGiamgia(null);

		return hoadon;
	}

	@JsonIgnore
	public List<KhachhangGiamgia> getKhachhangGiamgias() {
		return this.khachhangGiamgias;
	}

	public void setKhachhangGiamgias(List<KhachhangGiamgia> khachhangGiamgias) {
		this.khachhangGiamgias = khachhangGiamgias;
	}

	public KhachhangGiamgia addKhachhangGiamgia(KhachhangGiamgia khachhangGiamgia) {
		getKhachhangGiamgias().add(khachhangGiamgia);
		khachhangGiamgia.setGiamgia(this);

		return khachhangGiamgia;
	}

	public KhachhangGiamgia removeKhachhangGiamgia(KhachhangGiamgia khachhangGiamgia) {
		getKhachhangGiamgias().remove(khachhangGiamgia);
		khachhangGiamgia.setGiamgia(null);

		return khachhangGiamgia;
	}

	@JsonIgnore
	public List<LoaikhachhangGiamgia> getLoaikhachhangGiamgias() {
		return this.loaikhachhangGiamgias;
	}

	public void setLoaikhachhangGiamgias(List<LoaikhachhangGiamgia> loaikhachhangGiamgias) {
		this.loaikhachhangGiamgias = loaikhachhangGiamgias;
	}

	public LoaikhachhangGiamgia addLoaikhachhangGiamgia(LoaikhachhangGiamgia loaikhachhangGiamgia) {
		getLoaikhachhangGiamgias().add(loaikhachhangGiamgia);
		loaikhachhangGiamgia.setGiamgia(this);

		return loaikhachhangGiamgia;
	}

	public LoaikhachhangGiamgia removeLoaikhachhangGiamgia(LoaikhachhangGiamgia loaikhachhangGiamgia) {
		getLoaikhachhangGiamgias().remove(loaikhachhangGiamgia);
		loaikhachhangGiamgia.setGiamgia(null);

		return loaikhachhangGiamgia;
	}

	@JsonIgnore
	public List<MathangCuahang> getMathangCuahangs() {
		return this.mathangCuahangs;
	}

	public void setMathangCuahangs(List<MathangCuahang> mathangCuahangs) {
		this.mathangCuahangs = mathangCuahangs;
	}

	public MathangCuahang addMathangCuahang(MathangCuahang mathangCuahang) {
		getMathangCuahangs().add(mathangCuahang);
		mathangCuahang.setGiamgia(this);

		return mathangCuahang;
	}

	public MathangCuahang removeMathangCuahang(MathangCuahang mathangCuahang) {
		getMathangCuahangs().remove(mathangCuahang);
		mathangCuahang.setGiamgia(null);

		return mathangCuahang;
	}

}