package org.glsid.services;


import org.glsid.metier.OperationMetier;
import org.glsid.metier.PageOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationRestService {
	@Autowired
	private OperationMetier operationMetier;

	@RequestMapping(value = "/versement", method = RequestMethod.PUT)
	public boolean verser(@RequestParam String code,
			@RequestParam double montant, @RequestParam Long codeEmp) {
		return operationMetier.verser(code, montant, codeEmp);
	}

	@RequestMapping(value = "/retrait", method = RequestMethod.PUT)
	public boolean retirer(@RequestParam String code,
			@RequestParam double montant, @RequestParam Long codeEmp) {
		return operationMetier.retirer(code, montant, codeEmp);
	}

	@RequestMapping(value = "/virement", method = RequestMethod.PUT)
	public boolean virement(@RequestParam String compte1,
			@RequestParam String compte2, @RequestParam double montant,
			@RequestParam Long codeEmp) {
		return operationMetier.virement(compte1, compte2, montant, codeEmp);
	}

	/** Avec pagination **/

	@RequestMapping(value = "/operations", method = RequestMethod.GET)
	public PageOperations getOperations(@RequestParam String codeComtpe,
			@RequestParam int page, @RequestParam int size) {
		return operationMetier.getOperations(codeComtpe, page, size);
	}
	/** Sans pagination **/

	// @RequestMapping(value = "/operations/{cp}", method = RequestMethod.GET)
	// public Collection<Operation> listOperations(@PathVariable String cp) {
	// return operationMetier.listOperations(cp);
	// }

}
