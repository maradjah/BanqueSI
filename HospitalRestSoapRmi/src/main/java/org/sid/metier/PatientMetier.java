package org.sid.metier;

import java.util.List;

import org.sid.entities.Patient;

public interface PatientMetier {

	public Patient save(Patient patient);

	public List<Patient> lisPatients();

	public Patient getPatient(Long codePatient);
	
	public void deletePatient(Long codePatient);
	
	public PagePatients getPagePatients(int page, int size);

}
