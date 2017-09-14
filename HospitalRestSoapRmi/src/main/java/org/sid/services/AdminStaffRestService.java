package org.sid.services;

import java.util.List;

import org.sid.entities.AdminStaff;
import org.sid.metier.AdminStaffMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminStaffRestService {
	
	@Autowired
	private AdminStaffMetier adminStaffMetier;

	@RequestMapping(value="/adminstaffs",method=RequestMethod.POST)
	public AdminStaff save(@RequestBody AdminStaff adminStaff) {
		return adminStaffMetier.save(adminStaff);
	}
	@RequestMapping(value = "/adminstaffs", method = RequestMethod.GET)
	public List<AdminStaff> listAdminStaffs() {
		return adminStaffMetier.listAdminStaffs();
	}

}
