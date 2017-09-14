package org.sid.metier;

import java.util.List;

import org.sid.dao.PatientRepository;
import org.sid.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PatientMetierImpl implements PatientMetier {
	@Autowired
	private PatientRepository patientRepository;

	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}

	public List<Patient> lisPatients() {
		return patientRepository.findAll();
	}

	public Patient getPatient(Long codePatient) {
		return patientRepository.findOne(codePatient);
	}

	public void deletePatient(Long codePatient) {
		patientRepository.delete(codePatient);

	}

	public PagePatients getPagePatients(int page, int size) {
		Page<Patient> pagePat = patientRepository.getPagePatientRepository(new PageRequest(page, size));
		PagePatients pagePatients = new PagePatients();
		pagePatients.setNombrePatients(pagePat.getNumberOfElements());
		pagePatients.setPage(pagePat.getNumber());
		pagePatients.setPatients(pagePat.getContent());
		pagePatients.setTotalPages(pagePat.getTotalPages());
		pagePatients.setTotalPatients(pagePat.getSize());

		return pagePatients;
	}

}
