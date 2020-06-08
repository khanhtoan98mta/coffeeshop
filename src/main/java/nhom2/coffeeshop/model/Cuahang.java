package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the cuahang database table.
 * 
 */
@Entity
@NamedQuery(name="Cuahang.findAll", query="SELECT c FROM Cuahang c")
public class Cuahang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idcuahang;

	private String diachi;

	private String tencuahang;

	//bi-directional many-to-one association to Hoadon
	@OneToMany(mappedBy="cuahang", cascade={CascadeType.ALL})
	private List<Hoadon> hoadons;

	//bi-directional many-to-one association to MathangCuahang
	@OneToMany(mappedBy="cuahang", cascade={CascadeType.ALL})
	private List<MathangCuahang> mathangCuahangs;

	//bi-directional many-to-one association to Nhanvien
	@OneToMany(mappedBy="cuahang", cascade={CascadeType.ALL})
	private List<Nhanvien> nhanviens;

	//bi-directional many-to-one association to Phieunhapkho
	@OneToMany(mappedBy="cuahang", cascade={CascadeType.ALL})
	private List<Phieunhapkho> phieunhapkhos;

	//bi-directional many-to-one association to Phieuxuatkho
	@OneToMany(mappedBy="cuahang", cascade={CascadeType.ALL})
	private List<Phieuxuatkho> phieuxuatkhos;

	public Cuahang() {
	}

	public long getIdcuahang() {
		return this.idcuahang;
	}

	public void setIdcuahang(long idcuahang) {
		this.idcuahang = idcuahang;
	}

	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getTencuahang() {
		return this.tencuahang;
	}

	public void setTencuahang(String tencuahang) {
		this.tencuahang = tencuahang;
	}
	@JsonIgnore
	public List<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(List<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

	public Hoadon addHoadon(Hoadon hoadon) {
		getHoadons().add(hoadon);
		hoadon.setCuahang(this);

		return hoadon;
	}

	public Hoadon removeHoadon(Hoadon hoadon) {
		getHoadons().remove(hoadon);
		hoadon.setCuahang(null);

		return hoadon;
	}
	@JsonIgnore
	public List<MathangCuahang> getMathangCuahangs() {
		return this.mathangCuahangs;
	}

	public void setMathangCuahangs(List<MathangCuahang> mathangCuahangs) {
		this.mathangCuahangs = mathangCuahangs;
	}

	public MathangCuahang addMathangCuahang(MathangCuahang mathangCuahang) {
		getMathangCuahangs().add(mathangCuahang);
		mathangCuahang.setCuahang(this);

		return mathangCuahang;
	}

	public MathangCuahang removeMathangCuahang(MathangCuahang mathangCuahang) {
		getMathangCuahangs().remove(mathangCuahang);
		mathangCuahang.setCuahang(null);

		return mathangCuahang;
	}
	@JsonIgnore
	public List<Nhanvien> getNhanviens() {
		return this.nhanviens;
	}

	public void setNhanviens(List<Nhanvien> nhanviens) {
		this.nhanviens = nhanviens;
	}

	public Nhanvien addNhanvien(Nhanvien nhanvien) {
		getNhanviens().add(nhanvien);
		nhanvien.setCuahang(this);

		return nhanvien;
	}

	public Nhanvien removeNhanvien(Nhanvien nhanvien) {
		getNhanviens().remove(nhanvien);
		nhanvien.setCuahang(null);

		return nhanvien;
	}
	@JsonIgnore
	public List<Phieunhapkho> getPhieunhapkhos() {
		return this.phieunhapkhos;
	}

	public void setPhieunhapkhos(List<Phieunhapkho> phieunhapkhos) {
		this.phieunhapkhos = phieunhapkhos;
	}

	public Phieunhapkho addPhieunhapkho(Phieunhapkho phieunhapkho) {
		getPhieunhapkhos().add(phieunhapkho);
		phieunhapkho.setCuahang(this);

		return phieunhapkho;
	}

	public Phieunhapkho removePhieunhapkho(Phieunhapkho phieunhapkho) {
		getPhieunhapkhos().remove(phieunhapkho);
		phieunhapkho.setCuahang(null);

		return phieunhapkho;
	}
	@JsonIgnore
	public List<Phieuxuatkho> getPhieuxuatkhos() {
		return this.phieuxuatkhos;
	}

	public void setPhieuxuatkhos(List<Phieuxuatkho> phieuxuatkhos) {
		this.phieuxuatkhos = phieuxuatkhos;
	}

	public Phieuxuatkho addPhieuxuatkho(Phieuxuatkho phieuxuatkho) {
		getPhieuxuatkhos().add(phieuxuatkho);
		phieuxuatkho.setCuahang(this);

		return phieuxuatkho;
	}

	public Phieuxuatkho removePhieuxuatkho(Phieuxuatkho phieuxuatkho) {
		getPhieuxuatkhos().remove(phieuxuatkho);
		phieuxuatkho.setCuahang(null);

		return phieuxuatkho;
	}

}