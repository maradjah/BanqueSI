package org.sid.metier;

import java.util.List;

import org.sid.dao.AdminStaffRepository;
import org.sid.entities.AdminStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminStaffMetierImpl implements AdminStaffMetier {
	@Autowired
	private AdminStaffRepository adminStaffRepository;

	public AdminStaff save(AdminStaff adminStaff) {
		return adminStaffRepository.save(adminStaff);
	}

	public List<AdminStaff> listAdminStaffs() {
		return adminStaffRepository.findAll();
	}

}
