package org.glsid.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.glsid.entities.Compte;

public interface BanqueRmiRemote extends Remote {

	public Compte saveCompte(Compte cp) throws RemoteException;

	public Compte getCompte(String code) throws RemoteException;

	public boolean verser(String code, double montant, Long codeEmp)
			throws RemoteException;

	public boolean retirer(String code, double montant, Long codeEmp)
			throws RemoteException;

	public boolean virement(String compte1, String compte2, double montant,
			Long codeEmp) throws RemoteException;
}
