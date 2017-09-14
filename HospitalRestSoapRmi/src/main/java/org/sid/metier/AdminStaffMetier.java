package org.sid.metier;

import java.util.List;

import org.sid.entities.AdminStaff;

public interface AdminStaffMetier {
	
	public AdminStaff save(AdminStaff adminStaff);
	public List<AdminStaff> listAdminStaffs();

}
