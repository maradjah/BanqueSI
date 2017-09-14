package org.sid.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Patient extends Person {
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date entryDate;
	private String sickness;

	@OneToMany(mappedBy = "patient")
	private Collection<OperationStaff> operationStaffs;

	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String namePerson, Date birthDate, String gender) {
		super(namePerson, birthDate, gender);
		// TODO Auto-generated constructor stub
	}

	public Patient(Date entryDate, String sickness,
			Collection<OperationStaff> operationStaffs) {
		super();
		this.entryDate = entryDate;
		this.sickness = sickness;
		this.operationStaffs = operationStaffs;
	}

	public Patient(Date entryDate, String sickness) {
		super();
		this.entryDate = entryDate;
		this.sickness = sickness;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getSickness() {
		return sickness;
	}

	public void setSickness(String sickness) {
		this.sickness = sickness;
	}

	@JsonIgnore
	public Collection<OperationStaff> getOperationStaffs() {
		return operationStaffs;
	}

	@JsonSetter
	public void setOperationStaffs(Collection<OperationStaff> operationStaffs) {
		this.operationStaffs = operationStaffs;
	}

}
