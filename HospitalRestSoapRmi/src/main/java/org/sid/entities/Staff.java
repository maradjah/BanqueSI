package org.sid.entities;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Staff extends Person {

	private Date joinedDate;

	@ManyToOne
	@JoinColumn(name = "STAFF_DEPT")
	private Departement departement;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String namePerson, Date birthDate, String gender) {
		super(namePerson, birthDate, gender);
		// TODO Auto-generated constructor stub
	}

	public Staff(Date joinedDate, Departement departement) {
		super();
		this.joinedDate = joinedDate;
		this.departement = departement;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

}
