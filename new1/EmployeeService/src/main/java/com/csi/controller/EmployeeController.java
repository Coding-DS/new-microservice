package com.csi.controller;

import com.csi.VO.RestTemplateVO;
import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.saveData(employee));
    }

    @GetMapping("/{empId}")
    public ResponseEntity<RestTemplateVO> getDataById(@PathVariable int empId){
        return
                ResponseEntity.ok(employeeService.getDataById(empId));
    }

}
