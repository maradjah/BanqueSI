package org.glsid.rmi;

import java.rmi.RemoteException;

import org.glsid.entities.Compte;
import org.glsid.metier.CompteMetier;
import org.glsid.metier.OperationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myRmiService")
public class BanqueRmiImpl implements BanqueRmiRemote {

	@Autowired
	private CompteMetier compteMetier;
	@Autowired
	private OperationMetier operationMetier;

	public Compte saveCompte(Compte cp) throws RemoteException {
		return compteMetier.saveCompte(cp);
	}

	public Compte getCompte(String code) throws RemoteException {

		return compteMetier.getCompte(code);
	}

	public boolean verser(String code, double montant, Long codeEmp)
			throws RemoteException {
		return operationMetier.verser(code, montant, codeEmp);
	}

	public boolean retirer(String code, double montant, Long codeEmp)
			throws RemoteException {
		return operationMetier.retirer(code, montant, codeEmp);
	}

	public boolean virement(String compte1, String compte2, double montant,
			Long codeEmp) throws RemoteException {
		return operationMetier.virement(compte1, compte2, montant, codeEmp);
	}

}
