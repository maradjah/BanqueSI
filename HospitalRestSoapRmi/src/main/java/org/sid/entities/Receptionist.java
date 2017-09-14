package org.sid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("SAR")
@Entity
public class Receptionist extends AdminStaff {

	public Receptionist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Receptionist(Date joinedDate, Departement departement) {
		super(joinedDate, departement);
		// TODO Auto-generated constructor stub
	}

	public Receptionist(String namePerson, Date birthDate, String gender) {
		super(namePerson, birthDate, gender);
		// TODO Auto-generated constructor stub
	}

}
