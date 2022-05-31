package hu.webuni.logistics.Jozsi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransportPlan {
	
	@Id
	@GeneratedValue
	private Long Id;
	private String proceeds;
	private String  section;

	
	public TransportPlan(Long id, String proceeds, String section) {
		super();
		Id = id;
		this.proceeds = proceeds;
		this.section = section;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getProceeds() {
		return proceeds;
	}

	public void setProceeds(String proceeds) {
		this.proceeds = proceeds;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	
	
	
	
	
	
	
	
	

}
