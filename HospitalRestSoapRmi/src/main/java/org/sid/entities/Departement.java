package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Departement implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeDepartement;
	private String nomDepartement;

	@ManyToOne
	@JoinColumn(name = "HOSPITAL")
	private Hospital hospital;

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement(String nomDepartement) {
		super();
		this.nomDepartement = nomDepartement;
	}

	public Long getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(Long codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomDepartement() {
		return nomDepartement;
	}

	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

}
