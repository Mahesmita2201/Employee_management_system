package com.jsp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DTO.Employee;

@Repository
public class EmployeeDAO {
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	
	public void saveEmp(Employee employee )
	{
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
	
	public Employee getEmp(Employee employee) {
		Employee emp=manager.find(Employee.class, employee.getId());
		return emp;
	}
	
	public String deleteEmp(Employee employee) {
		Employee emp=getEmp(employee);
		if(emp!=null) {
		transaction.begin();
		manager.remove(emp);
		transaction.commit();
		}else {
			return "Id not found";
		}
		return "deleted successfully";
	}
	public String updateEmployee(Employee employee) {
		Employee emp=getEmp(employee);
		if(emp!=null) {
		transaction.begin();
		manager.merge(employee);
		transaction.commit();
		}else {
			return "Id not found";
		}
		return "updated successfully";
	}
	public List<Employee> viewAllEmployee(){
		Query query =manager.createQuery("select e from Employee e");
		List<Employee> empList=query.getResultList();
		return empList;
	}	
}
