package com.mj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.mj.model.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
	private final String GET_EMPS_BY_DESG="SELECT EMPNO,ENAME,DESG,SAL FROM EMPLOYEE WHERE DESG=?";
	List<Employee> emList=null;
	@Override
	public List<Employee> getEmpsByDesg(String desg) throws Exception {
		try(Connection con=getPooledConnection()){
			PreparedStatement ps=con.prepareStatement(GET_EMPS_BY_DESG);
			//set query param value
			ps.setString(1, desg);
			try(ResultSet rs=ps.executeQuery()){
				emList=new ArrayList();
				while (rs.next()) {
					Employee emp=new Employee();
					emp.setEno(rs.getInt("empno"));
					emp.setEname(rs.getString("ename"));
					emp.setDesg(rs.getString("desg"));
					emp.setSalary(rs.getFloat("sal"));
					emList.add(emp);
				}
			}
		}
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return emList;
	}
	private Connection getPooledConnection() throws Exception {
		InitialContext ic=new InitialContext();
		DataSource ds=(DataSource) ic.lookup("java:/comp/env/DsJndi");
		return ds.getConnection();
	}

}
