package org.sid.metier;

import java.util.List;

import org.sid.entities.OperationStaff;

public interface OperationStaffMetier {
	
	public OperationStaff save(OperationStaff operationStaff);
	public List<OperationStaff> listOperationStaffs();

}
