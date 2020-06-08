package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nv_lichlamviec database table.
 * 
 */
@Entity
@Table(name="nv_lichlamviec")
@NamedQuery(name="NvLichlamviec.findAll", query="SELECT n FROM NvLichlamviec n")
public class NvLichlamviec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idnvllv;

	//bi-directional many-to-one association to Lichlamviec
	@ManyToOne
	@JoinColumn(name="llvid")
	private Lichlamviec lichlamviec;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne
	@JoinColumn(name="nvid")
	private Nhanvien nhanvien;

	public NvLichlamviec() {
	}

	public long getIdnvllv() {
		return this.idnvllv;
	}

	public void setIdnvllv(long idnvllv) {
		this.idnvllv = idnvllv;
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