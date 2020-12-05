package org.hcl.Services;

import java.util.ArrayList;
import java.util.List;

import org.hcl.Emp;

public class EmployeeServiceimpl implements EmployeeService {
	List<Emp> employees = new ArrayList<>();

	@Override
	public boolean addEmployee(Emp e) {
		boolean b = false;
		b = employees.add(e);
		return b;
	}

	@Override
	public boolean deleteEmployee(Emp e) {
		boolean b = false;
		b = employees.remove(e);
		return b;
	}

	@Override
	public List<Emp> getEmployees() {
		return employees;
	}

	@Override
	public Emp getEmployee(int eno) {
		Emp e = null;
		for (Emp e1 : employees) {
			if (e1.getEno() == eno) {
				e = e1;
				break;
			}
		}
		return e;
	}

}