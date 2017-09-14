package org.sid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("SAD")
@Entity
public class Director extends AdminStaff {

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(Date joinedDate, Departement departement) {
		super(joinedDate, departement);
		// TODO Auto-generated constructor stub
	}

	public Director(String namePerson, Date birthDate, String gender) {
		super(namePerson, birthDate, gender);
		// TODO Auto-generated constructor stub
	}
	

}
