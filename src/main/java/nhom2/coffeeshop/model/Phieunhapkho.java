package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the phieunhapkho database table.
 * 
 */
@Entity
@NamedQuery(name="Phieunhapkho.findAll", query="SELECT p FROM Phieunhapkho p")
public class Phieunhapkho implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idphieunhapkho;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ngaylap;

	private float tongtienchuavat;

	private float tongtiendavat;

	private float tongtienvat;

	//bi-directional many-to-one association to Chitietphieunhap
	@OneToMany(mappedBy="phieunhapkho", cascade={CascadeType.ALL})
	private List<Chitietphieunhap> chitietphieunhaps;

	//bi-directional many-to-one association to Cuahang
	@ManyToOne
	@JoinColumn(name="idcuahang")
	private Cuahang cuahang;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne
	@JoinColumn(name="idnhanvien")
	private Nhanvien nhanvien;

	public Phieunhapkho() {
	}

	public long getIdphieunhapkho() {
		return this.idphieunhapkho;
	}

	public void setIdphieunhapkho(long idphieunhapkho) {
		this.idphieunhapkho = idphieunhapkho;
	}

	public Date getNgaylap() {
		return this.ngaylap;
	}

	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}

	public float getTongtienchuavat() {
		return this.tongtienchuavat;
	}

	public void setTongtienchuavat(float tongtienchuavat) {
		this.tongtienchuavat = tongtienchuavat;
	}

	public float getTongtiendavat() {
		return this.tongtiendavat;
	}

	public void setTongtiendavat(float tongtiendavat) {
		this.tongtiendavat = tongtiendavat;
	}

	public float getTongtienvat() {
		return this.tongtienvat;
	}

	public void setTongtienvat(float tongtienvat) {
		this.tongtienvat = tongtienvat;
	}
	@JsonIgnore
	public List<Chitietphieunhap> getChitietphieunhaps() {
		return this.chitietphieunhaps;
	}

	public void setChitietphieunhaps(List<Chitietphieunhap> chitietphieunhaps) {
		this.chitietphieunhaps = chitietphieunhaps;
	}

	public Chitietphieunhap addChitietphieunhap(Chitietphieunhap chitietphieunhap) {
		getChitietphieunhaps().add(chitietphieunhap);
		chitietphieunhap.setPhieunhapkho(this);

		return chitietphieunhap;
	}

	public Chitietphieunhap removeChitietphieunhap(Chitietphieunhap chitietphieunhap) {
		getChitietphieunhaps().remove(chitietphieunhap);
		chitietphieunhap.setPhieunhapkho(null);

		return chitietphieunhap;
	}

	public Cuahang getCuahang() {
		return this.cuahang;
	}

	public void setCuahang(Cuahang cuahang) {
		this.cuahang = cuahang;
	}

	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

}