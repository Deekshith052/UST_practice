package com.demo.department_service.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DepartmentPojo {
	private long deptId;
	private String deptName;
	private List<EmployeePojo> allEmployees;
	
	public DepartmentPojo() {
	}
	
	public DepartmentPojo(long deptId, String deptName, List<EmployeePojo> allEmployees) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.allEmployees = allEmployees;
	}
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<EmployeePojo> getAllEmployees() {
		return allEmployees;
	}
	public void setAllEmployees(List<EmployeePojo> allEmployees) {
		this.allEmployees = allEmployees;
	}
	
}
