package org.glsid.metier;

import java.util.List;

import org.glsid.dao.EmployeRepository;
import org.glsid.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeMetierImpl implements EmployeMetier {
	@Autowired
	private EmployeRepository empRepo;

	public Employe saveEmploye(Employe emp) {
		return empRepo.save(emp);
	}

	public List<Employe> listEmploye() {
		return empRepo.findAll();
	}

}
