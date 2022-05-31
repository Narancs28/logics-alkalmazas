package hu.webuni.logistics.Jozsi.dto;

import com.fasterxml.jackson.annotation.JsonView;

public class AddressDto {

	@JsonView(View.BaseData.class)
	private Long id;
	
	@JsonView(View.BaseData.class)
	private String country;
	
	@JsonView(View.BaseData.class)
	private String city;
	
	@JsonView(View.BaseData.class)
	private String street;
	
	@JsonView(View.BaseData.class)
	private int zipcode;
	
	@JsonView(View.BaseData.class)
	private int Housenumber;
	
	@JsonView(View.BaseData.class)
	private String width;
	
	@JsonView(View.BaseData.class)
	private String length;

	public AddressDto(Long id, String country, String city, String street, int zipcode, int housenumber, String width,
			String length) {
		super();
		this.id = id;
		this.country = country;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
		Housenumber = housenumber;
		this.width = width;
		this.length = length;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getHousenumber() {
		return Housenumber;
	}

	public void setHousenumber(int housenumber) {
		Housenumber = housenumber;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}
	

	
	
	
	
	
	
	
	
	
	
	

}
