package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the khachhang database table.
 * 
 */
@Entity
@NamedQuery(name="Khachhang.findAll", query="SELECT k FROM Khachhang k")
public class Khachhang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idkhachhang;

	private String email;

	private String facebook;

	private long idloaikhachhang;

	private String sodienthoai;

	private String tenkhachhang;

	//bi-directional many-to-one association to Hoadon
	@OneToMany(mappedBy="khachhang", cascade={CascadeType.ALL})
	private List<Hoadon> hoadons;

	//bi-directional many-to-one association to KhachhangGiamgia
	@OneToMany(mappedBy="khachhang", cascade={CascadeType.ALL})
	private List<KhachhangGiamgia> khachhangGiamgias;

	public Khachhang() {
	}

	public long getIdkhachhang() {
		return this.idkhachhang;
	}

	public void setIdkhachhang(long idkhachhang) {
		this.idkhachhang = idkhachhang;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public long getIdloaikhachhang() {
		return this.idloaikhachhang;
	}

	public void setIdloaikhachhang(long idloaikhachhang) {
		this.idloaikhachhang = idloaikhachhang;
	}

	public String getSodienthoai() {
		return this.sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getTenkhachhang() {
		return this.tenkhachhang;
	}

	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
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
		hoadon.setKhachhang(this);

		return hoadon;
	}

	public Hoadon removeHoadon(Hoadon hoadon) {
		getHoadons().remove(hoadon);
		hoadon.setKhachhang(null);

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
		khachhangGiamgia.setKhachhang(this);

		return khachhangGiamgia;
	}

	public KhachhangGiamgia removeKhachhangGiamgia(KhachhangGiamgia khachhangGiamgia) {
		getKhachhangGiamgias().remove(khachhangGiamgia);
		khachhangGiamgia.setKhachhang(null);

		return khachhangGiamgia;
	}

}