package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    private String empName;

    private String empPosition;

    private long empContact;

    @JsonFormat(pattern = "dd-mm-yyyy" , timezone = "asia/kolkata")
    private Date empDob;

    private String empAdd;

    private boolean isActive;

    private int deptId;



}
