package nhom2.coffeeshop.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nhom database table.
 * 
 */
@Entity
@NamedQuery(name="Nhom.findAll", query="SELECT n FROM Nhom n")
public class Nhom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String name;

	public Nhom() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}