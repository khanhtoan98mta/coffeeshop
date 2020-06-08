package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nhanvien_chucvu database table.
 * 
 */
@Entity
@Table(name="nhanvien_chucvu")
@NamedQuery(name="NhanvienChucvu.findAll", query="SELECT n FROM NhanvienChucvu n")
public class NhanvienChucvu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idnvcv;

	@Temporal(TemporalType.DATE)
	private Date thoigianbatdau;

	@Temporal(TemporalType.DATE)
	private Date thoigianketthuc;

	//bi-directional many-to-one association to Chucvu
	@ManyToOne
	@JoinColumn(name="chucvuid")
	private Chucvu chucvu;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne
	@JoinColumn(name="nvid")
	private Nhanvien nhanvien;

	public NhanvienChucvu() {
	}

	public long getIdnvcv() {
		return this.idnvcv;
	}

	public void setIdnvcv(long idnvcv) {
		this.idnvcv = idnvcv;
	}

	public Date getThoigianbatdau() {
		return this.thoigianbatdau;
	}

	public void setThoigianbatdau(Date thoigianbatdau) {
		this.thoigianbatdau = thoigianbatdau;
	}

	public Date getThoigianketthuc() {
		return this.thoigianketthuc;
	}

	public void setThoigianketthuc(Date thoigianketthuc) {
		this.thoigianketthuc = thoigianketthuc;
	}

	public Chucvu getChucvu() {
		return this.chucvu;
	}

	public void setChucvu(Chucvu chucvu) {
		this.chucvu = chucvu;
	}

	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

}