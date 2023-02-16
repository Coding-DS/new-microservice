package com.csi.service;

import com.csi.VO.RestTemplateVO;
import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDao;

    public Employee saveData(Employee employee) {
      return  employeeDao.saveData(employee);
    }

    public RestTemplateVO getDataById(int empId) {
       return employeeDao.getDataById(empId);
    }
}
