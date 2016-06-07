package com.springapp.supermarket.controller;

import com.springapp.supermarket.entity.Employee;
import com.springapp.supermarket.service.DepartmentService;
import com.springapp.supermarket.service.EmployeeService;
import com.springapp.supermarket.service.SpecialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// DONE!
@RequestMapping("/supermarket")
@Controller
public class EmployeeController {

    // Inject of entities
    @Autowired
    private Employee employee;

    // Inject of services
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private SpecialisationService specialisationService;

    // Return page with all entities "Employee" in db
    @RequestMapping("allemployees")
    public String viewAllEmployees(Model model) {
        List listEmployees = employeeService.getAllEmployee();
        model.addAttribute("listEmployees", listEmployees);
        return "employee/employee";
    }

    // Remove entities "Employee" id db with help browser
    @RequestMapping("removeEmployee/{idEmployee}")
    public String removeEmployees(@PathVariable("idEmployee") int idEmployee) {
        employeeService.removeEmployee(employeeService.getOneEmployee(idEmployee));
        return "redirect:/supermarket/allemployees/";
    }

    // Return form for editing employee by id
    @RequestMapping(value = "editEmployee/{idEmployee}", method = RequestMethod.GET)
    public ModelAndView editEmployee(@PathVariable("idEmployee") int idEmployee) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(employeeService.getOneEmployee(idEmployee));
        modelAndView.addObject("listSpecialisation", specialisationService.getAllSpecialisation());
        modelAndView.addObject("listDepartment", departmentService.getAllDepartment());
        modelAndView.setViewName("employee/editEmployee");
        return modelAndView;
    }

    // Send edited employee in service
    @RequestMapping(value = "updateEmployee", method = RequestMethod.POST)
    public String updateEmployee(@RequestParam("idEmployee") int idEmployee,
                                 @RequestParam("name") String name,
                                 @RequestParam("surename") String surname,
                                 @RequestParam("nameDepartment") String nameDepartment,
                                 @RequestParam("nameSpecialisation") String nameSpecialisation) {
        employee.setIdEmployee(idEmployee);
        employee.setNameEmployee(name);
        employee.setSurenameEmployee(surname);
        employee.setDepartmentEmployee(departmentService.getOneDepartment(nameDepartment));
        employee.setSpecialisation(specialisationService.getOneSpecialisation(nameSpecialisation));
        employeeService.updateEmployee(employee);
        return "redirect:/supermarket/allemployees/";
    }

    // Return registration form for new employee
    @RequestMapping(value = "addNewEmployee", method = RequestMethod.GET)
    public ModelAndView addEmployee() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employee/addEmployee");
        modelAndView.addObject("listDepartment", departmentService.getAllDepartment());
        modelAndView.addObject("listSpecialisation", specialisationService.getAllSpecialisation());
        return modelAndView;
    }

    // Send new employee to service
    @RequestMapping(value = "successAdding", method = RequestMethod.POST)
    public String addEmployeeToDB(@RequestParam("name") String nameEmployee,
                                  @RequestParam("surename") String surenameEmployee,
                                  @RequestParam("nameDepartment") String nameDepartment,
                                  @RequestParam("nameSpecialisation") String nameSpecialisation) {
        employee.setDepartmentEmployee(departmentService.getOneDepartment(nameDepartment));
        employee.setSpecialisation(specialisationService.getOneSpecialisation(nameSpecialisation));
        employee.setNameEmployee(nameEmployee);
        employee.setSurenameEmployee(surenameEmployee);
        employeeService.addNewEmployee(employee);
        return "redirect:/supermarket/allemployees/";
    }
}