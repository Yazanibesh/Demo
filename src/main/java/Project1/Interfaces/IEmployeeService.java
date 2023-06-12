package Project1.Interfaces;

import Project1.Model.Employee;
import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    boolean createEmployee(Employee employee);
    boolean updateEmployee(Long id, Employee employee);
    boolean deleteEmployee(Long id);
}