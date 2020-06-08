package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nv_bangchamcong database table.
 * 
 */
@Entity
@Table(name="nv_bangchamcong")
@NamedQuery(name="NvBangchamcong.findAll", query="SELECT n FROM NvBangchamcong n")
public class NvBangchamcong implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idnvbcc;

	//bi-directional many-to-one association to Bangchamcong
	@ManyToOne
	@JoinColumn(name="bccid")
	private Bangchamcong bangchamcong;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne
	@JoinColumn(name="nvid")
	private Nhanvien nhanvien;

	public NvBangchamcong() {
	}

	public long getIdnvbcc() {
		return this.idnvbcc;
	}

	public void setIdnvbcc(long idnvbcc) {
		this.idnvbcc = idnvbcc;
	}

	public Bangchamcong getBangchamcong() {
		return this.bangchamcong;
	}

	public void setBangchamcong(Bangchamcong bangchamcong) {
		this.bangchamcong = bangchamcong;
	}

	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

}