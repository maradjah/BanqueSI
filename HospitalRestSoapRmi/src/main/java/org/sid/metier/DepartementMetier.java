package org.sid.metier;

import java.util.List;

import org.sid.entities.Departement;

public interface DepartementMetier {
	
	public Departement save (Departement Departement);
	public List<Departement> listDepartements();
}
