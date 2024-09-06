package codes.employee.my_project.service;

import codes.employee.my_project.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteById(Long id);
}
