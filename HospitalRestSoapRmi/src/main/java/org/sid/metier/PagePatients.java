package org.sid.metier;

import java.io.Serializable;
import java.util.List;

import org.sid.entities.Patient;

public class PagePatients implements Serializable {
	private List<Patient> patients;
	private int page;
	private int nombrePatients;
	private int totalPatients;
	private int totalPages;

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getNombrePatients() {
		return nombrePatients;
	}

	public void setNombrePatients(int nombrePatients) {
		this.nombrePatients = nombrePatients;
	}

	public int getTotalPatients() {
		return totalPatients;
	}

	public void setTotalPatients(int totalPatients) {
		this.totalPatients = totalPatients;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}
