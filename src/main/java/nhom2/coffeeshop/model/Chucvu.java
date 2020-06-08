package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the chucvu database table.
 * 
 */
@Entity
@NamedQuery(name="Chucvu.findAll", query="SELECT c FROM Chucvu c")
public class Chucvu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long chucvuid;

	private String chucvuten;

	//bi-directional many-to-one association to NhanvienChucvu
	@OneToMany(mappedBy="chucvu" , cascade={CascadeType.ALL})
	private List<NhanvienChucvu> nhanvienChucvus;

	public Chucvu() {
	}

	public long getChucvuid() {
		return this.chucvuid;
	}

	public void setChucvuid(long chucvuid) {
		this.chucvuid = chucvuid;
	}

	public String getChucvuten() {
		return this.chucvuten;
	}

	public void setChucvuten(String chucvuten) {
		this.chucvuten = chucvuten;
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
		nhanvienChucvus.setChucvu(this);

		return nhanvienChucvus;
	}

	public NhanvienChucvu removeNhanvienChucvus(NhanvienChucvu nhanvienChucvus) {
		getNhanvienChucvus().remove(nhanvienChucvus);
		nhanvienChucvus.setChucvu(null);

		return nhanvienChucvus;
	}

}