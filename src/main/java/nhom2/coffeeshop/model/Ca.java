package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the ca database table.
 * 
 */
@Entity
@NamedQuery(name="Ca.findAll", query="SELECT c FROM Ca c")
public class Ca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long caid;

	private String caname;

	private String cathoigian;

	//bi-directional many-to-one association to Chitietchamcong
	@OneToMany(mappedBy="ca" , cascade={CascadeType.ALL})
	private List<Chitietchamcong> chitietchamcongs;

	//bi-directional many-to-one association to Chitietlichlamviec
	@OneToMany(mappedBy="ca" , cascade={CascadeType.ALL})
	private List<Chitietlichlamviec> chitietlichlamviecs;

	public Ca() {
	}

	public long getCaid() {
		return this.caid;
	}

	public void setCaid(long caid) {
		this.caid = caid;
	}

	public String getCaname() {
		return this.caname;
	}

	public void setCaname(String caname) {
		this.caname = caname;
	}

	public String getCathoigian() {
		return this.cathoigian;
	}

	public void setCathoigian(String cathoigian) {
		this.cathoigian = cathoigian;
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
		chitietchamcong.setCa(this);

		return chitietchamcong;
	}

	public Chitietchamcong removeChitietchamcong(Chitietchamcong chitietchamcong) {
		getChitietchamcongs().remove(chitietchamcong);
		chitietchamcong.setCa(null);

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
		chitietlichlamviec.setCa(this);

		return chitietlichlamviec;
	}

	public Chitietlichlamviec removeChitietlichlamviec(Chitietlichlamviec chitietlichlamviec) {
		getChitietlichlamviecs().remove(chitietlichlamviec);
		chitietlichlamviec.setCa(null);

		return chitietlichlamviec;
	}

}