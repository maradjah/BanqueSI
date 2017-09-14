package org.sid.metier;

import java.util.List;

import org.sid.dao.HospitalRepository;
import org.sid.entities.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalMetierImpl implements HospitalMetier {
	
	@Autowired
	private HospitalRepository hospitalRepository;

	public Hospital save(Hospital hospital) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Hospital> listHospitals() {
		// TODO Auto-generated method stub
		return null;
	}

}
