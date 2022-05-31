package hu.webuni.logistics.Jozsi.dto;

public class TransportPlanDto {
	
	
	private long id;
	private String name;
	private String iata;
	
	public TransportPlanDto() {
	}

	public TransportPlanDto(long id, String name, String iata) {
		super();
		this.id = id;
		this.name = name;
		this.iata = iata;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}


}
