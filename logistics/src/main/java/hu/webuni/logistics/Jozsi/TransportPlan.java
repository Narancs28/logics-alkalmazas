package hu.webuni.logistics.Jozsi;

import org.springframework.stereotype.Service;

@Service
public class TransportPlan {
	
	private String section;
	private float milestone;
	
	public TransportPlan(String section, float milestone) {
		super();
		this.section = section;
		this.milestone = milestone;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public float getMilestone() {
		return milestone;
	}

	public void setMilestone(float milestone) {
		this.milestone = milestone;
	}
	

}
