package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeHospital;
	private String nomHospital;
	private String adresseHospital;


	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(String nomHospital, String adresseHospital) {
		super();
		this.nomHospital = nomHospital;
		this.adresseHospital = adresseHospital;
	}

	public Long getCodeHospital() {
		return codeHospital;
	}

	public void setCodeHospital(Long codeHospital) {
		this.codeHospital = codeHospital;
	}

	public String getNomHospital() {
		return nomHospital;
	}

	public void setNomHospital(String nomHospital) {
		this.nomHospital = nomHospital;
	}

	public String getAdresseHospital() {
		return adresseHospital;
	}

	public void setAdresseHospital(String adresseHospital) {
		this.adresseHospital = adresseHospital;
	}


}
