package com.jobs.application;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){		
	}	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		
	}
	public void createVolunteer(String name, String address, String phone, String description) throws Exception{
		Volunteer volunteer = new Volunteer(name, address, phone,  description);
		repository.addMember(volunteer);
		
	}


	public void payAllEmployeers() {
		List<AbsStaffMember> miembros = this.repository.getAllMembers();
		for(AbsStaffMember m: miembros)
		{
			m.pay();
		}
	
	}

	public String getAllEmployees() {
		List<AbsStaffMember> miembros = this.repository.getAllMembers();
		return miembros.toString();
		
	}
	
}
