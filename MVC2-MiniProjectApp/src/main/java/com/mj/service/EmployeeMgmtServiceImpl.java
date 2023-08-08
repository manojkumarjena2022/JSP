package com.mj.service;

import java.util.List;

import com.mj.dao.EmployeeDaoImpl;
import com.mj.dao.IEmployeeDao;
import com.mj.model.Employee;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	private IEmployeeDao employeeDao;
	

	public EmployeeMgmtServiceImpl() {
		employeeDao=new EmployeeDaoImpl();
	}


	@Override
	public List<Employee> fetchEmpsByDesg(String desg) throws Exception {
		//use dao
		List<Employee> list=employeeDao.getEmpsByDesg(desg);
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.3f));
			emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*.2f));
		});
		return list;
	}

}
