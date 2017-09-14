package org.glsid.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.glsid.entities.Compte;
import org.glsid.metier.CompteMetier;
import org.glsid.metier.OperationMetier;
import org.glsid.metier.PageOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebService
public class OperationSoapService {
	@Autowired
	private OperationMetier operationMetier;
	@Autowired
	private CompteMetier compteMetier;

	@WebMethod
	public boolean verser(@WebParam(name = "code") String code,
			@WebParam(name = "montant") double montant,
			@WebParam(name = "codeEmp") Long codeEmp) {
		return operationMetier.verser(code, montant, codeEmp);
	}

	@WebMethod
	public boolean retirer(@WebParam(name = "code") String code,
			@WebParam(name = "montant") double montant,
			@WebParam(name = "codeEmp") Long codeEmp) {
		return operationMetier.retirer(code, montant, codeEmp);
	}

	@WebMethod
	public boolean virement(@WebParam(name = "code1") String compte1,
			@WebParam(name = "code2") String compte2,
			@WebParam(name = "montant") double montant, @WebParam(name = "codeEmp")Long codeEmp) {
		return operationMetier.virement(compte1, compte2, montant, codeEmp);
	}

	@WebMethod
	public PageOperations getOperations(@WebParam(name = "code") String codeComtpe,
			@WebParam(name = "page") int page, @WebParam(name = "size") int size) {
		return operationMetier.getOperations(codeComtpe, page, size);
	}

	@WebMethod
	public Compte getCompte(@WebParam(name = "code") String codeCompte) {
		return compteMetier.getCompte(codeCompte);
	}

}
