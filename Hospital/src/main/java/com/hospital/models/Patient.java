package com.hospital.models;

public class Patient {
	
	int Id;
	String SSN;
	String first_name;
	String last_name;
	String gender;
	String phone_number;
	String email;
	String address;
	int IdRace;
	

	
	public Patient(int id, String sSN, String first_name, String last_name, String gender, String phone_number,
			String email, String address, int idRace) {
		super();
		Id = id;
		SSN = sSN;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.phone_number = phone_number;
		this.email = email;
		this.address = address;
		IdRace = idRace;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIdRace() {
		return IdRace;
	}
	public void setIdRace(int idRace) {
		IdRace = idRace;
	}
	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", SSN=" + SSN + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", gender=" + gender + ", phone_number=" + phone_number + ", email=" + email + ", address=" + address
				+ ", IdRace=" + IdRace + "]";
	}

	

}
