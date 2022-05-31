package hu.webuni.logistics.Jozsi.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Milestone {
	
	@Id
	@GeneratedValue
	private long id;
	private LocalDateTime planenedTime;
	
	@OneToMany(mappedBy = "milestone")
	private List<Section> section;
	
	@ManyToOne
	private Address address;
	
	public Milestone() {
	}

	public Milestone(long id, LocalDateTime planenedTime, Address address) {
		super();
		this.id = id;
		this.planenedTime = planenedTime;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getPlanenedTime() {
		return planenedTime;
	}

	public void setPlanenedTime(LocalDateTime planenedTime) {
		this.planenedTime = planenedTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
}
