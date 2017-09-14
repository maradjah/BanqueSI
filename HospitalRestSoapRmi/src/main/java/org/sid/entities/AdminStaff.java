package org.sid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_ADMIN_STAFF", length = 3, discriminatorType = DiscriminatorType.STRING)
@Entity
public class AdminStaff extends Staff {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminStaff() {
		super();
	}

	public AdminStaff(Date joinedDate, Departement departement) {
		super(joinedDate, departement);
	}

	public AdminStaff(String namePerson, Date birthDate, String gender) {
		super(namePerson, birthDate, gender);
	}

}
