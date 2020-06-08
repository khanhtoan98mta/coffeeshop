package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the chitietchamcong database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietchamcong.findAll", query="SELECT c FROM Chitietchamcong c")
public class Chitietchamcong implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idchitietcc;

	private String ghichu;

	@Temporal(TemporalType.DATE)
	private Date ngaychamcong;

	//bi-directional many-to-one association to Bangchamcong
	@ManyToOne
	@JoinColumn(name="bbcid")
	private Bangchamcong bangchamcong;

	//bi-directional many-to-one association to Ca
	@ManyToOne
	@JoinColumn(name="caid")
	private Ca ca;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne
	@JoinColumn(name="nvid")
	private Nhanvien nhanvien;

	public Chitietchamcong() {
	}

	public long getIdchitietcc() {
		return this.idchitietcc;
	}

	public void setIdchitietcc(long idchitietcc) {
		this.idchitietcc = idchitietcc;
	}

	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public Date getNgaychamcong() {
		return this.ngaychamcong;
	}

	public void setNgaychamcong(Date ngaychamcong) {
		this.ngaychamcong = ngaychamcong;
	}

	public Bangchamcong getBangchamcong() {
		return this.bangchamcong;
	}

	public void setBangchamcong(Bangchamcong bangchamcong) {
		this.bangchamcong = bangchamcong;
	}

	public Ca getCa() {
		return this.ca;
	}

	public void setCa(Ca ca) {
		this.ca = ca;
	}

	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

}