package com.csi.dao;

import com.csi.model.Department;
import com.csi.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DepartmentDaoImpl {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveData(Department department) {
        return departmentRepository.save(department);
    }

    public Optional<Department> getDataById(int deptid) {
        return
                departmentRepository.findById(deptid);
    }


}
