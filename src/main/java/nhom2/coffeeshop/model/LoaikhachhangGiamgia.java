package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the loaikhachhang_giamgia database table.
 * 
 */
@Entity
@Table(name="loaikhachhang_giamgia")
@NamedQuery(name="LoaikhachhangGiamgia.findAll", query="SELECT l FROM LoaikhachhangGiamgia l")
public class LoaikhachhangGiamgia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idloaikhachhanggiamgia;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ngaybatdau;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ngayketthuc;

	private long soluong;

	//bi-directional many-to-one association to Giamgia
	@ManyToOne
	@JoinColumn(name="idgiamgia")
	private Giamgia giamgia;

	//bi-directional many-to-one association to Loaikhachhang
	@ManyToOne
	@JoinColumn(name="idloaikhachhang")
	private Loaikhachhang loaikhachhang;

	public LoaikhachhangGiamgia() {
	}

	public long getIdloaikhachhanggiamgia() {
		return this.idloaikhachhanggiamgia;
	}

	public void setIdloaikhachhanggiamgia(long idloaikhachhanggiamgia) {
		this.idloaikhachhanggiamgia = idloaikhachhanggiamgia;
	}

	public Date getNgaybatdau() {
		return this.ngaybatdau;
	}

	public void setNgaybatdau(Date ngaybatdau) {
		this.ngaybatdau = ngaybatdau;
	}

	public Date getNgayketthuc() {
		return this.ngayketthuc;
	}

	public void setNgayketthuc(Date ngayketthuc) {
		this.ngayketthuc = ngayketthuc;
	}

	public long getSoluong() {
		return this.soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public Giamgia getGiamgia() {
		return this.giamgia;
	}

	public void setGiamgia(Giamgia giamgia) {
		this.giamgia = giamgia;
	}

	public Loaikhachhang getLoaikhachhang() {
		return this.loaikhachhang;
	}

	public void setLoaikhachhang(Loaikhachhang loaikhachhang) {
		this.loaikhachhang = loaikhachhang;
	}

}