package com.csi.service;

import com.csi.dao.DepartmentDaoImpl;
import com.csi.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl {

    @Autowired
    DepartmentDaoImpl departmentDao;

    public Department saveData(Department department) {
        return
                departmentDao.saveData(department);
    }

    public Optional<Department> getDataById(int deptid) {
        return
                departmentDao.getDataById(deptid);
    }

}
