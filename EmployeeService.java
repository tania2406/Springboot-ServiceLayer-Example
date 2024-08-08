package com.example.Service_Crud_example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository erepo;
	public Employee addEmployee(Employee employee)
	{
		return erepo.save(employee);
		
	}
	public List<Employee> addEmployees(List<Employee> employees)
	{
		return erepo.saveAll(employees);
	}
	public List<Employee> allemp()
	{
		return erepo.findAll();
	}
	public Optional<Employee> getById(int id)
	{
		return erepo.findById(id);
				
	}
	public Employee update(int id,Employee employee)
	{
		employee.setId(id);
		return erepo.save(employee);
	}
	public String delete(int id)
	{
		erepo.deleteById(id);
		return "data deleted";
	}
}
