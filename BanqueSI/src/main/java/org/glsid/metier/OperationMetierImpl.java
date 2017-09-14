package org.glsid.metier;

import java.util.Collection;
import java.util.Date;

import org.glsid.dao.CompteRepository;
import org.glsid.dao.EmployeRepository;
import org.glsid.dao.OperationRepository;
import org.glsid.entities.Compte;
import org.glsid.entities.Employe;
import org.glsid.entities.Operation;
import org.glsid.entities.Retrait;
import org.glsid.entities.Versement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OperationMetierImpl implements OperationMetier {
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployeRepository employeRepository;

	@Transactional
	public boolean verser(String code, double montant, Long codeEmp) {

		Compte cp = compteRepository.findOne(code);
		cp.setSolde(cp.getSolde() + montant);
		compteRepository.save(cp);
		Operation op = new Versement(new Date(), montant);
		Employe emp = employeRepository.findOne(codeEmp);
		op.setEmploye(emp);
		op.setCompte(cp);
		operationRepository.save(op);
		return true;
	}

	@Transactional
	public boolean retirer(String code, double montant, Long codeEmp) {
		Compte cp = compteRepository.findOne(code);
		if (cp.getSolde() < montant)
			throw new RuntimeException("Solde Insuffisant");
		cp.setSolde(cp.getSolde() - montant);
		compteRepository.save(cp);
		Operation op = new Retrait(new Date(), montant);
		Employe emp = employeRepository.findOne(codeEmp);
		op.setEmploye(emp);
		op.setCompte(cp);
		operationRepository.save(op);
		return true;
	}

	@Transactional
	public boolean virement(String compte1, String compte2, double montant,
			Long codeEmp) {
		retirer(compte1, montant, codeEmp);
		verser(compte2, montant, codeEmp);
		return true;
	}

//	public Collection<Operation> listOperations(String cp) {
//
//		Compte compte = compteRepository.findOne(cp);
//		Collection<Operation> listOperation = compte.getOperations();
//		return listOperation;
//	}

	public PageOperations getOperations(String codeComtpe, int page, int size) {
		Page<Operation> ops = operationRepository.getOperationsRepo(codeComtpe,
				new PageRequest(page, size));

		PageOperations pageOperations = new PageOperations();
		pageOperations.setOperations(ops.getContent());
		pageOperations.setNombreOperations(ops.getNumberOfElements());
		pageOperations.setPage(ops.getNumber());
		pageOperations.setTotalOperations((int) ops.getTotalElements());
		pageOperations.setTotalPages(ops.getTotalPages());
		return pageOperations;
	}

}
