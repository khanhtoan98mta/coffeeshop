package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the mathang database table.
 * 
 */
@Entity
@NamedQuery(name="Mathang.findAll", query="SELECT m FROM Mathang m")
public class Mathang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idmathang;

	private String donvitinh;

	private float gia;

	private String tenhang;


	//bi-directional many-to-one association to Chitiethoadon
	@OneToMany(mappedBy="mathang", cascade={CascadeType.ALL})
	private List<Chitiethoadon> chitiethoadons;

	//bi-directional many-to-one association to Chitietphieunhap
	@OneToMany(mappedBy="mathang", cascade={CascadeType.ALL})
	private List<Chitietphieunhap> chitietphieunhaps;

	//bi-directional many-to-one association to Chitietphieuxuat
	@OneToMany(mappedBy="mathang", cascade={CascadeType.ALL})
	private List<Chitietphieuxuat> chitietphieuxuats;

	//bi-directional many-to-one association to MathangCuahang
	@OneToMany(mappedBy="mathang", cascade={CascadeType.ALL})
	private List<MathangCuahang> mathangCuahangs;


 public Mathang()
 {

 }
	public Mathang(long idmathang, String donvitinh, float gia, String tenhang) {
		this.idmathang = idmathang;
		this.donvitinh = donvitinh;
		this.gia = gia;
		this.tenhang = tenhang;

	}

	public long getIdmathang() {
		return this.idmathang;
	}

	public void setIdmathang(long idmathang) {
		this.idmathang = idmathang;
	}

	public String getDonvitinh() {
		return this.donvitinh;
	}

	public void setDonvitinh(String donvitinh) {
		this.donvitinh = donvitinh;
	}

	public float getGia() {
		return this.gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public String getTenhang() {
		return this.tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}


	@JsonIgnore
	public List<Chitiethoadon> getChitiethoadons() {
		return this.chitiethoadons;
	}
	
	public void setChitiethoadons(List<Chitiethoadon> chitiethoadons) {
		this.chitiethoadons = chitiethoadons;
	}

	public Chitiethoadon addChitiethoadon(Chitiethoadon chitiethoadon) {
		getChitiethoadons().add(chitiethoadon);
		chitiethoadon.setMathang(this);

		return chitiethoadon;
	}

	public Chitiethoadon removeChitiethoadon(Chitiethoadon chitiethoadon) {
		getChitiethoadons().remove(chitiethoadon);
		chitiethoadon.setMathang(null);

		return chitiethoadon;
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
		chitietphieunhap.setMathang(this);

		return chitietphieunhap;
	}

	public Chitietphieunhap removeChitietphieunhap(Chitietphieunhap chitietphieunhap) {
		getChitietphieunhaps().remove(chitietphieunhap);
		chitietphieunhap.setMathang(null);

		return chitietphieunhap;
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
		chitietphieuxuat.setMathang(this);

		return chitietphieuxuat;
	}

	public Chitietphieuxuat removeChitietphieuxuat(Chitietphieuxuat chitietphieuxuat) {
		getChitietphieuxuats().remove(chitietphieuxuat);
		chitietphieuxuat.setMathang(null);

		return chitietphieuxuat;
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
		mathangCuahang.setMathang(this);

		return mathangCuahang;
	}

	public MathangCuahang removeMathangCuahang(MathangCuahang mathangCuahang) {
		getMathangCuahangs().remove(mathangCuahang);
		mathangCuahang.setMathang(null);

		return mathangCuahang;
	}

}