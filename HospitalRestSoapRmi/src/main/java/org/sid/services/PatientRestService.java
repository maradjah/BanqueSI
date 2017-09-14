package org.sid.services;

import java.util.List;

import org.sid.entities.Patient;
import org.sid.metier.PagePatients;
import org.sid.metier.PatientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientRestService {

	@Autowired
	private PatientMetier patientMetier;

	@RequestMapping(value = "/patients", method = RequestMethod.GET)
	public PagePatients getPagePatients(@RequestParam int page,
			@RequestParam int size) {
		return patientMetier.getPagePatients(page, size);
	}

	@RequestMapping(value = "/patient", method = RequestMethod.POST)
	public Patient save(@RequestBody Patient patient) {
		return patientMetier.save(patient);
	}

	// @RequestMapping(value = "/patients", method = RequestMethod.GET)
	// public List<Patient> lisPatients() {
	// return patientMetier.lisPatients();
	// }

	@RequestMapping(value = "/patients/{code}", method = RequestMethod.GET)
	public Patient getPatient(@PathVariable Long code) {
		return patientMetier.getPatient(code);
	}

	@RequestMapping(value = "/patients/deletePatient/{code}", method = RequestMethod.GET, produces = {
			"application/xml", "application/json" })
	public void suprimerPatient(@PathVariable("code") Long code) {
		patientMetier.deletePatient(code);
	}

}
