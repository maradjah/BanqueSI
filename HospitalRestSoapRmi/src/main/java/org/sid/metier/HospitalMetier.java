package org.sid.metier;

import java.util.List;

import org.sid.entities.Hospital;

public interface HospitalMetier {
	
	public Hospital save(Hospital hospital);
	public List<Hospital> listHospitals();
}
