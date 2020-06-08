package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the lichlamviec database table.
 * 
 */
@Entity
@NamedQuery(name="Lichlamviec.findAll", query="SELECT l FROM Lichlamviec l")
public class Lichlamviec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long llvid;

	private String thoigian;

	//bi-directional many-to-one association to Chitietlichlamviec
	@OneToMany(mappedBy="lichlamviec", cascade={CascadeType.ALL})
	private List<Chitietlichlamviec> chitietlichlamviecs;

	//bi-directional many-to-one association to NvLichlamviec
	@OneToMany(mappedBy="lichlamviec", cascade={CascadeType.ALL})
	private List<NvLichlamviec> nvLichlamviecs;

	public Lichlamviec() {
	}

	public long getLlvid() {
		return this.llvid;
	}

	public void setLlvid(long llvid) {
		this.llvid = llvid;
	}

	public String getThoigian() {
		return this.thoigian;
	}

	public void setThoigian(String thoigian) {
		this.thoigian = thoigian;
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
		chitietlichlamviec.setLichlamviec(this);

		return chitietlichlamviec;
	}

	public Chitietlichlamviec removeChitietlichlamviec(Chitietlichlamviec chitietlichlamviec) {
		getChitietlichlamviecs().remove(chitietlichlamviec);
		chitietlichlamviec.setLichlamviec(null);

		return chitietlichlamviec;
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
		nvLichlamviec.setLichlamviec(this);

		return nvLichlamviec;
	}

	public NvLichlamviec removeNvLichlamviec(NvLichlamviec nvLichlamviec) {
		getNvLichlamviecs().remove(nvLichlamviec);
		nvLichlamviec.setLichlamviec(null);

		return nvLichlamviec;
	}

}