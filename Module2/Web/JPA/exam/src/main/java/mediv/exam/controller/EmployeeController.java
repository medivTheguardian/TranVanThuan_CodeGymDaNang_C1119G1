package mediv.exam.controller;

import mediv.exam.model.Employee;
import mediv.exam.repository.EmployeeRepository;
import mediv.exam.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/add")
    public ModelAndView showAddForm() {
        return new ModelAndView("/add", "employee", new Employee());
    }

    @PostMapping("/add")
    public ModelAndView saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("/add");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("massage", "New Employee added");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Optional<Employee> employee = employeeService.findById(id);
        if (employee != null) {
            return new ModelAndView("/delete", "employee", employee);
        } else {
            return new ModelAndView("/error");
        }
    }

    @PostMapping("/delete/")
    public String deleteEmployee(@ModelAttribute("employee") Employee employee) {
        employeeRepository.deleteById(employee.getId());
        return "/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Employee employee = employeeService.findById(id).orElse(null);

        if (employee != null) {
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("employee", employee);
            return modelAndView;
        } else {
            return new ModelAndView("/error");
        }
    }

    @PostMapping("/edit")
    public ModelAndView editEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("employee", employee);
        modelAndView.addObject("message", "Employee updated");
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView showAllEmployee(@PathVariable Long id) {
        Optional<Employee> employee = employeeService.findById(id);
        if (employee.isPresent()) {
            return new ModelAndView("/view", "employee", employee);

        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

}
