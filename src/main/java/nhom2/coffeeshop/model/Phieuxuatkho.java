package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the phieuxuatkho database table.
 * 
 */
@Entity
@NamedQuery(name="Phieuxuatkho.findAll", query="SELECT p FROM Phieuxuatkho p")
public class Phieuxuatkho implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idphieuxuatkho;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ngaylap;

	private float tongtienchuavat;

	private float tongtiendavat;

	private float tongtienvat;

	//bi-directional many-to-one association to Chitietphieuxuat
	@OneToMany(mappedBy="phieuxuatkho", cascade={CascadeType.ALL})
	private List<Chitietphieuxuat> chitietphieuxuats;

	//bi-directional many-to-one association to Cuahang
	@ManyToOne
	@JoinColumn(name="idcuahang")
	private Cuahang cuahang;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne
	@JoinColumn(name="idnhanvien")
	private Nhanvien nhanvien;

	public Phieuxuatkho() {
	}

	public long getIdphieuxuatkho() {
		return this.idphieuxuatkho;
	}

	public void setIdphieuxuatkho(long idphieuxuatkho) {
		this.idphieuxuatkho = idphieuxuatkho;
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
	public List<Chitietphieuxuat> getChitietphieuxuats() {
		return this.chitietphieuxuats;
	}

	public void setChitietphieuxuats(List<Chitietphieuxuat> chitietphieuxuats) {
		this.chitietphieuxuats = chitietphieuxuats;
	}

	public Chitietphieuxuat addChitietphieuxuat(Chitietphieuxuat chitietphieuxuat) {
		getChitietphieuxuats().add(chitietphieuxuat);
		chitietphieuxuat.setPhieuxuatkho(this);

		return chitietphieuxuat;
	}

	public Chitietphieuxuat removeChitietphieuxuat(Chitietphieuxuat chitietphieuxuat) {
		getChitietphieuxuats().remove(chitietphieuxuat);
		chitietphieuxuat.setPhieuxuatkho(null);

		return chitietphieuxuat;
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