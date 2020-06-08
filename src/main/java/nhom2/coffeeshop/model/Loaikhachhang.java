package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the loaikhachhang database table.
 * 
 */
@Entity
@NamedQuery(name="Loaikhachhang.findAll", query="SELECT l FROM Loaikhachhang l")
public class Loaikhachhang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idloaikhachhang;

	private String dinhmuc;

	private String tenloai;

	//bi-directional many-to-one association to LoaikhachhangGiamgia
	@OneToMany(mappedBy="loaikhachhang", cascade={CascadeType.ALL})
	private List<LoaikhachhangGiamgia> loaikhachhangGiamgias;

	public Loaikhachhang() {
	}

	public long getIdloaikhachhang() {
		return this.idloaikhachhang;
	}

	public void setIdloaikhachhang(long idloaikhachhang) {
		this.idloaikhachhang = idloaikhachhang;
	}

	public String getDinhmuc() {
		return this.dinhmuc;
	}

	public void setDinhmuc(String dinhmuc) {
		this.dinhmuc = dinhmuc;
	}

	public String getTenloai() {
		return this.tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
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
		loaikhachhangGiamgia.setLoaikhachhang(this);

		return loaikhachhangGiamgia;
	}

	public LoaikhachhangGiamgia removeLoaikhachhangGiamgia(LoaikhachhangGiamgia loaikhachhangGiamgia) {
		getLoaikhachhangGiamgias().remove(loaikhachhangGiamgia);
		loaikhachhangGiamgia.setLoaikhachhang(null);

		return loaikhachhangGiamgia;
	}

}