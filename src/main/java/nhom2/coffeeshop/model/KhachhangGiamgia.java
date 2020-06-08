package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the khachhang_giamgia database table.
 * 
 */
@Entity
@Table(name="khachhang_giamgia")
@NamedQuery(name="KhachhangGiamgia.findAll", query="SELECT k FROM KhachhangGiamgia k")
public class KhachhangGiamgia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idkhachhanggiamgia;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ngaybatdau;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ngayketthuc;

	private long soluong;

	//bi-directional many-to-one association to Giamgia
	@ManyToOne
	@JoinColumn(name="idgiamgia")
	private Giamgia giamgia;

	//bi-directional many-to-one association to Khachhang
	@ManyToOne
	@JoinColumn(name="idkhachhang")
	private Khachhang khachhang;

	public KhachhangGiamgia() {
	}

	public long getIdkhachhanggiamgia() {
		return this.idkhachhanggiamgia;
	}

	public void setIdkhachhanggiamgia(long idkhachhanggiamgia) {
		this.idkhachhanggiamgia = idkhachhanggiamgia;
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

	public Khachhang getKhachhang() {
		return this.khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}

}