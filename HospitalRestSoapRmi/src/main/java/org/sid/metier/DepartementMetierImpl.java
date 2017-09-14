package org.sid.metier;

import java.util.List;

import org.sid.dao.DepartementRepository;
import org.sid.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartementMetierImpl implements DepartementMetier {
	@Autowired
	private DepartementRepository departementRepository;

	public Departement save(Departement departement) {
		return departementRepository.save(departement);
	}

	public List<Departement> listDepartements() {
		return departementRepository.findAll();
	}

}
