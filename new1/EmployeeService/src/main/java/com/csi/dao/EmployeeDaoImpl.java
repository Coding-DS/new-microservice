package com.csi.dao;

import com.csi.VO.Department;
import com.csi.VO.RestTemplateVO;
import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    RestTemplate  restTemplate;

    public Employee saveData(Employee employee) {
        return employeeRepo.save(employee);

    }

    public RestTemplateVO getDataById(int empId) {

        RestTemplateVO restTemplateVO = new RestTemplateVO();

        Employee employee = employeeRepo.findByEmpId(empId);
        Department department = restTemplate.getForObject("http://DepartmentService/department/"+employee.getDeptId(), Department.class);
        restTemplateVO.setEmployee(employee);
        restTemplateVO.setDepartment(department);

        return restTemplateVO;

    }
}
