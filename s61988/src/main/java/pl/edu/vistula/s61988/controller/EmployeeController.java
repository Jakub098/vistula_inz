package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Employee;
import pl.edu.vistula.s61988.service.EmployeeService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService pracownikService;

    @GetMapping("/employees")
    @JsonView(Views.EmployeeView.class)
    @CrossOrigin
    public List<Employee> getAllEmployees() {
        return pracownikService.getAllEmployees();
    }
}
