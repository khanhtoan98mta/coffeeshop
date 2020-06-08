package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the chitietlichlamviec database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietlichlamviec.findAll", query="SELECT c FROM Chitietlichlamviec c")
public class Chitietlichlamviec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idchitietllv;

	private String ghichu;

	@Temporal(TemporalType.DATE)
	private Date ngaylamviec;

	//bi-directional many-to-one association to Ca
	@ManyToOne
	@JoinColumn(name="caid")
	private Ca ca;

	//bi-directional many-to-one association to Lichlamviec
	@ManyToOne
	@JoinColumn(name="llvid")
	private Lichlamviec lichlamviec;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne
	@JoinColumn(name="nvid")
	private Nhanvien nhanvien;

	public Chitietlichlamviec() {
	}

	public long getIdchitietllv() {
		return this.idchitietllv;
	}

	public void setIdchitietllv(long idchitietllv) {
		this.idchitietllv = idchitietllv;
	}

	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public Date getNgaylamviec() {
		return this.ngaylamviec;
	}

	public void setNgaylamviec(Date ngaylamviec) {
		this.ngaylamviec = ngaylamviec;
	}

	public Ca getCa() {
		return this.ca;
	}

	public void setCa(Ca ca) {
		this.ca = ca;
	}

	public Lichlamviec getLichlamviec() {
		return this.lichlamviec;
	}

	public void setLichlamviec(Lichlamviec lichlamviec) {
		this.lichlamviec = lichlamviec;
	}

	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

}