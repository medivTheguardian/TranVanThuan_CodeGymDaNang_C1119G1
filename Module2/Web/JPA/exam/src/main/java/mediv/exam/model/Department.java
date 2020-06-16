package mediv.exam.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namedepartment;

    @OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
    private List<Employee> employees;

    public Department() {
    }

    public Department(String namedepartment, List<Employee> employees) {
        this.namedepartment = namedepartment;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamedepartment() {
        return namedepartment;
    }

    public void setNamedepartment(String namedepartment) {
        this.namedepartment = namedepartment;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
