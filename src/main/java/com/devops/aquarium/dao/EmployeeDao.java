package com.devops.aquarium.dao;

import com.devops.aquarium.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
    //public List<Employee> findAllEmployees();
    //public Employee findEmployeeById(int id);
    //public Employee saveEmployee(Employee employee);

    //Methods block :: Can be auto-generated : No need to be declared
    Employee findById(int id);

    //Methods block :: SQL Query deducted by JPA : Prototype Declaration required
    List<Employee> findByIdGreaterThan(int id);
    //Employee findByName(String test);
    //void update(Employee employee);
}
