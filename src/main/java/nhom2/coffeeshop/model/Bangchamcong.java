package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the bangchamcong database table.
 * 
 */
@Entity
@NamedQuery(name="Bangchamcong.findAll", query="SELECT b FROM Bangchamcong b")
public class Bangchamcong implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long bbcid;

	private String bbcthoigian;

	//bi-directional many-to-one association to Chitietchamcong
	@OneToMany(mappedBy="bangchamcong", cascade={CascadeType.ALL})
	private List<Chitietchamcong> chitietchamcongs;

	//bi-directional many-to-one association to NvBangchamcong
	@OneToMany(mappedBy="bangchamcong" , cascade={CascadeType.ALL})
	private List<NvBangchamcong> nvBangchamcongs;

	public Bangchamcong() {
	}

	public long getBbcid() {
		return this.bbcid;
	}

	public void setBbcid(long bbcid) {
		this.bbcid = bbcid;
	}

	public String getBbcthoigian() {
		return this.bbcthoigian;
	}

	public void setBbcthoigian(String bbcthoigian) {
		this.bbcthoigian = bbcthoigian;
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
		chitietchamcong.setBangchamcong(this);

		return chitietchamcong;
	}

	public Chitietchamcong removeChitietchamcong(Chitietchamcong chitietchamcong) {
		getChitietchamcongs().remove(chitietchamcong);
		chitietchamcong.setBangchamcong(null);

		return chitietchamcong;
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
		nvBangchamcong.setBangchamcong(this);

		return nvBangchamcong;
	}

	public NvBangchamcong removeNvBangchamcong(NvBangchamcong nvBangchamcong) {
		getNvBangchamcongs().remove(nvBangchamcong);
		nvBangchamcong.setBangchamcong(null);

		return nvBangchamcong;
	}

}