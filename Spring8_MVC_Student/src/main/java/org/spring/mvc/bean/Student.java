package org.spring.mvc.bean;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull(message="This field is Mandatory")
	@Size(min=5, message="Enter")	
	private String fname;
	@NotEmpty(message="This field is Mandatory")
	private String lname;	
	private String qualification;
	private String country,gender;
	private String[] lang;
	private LinkedHashMap<String, String> countryOptions;
	@Min(value=18,message="Minimum age should be 18")
	@Max(value=35,message="Maximum age should be 35")
	private int age;
	
	@NotNull(message="This field is Mandatory")
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="Only 5 chars/digits")
	private String postalcode;
	
	public Student() {
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}	
	public String getQualification() {
		return qualification;
	}	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getLang() {
		return lang;
	}
	public void setLang(String[] lang) {
		this.lang = lang;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}	

	
}
