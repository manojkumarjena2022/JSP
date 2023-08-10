package com.mj.dao;

import java.util.List;

import com.mj.model.Employee;

public interface IEmployeeDao {
	public List<Employee> getEmpsByDesg(String desg) throws Exception;
}
