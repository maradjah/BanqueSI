package org.glsid.metier;


public interface OperationMetier {

	public boolean verser(String code, double montant, Long codeEmp);

	public boolean retirer(String code, double montant, Long codeEmp);

	public boolean virement(String compte1, String compte2, double montant,
			Long codeEmp);

	//public Collection<Operation> listOperations(String cp);

	public PageOperations getOperations(String codeComtpe, int page, int size);

}
