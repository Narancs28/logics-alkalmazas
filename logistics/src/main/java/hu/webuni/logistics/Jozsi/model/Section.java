package hu.webuni.logistics.Jozsi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Section {
	
	
	@Id
	@GeneratedValue
	private long id;
	private String fromMilestone;
	private String ToMilestone;
	
	@ManyToOne
	private Milestone milestone;
	
	public Section() {
	}
	
	public Section(long id, String fromMilestone, String toMilestone) {
		super();
		this.id = id;
		this.fromMilestone = fromMilestone;
		ToMilestone = toMilestone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFromMilestone() {
		return fromMilestone;
	}

	public void setFromMilestone(String fromMilestone) {
		this.fromMilestone = fromMilestone;
	}

	public String getToMilestone() {
		return ToMilestone;
	}

	public void setToMilestone(String toMilestone) {
		ToMilestone = toMilestone;
	}
	
	
	

}
