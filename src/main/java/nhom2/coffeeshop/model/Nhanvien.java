package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the nhanvien database table.
 * 
 */
@Entity
@NamedQuery(name="Nhanvien.findAll", query="SELECT n FROM Nhanvien n")
public class Nhanvien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idnhanvien;

	//bi-directional many-to-one association to Chitietchamcong
	@OneToMany(mappedBy="nhanvien", cascade={CascadeType.ALL})
	private List<Chitietchamcong> chitietchamcongs;

	//bi-directional many-to-one association to Chitietlichlamviec
	@OneToMany(mappedBy="nhanvien", cascade={CascadeType.ALL})
	private List<Chitietlichlamviec> chitietlichlamviecs;

	//bi-directional many-to-one association to Hoadon
	@OneToMany(mappedBy="nhanvien", cascade={CascadeType.ALL})
	private List<Hoadon> hoadons;

	//bi-directional many-to-one association to Cuahang
	@ManyToOne
	@JoinColumn(name="idcuahang")
	private Cuahang cuahang;

	//bi-directional many-to-one association to NhanvienChucvu
	@OneToMany(mappedBy="nhanvien", cascade={CascadeType.ALL})
	private List<NhanvienChucvu> nhanvienChucvus;

	//bi-directional many-to-one association to NvBangchamcong
	@OneToMany(mappedBy="nhanvien", cascade={CascadeType.ALL})
	private List<NvBangchamcong> nvBangchamcongs;

	//bi-directional many-to-one association to NvLichlamviec
	@OneToMany(mappedBy="nhanvien", cascade={CascadeType.ALL})
	private List<NvLichlamviec> nvLichlamviecs;

	//bi-directional many-to-one association to Phieunhapkho
	@OneToMany(mappedBy="nhanvien", cascade={CascadeType.ALL})
	private List<Phieunhapkho> phieunhapkhos;

	//bi-directional many-to-one association to Phieuxuatkho
	@OneToMany(mappedBy="nhanvien", cascade={CascadeType.ALL})
	private List<Phieuxuatkho> phieuxuatkhos;

	public Nhanvien() {
	}

	public long getIdnhanvien() {
		return this.idnhanvien;
	}

	public void setIdnhanvien(long idnhanvien) {
		this.idnhanvien = idnhanvien;
	}
	@JsonIgnore
	public List<Chitietchamcong> getChitietchamcongs() {
		return this.chitietchamcongs;
	}

	public void setChitietchamcongs(List<Chitietchamcong> chitietchamcongs) {
		this.chitietchamcongs = chitietchamcongs;
	}

	public Chitietchamcong addChitietchamcong(Chitietchamcong chitietchamcong) {
		getChitietchamcongs().add(chitietchamcong);
		chitietchamcong.setNhanvien(this);

		return chitietchamcong;
	}

	public Chitietchamcong removeChitietchamcong(Chitietchamcong chitietchamcong) {
		getChitietchamcongs().remove(chitietchamcong);
		chitietchamcong.setNhanvien(null);

		return chitietchamcong;
	}
	@JsonIgnore
	public List<Chitietlichlamviec> getChitietlichlamviecs() {
		return this.chitietlichlamviecs;
	}

	public void setChitietlichlamviecs(List<Chitietlichlamviec> chitietlichlamviecs) {
		this.chitietlichlamviecs = chitietlichlamviecs;
	}

	public Chitietlichlamviec addChitietlichlamviec(Chitietlichlamviec chitietlichlamviec) {
		getChitietlichlamviecs().add(chitietlichlamviec);
		chitietlichlamviec.setNhanvien(this);

		return chitietlichlamviec;
	}

	public Chitietlichlamviec removeChitietlichlamviec(Chitietlichlamviec chitietlichlamviec) {
		getChitietlichlamviecs().remove(chitietlichlamviec);
		chitietlichlamviec.setNhanvien(null);

		return chitietlichlamviec;
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
		hoadon.setNhanvien(this);

		return hoadon;
	}

	public Hoadon removeHoadon(Hoadon hoadon) {
		getHoadons().remove(hoadon);
		hoadon.setNhanvien(null);

		return hoadon;
	}

	public Cuahang getCuahang() {
		return this.cuahang;
	}

	public void setCuahang(Cuahang cuahang) {
		this.cuahang = cuahang;
	}
	@JsonIgnore
	public List<NhanvienChucvu> getNhanvienChucvus() {
		return this.nhanvienChucvus;
	}

	public void setNhanvienChucvus(List<NhanvienChucvu> nhanvienChucvus) {
		this.nhanvienChucvus = nhanvienChucvus;
	}

	public NhanvienChucvu addNhanvienChucvus(NhanvienChucvu nhanvienChucvus) {
		getNhanvienChucvus().add(nhanvienChucvus);
		nhanvienChucvus.setNhanvien(this);

		return nhanvienChucvus;
	}

	public NhanvienChucvu removeNhanvienChucvus(NhanvienChucvu nhanvienChucvus) {
		getNhanvienChucvus().remove(nhanvienChucvus);
		nhanvienChucvus.setNhanvien(null);

		return nhanvienChucvus;
	}
	@JsonIgnore
	public List<NvBangchamcong> getNvBangchamcongs() {
		return this.nvBangchamcongs;
	}

	public void setNvBangchamcongs(List<NvBangchamcong> nvBangchamcongs) {
		this.nvBangchamcongs = nvBangchamcongs;
	}

	public NvBangchamcong addNvBangchamcong(NvBangchamcong nvBangchamcong) {
		getNvBangchamcongs().add(nvBangchamcong);
		nvBangchamcong.setNhanvien(this);

		return nvBangchamcong;
	}

	public NvBangchamcong removeNvBangchamcong(NvBangchamcong nvBangchamcong) {
		getNvBangchamcongs().remove(nvBangchamcong);
		nvBangchamcong.setNhanvien(null);

		return nvBangchamcong;
	}
	@JsonIgnore
	public List<NvLichlamviec> getNvLichlamviecs() {
		return this.nvLichlamviecs;
	}

	public void setNvLichlamviecs(List<NvLichlamviec> nvLichlamviecs) {
		this.nvLichlamviecs = nvLichlamviecs;
	}

	public NvLichlamviec addNvLichlamviec(NvLichlamviec nvLichlamviec) {
		getNvLichlamviecs().add(nvLichlamviec);
		nvLichlamviec.setNhanvien(this);

		return nvLichlamviec;
	}

	public NvLichlamviec removeNvLichlamviec(NvLichlamviec nvLichlamviec) {
		getNvLichlamviecs().remove(nvLichlamviec);
		nvLichlamviec.setNhanvien(null);

		return nvLichlamviec;
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
		phieunhapkho.setNhanvien(this);

		return phieunhapkho;
	}

	public Phieunhapkho removePhieunhapkho(Phieunhapkho phieunhapkho) {
		getPhieunhapkhos().remove(phieunhapkho);
		phieunhapkho.setNhanvien(null);

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
		phieuxuatkho.setNhanvien(this);

		return phieuxuatkho;
	}

	public Phieuxuatkho removePhieuxuatkho(Phieuxuatkho phieuxuatkho) {
		getPhieuxuatkhos().remove(phieuxuatkho);
		phieuxuatkho.setNhanvien(null);

		return phieuxuatkho;
	}

}