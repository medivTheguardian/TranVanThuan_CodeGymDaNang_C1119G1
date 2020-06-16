package mediv.exam.service;

import mediv.exam.model.Employee;

import java.util.Optional;

public interface EmployeeService {

    Employee save(Employee employee);

    void delete(Employee employee);

    Optional<Employee> findById(Long id);
}
