package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the taikhoan database table.
 * 
 */
@Entity
@NamedQuery(name="Taikhoan.findAll", query="SELECT t FROM Taikhoan t")
public class Taikhoan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Temporal(TemporalType.DATE)
	private Date createday;

	private String name;

	private String password;

	public Taikhoan() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateday() {
		return this.createday;
	}

	public void setCreateday(Date createday) {
		this.createday = createday;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}