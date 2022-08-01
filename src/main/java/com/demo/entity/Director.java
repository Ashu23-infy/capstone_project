package com.demo.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Director {
	@Id
	private Integer directorId;
	private String firstName;
	private String lastName;
	private String address;
	private Integer contactNumber;
	private String email;
	
	@ManyToMany(mappedBy = "director")
	private  Set<Movie> movie = new HashSet<>();
	
	public Director() {
		
	}
	public Director(Integer directorId, String firstName, String lastName, String address, Integer contactNumber,
			String email) {
		super();
		this.directorId = directorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
	}
	
	public Set<Movie> getMovie() {
		return movie;
	}
	public void setMovie(Set<Movie> movie) {
		this.movie = movie;
	}
	public Integer getDirectorId() {
		return directorId;
	}
	public void setDirectorId(Integer directorId) {
		this.directorId = directorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", contactNumber=" + contactNumber + ", email=" + email + "]";
	}
	

}
