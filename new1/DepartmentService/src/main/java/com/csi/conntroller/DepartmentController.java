package com.csi.conntroller;

import com.csi.model.Department;
import com.csi.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentService;

    @PostMapping("/")
    public ResponseEntity<Department> saveData(@RequestBody Department department){
        return  ResponseEntity.ok(departmentService.saveData(department));
    }

    @GetMapping("/{deptid}")
    public ResponseEntity<Optional<Department>> getDataById(@PathVariable int deptid){
        return
                ResponseEntity.ok(departmentService.getDataById(deptid));
    }



}
