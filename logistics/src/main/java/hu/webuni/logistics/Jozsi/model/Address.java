package hu.webuni.logistics.Jozsi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address {	

	@Id
	@GeneratedValue
	private Long id;
	private String country;
	private String city;
	private String street;
	private int zipcode;
	private int Housenumber;
	private String width;
	private String length;
	
	@OneToMany(mappedBy = "address")
	private List<Milestone> milestones;
	
	public Address() {
		
	}
	
	
	public Address(Long id, String country, String city, String street, int zipcode, int housenumber, String width,
			String length, List<Milestone> milestones) {
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


	public Object getAddressId() {
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	

}
