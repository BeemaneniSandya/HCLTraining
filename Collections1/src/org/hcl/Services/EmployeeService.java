package org.hcl.Services;

import java.util.List;

import org.hcl.Emp;

public interface EmployeeService {
	boolean addEmployee(Emp e);

	boolean deleteEmployee(Emp e);

	List<Emp> getEmployees();

	Emp getEmployee(int eno);
}
