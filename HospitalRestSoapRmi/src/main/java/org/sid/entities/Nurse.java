package org.sid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("SON")
@Entity
public class Nurse extends OperationStaff {

	public Nurse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nurse(Date joinedDate, Departement departement) {
		super(joinedDate, departement);
		// TODO Auto-generated constructor stub
	}

	public Nurse(String namePerson, Date birthDate, String gender) {
		super(namePerson, birthDate, gender);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
