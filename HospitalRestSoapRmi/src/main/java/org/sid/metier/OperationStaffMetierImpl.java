package org.sid.metier;

import java.util.List;

import org.sid.dao.OperationStaffRepository;
import org.sid.entities.OperationStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationStaffMetierImpl implements OperationStaffMetier {
	@Autowired
	private OperationStaffRepository operationStaffRepository;

	public OperationStaff save(OperationStaff operationStaff) {
		return operationStaffRepository.save(operationStaff);
	}

	public List<OperationStaff> listOperationStaffs() {
		return operationStaffRepository.findAll();
	}

}
