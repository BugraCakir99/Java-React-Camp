package Entities.concretes;
import java.time.LocalDate;

import Entities.abstracts.Entity;

public class Customer implements Entity {

	private int customerId;
	private String name;
	private String lastName;
	private LocalDate dateOfBirth;
	
	private String NationalityId;
	
	public Customer(int customerId, String name, String lastName, LocalDate dateOfBirth, String nationalityýd) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.NationalityId = nationalityýd;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityýd) {
		NationalityId = nationalityýd;
	}
	
	
	
	
	
}
