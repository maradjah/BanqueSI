package org.sid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("SOD")
@Entity
public class Doctor extends OperationStaff {
	
	private String speciality;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Date joinedDate, Departement departement) {
		super(joinedDate, departement);
		// TODO Auto-generated constructor stub
	}

	public Doctor(String namePerson, Date birthDate, String gender) {
		super(namePerson, birthDate, gender);
		// TODO Auto-generated constructor stub
	}

	public Doctor(String speciality) {
		super();
		this.speciality = speciality;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	
	
	

}
