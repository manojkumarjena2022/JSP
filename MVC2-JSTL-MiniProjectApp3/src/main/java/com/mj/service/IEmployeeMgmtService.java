package com.mj.service;

import java.util.List;

import com.mj.model.Employee;

public interface IEmployeeMgmtService {
	public List<Employee> fetchEmpsByDesg(String desg) throws Exception;
}
