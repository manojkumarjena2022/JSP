package com.mj.service;

import com.mj.bean.Employee;

public class PaySlipGenerateService {
	public void generatePaySlip(Employee employee)
	{
		//calculate gross salary and net salary
		Float basicSalary=employee.getBasicSalary();
		Float grossSalary=basicSalary+(basicSalary*0.4f);
		Float netSalary=grossSalary-(grossSalary*0.2f);
		//set generated grossSalary and netSalary back to java bean class
		employee.setGrossSalary(grossSalary);
		employee.setNetSalary(netSalary);
	}

}
