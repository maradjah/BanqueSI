package org.sid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OPERATION_STAFF", length = 3, discriminatorType = DiscriminatorType.STRING)
@Entity
public class OperationStaff extends Staff {

	@ManyToOne
	@JoinColumn(name="STAFF_PATIENT")
	private Patient patient;

	public OperationStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OperationStaff(Date joinedDate, Departement departement) {
		super(joinedDate, departement);
		// TODO Auto-generated constructor stub
	}

	public OperationStaff(String namePerson, Date birthDate, String gender) {
		super(namePerson, birthDate, gender);
		// TODO Auto-generated constructor stub
	}

	public OperationStaff(Patient patient) {
		super();
		this.patient = patient;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	

	

}
