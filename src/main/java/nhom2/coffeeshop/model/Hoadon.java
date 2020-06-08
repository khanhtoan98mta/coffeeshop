package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the hoadon database table.
 * 
 */
@Entity
@NamedQuery(name="Hoadon.findAll", query="SELECT h FROM Hoadon h")
public class Hoadon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idhoadon;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ngaymua;

	private float sotiennhan;

	private float sotientralai;

	private long tinhtrang;

	private float tongtienbandau;

	private float tongtienthanhtoan;

	//bi-directional many-to-one association to Chitiethoadon
	@OneToMany(mappedBy="hoadon", cascade={CascadeType.ALL})
	private List<Chitiethoadon> chitiethoadons;

	//bi-directional many-to-one association to Cuahang
	@ManyToOne
	@JoinColumn(name="idcuahang")
	private Cuahang cuahang;

	//bi-directional many-to-one association to Giamgia
	@ManyToOne
	@JoinColumn(name="idgiamgia")
	private Giamgia giamgia;

	//bi-directional many-to-one association to Khachhang
	@ManyToOne
	@JoinColumn(name="idkhachhang")
	private Khachhang khachhang;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne
	@JoinColumn(name="idnhanvien")
	private Nhanvien nhanvien;

	public Hoadon() {
	}

	public long getIdhoadon() {
		return this.idhoadon;
	}

	public void setIdhoadon(long idhoadon) {
		this.idhoadon = idhoadon;
	}

	public Date getNgaymua() {
		return this.ngaymua;
	}

	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}

	public float getSotiennhan() {
		return this.sotiennhan;
	}

	public void setSotiennhan(float sotiennhan) {
		this.sotiennhan = sotiennhan;
	}

	public float getSotientralai() {
		return this.sotientralai;
	}

	public void setSotientralai(float sotientralai) {
		this.sotientralai = sotientralai;
	}

	public long getTinhtrang() {
		return this.tinhtrang;
	}

	public void setTinhtrang(long tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public float getTongtienbandau() {
		return this.tongtienbandau;
	}

	public void setTongtienbandau(float tongtienbandau) {
		this.tongtienbandau = tongtienbandau;
	}

	public float getTongtienthanhtoan() {
		return this.tongtienthanhtoan;
	}

	public void setTongtienthanhtoan(float tongtienthanhtoan) {
		this.tongtienthanhtoan = tongtienthanhtoan;
	}
	@JsonIgnore
	public List<Chitiethoadon> getChitiethoadons() {
		return this.chitiethoadons;
	}

	public void setChitiethoadons(List<Chitiethoadon> chitiethoadons) {
		this.chitiethoadons = chitiethoadons;
	}

	public Chitiethoadon addChitiethoadon(Chitiethoadon chitiethoadon) {
		getChitiethoadons().add(chitiethoadon);
		chitiethoadon.setHoadon(this);

		return chitiethoadon;
	}

	public Chitiethoadon removeChitiethoadon(Chitiethoadon chitiethoadon) {
		getChitiethoadons().remove(chitiethoadon);
		chitiethoadon.setHoadon(null);

		return chitiethoadon;
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

	public Khachhang getKhachhang() {
		return this.khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}

	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

}