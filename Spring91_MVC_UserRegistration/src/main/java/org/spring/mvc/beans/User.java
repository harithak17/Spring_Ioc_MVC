package org.spring.mvc.beans;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User {

	private int id;	
	
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email should be valid")
    private String email;
    @NotBlank(message = "Phone cannot be blank")
    @Pattern(regexp="[0-9]+", message="Phone should contain only digits")
    private String phone;
    @NotBlank(message = "Date of Birth cannot be blank")
    private String dob;  // Date of Birth
    @AssertTrue(message = "Subscription should be checked")
    private boolean subscribed;  // Checkbox
    @NotBlank(message = "Gender cannot be blank")
    private String gender;  // Radio button
    @NotNull(message = "Country cannot be null")
    private String country;  // Dropdown
    
	public User() {
		super();		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public boolean isSubscribed() {
		return subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob
				+ ", subscribed=" + subscribed + ", gender=" + gender + ", country=" + country + "]";
	}
    
    
}
