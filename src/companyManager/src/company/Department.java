package company;

import employee.Employee;
import employee.Manager;

import java.util.List;

public class Department {
    String departmentName;
    Integer departmentSize;
    List<Employee> staff;
    Manager departmentHead;

    public Department(String departmentName, Integer departmentSize, List<Employee> staff, Manager departmentHead) {
        this.departmentName = departmentName;
        this.departmentSize = departmentSize;
        this.staff = staff;
        this.departmentHead = departmentHead;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentSize() {
        return departmentSize;
    }

    public void setDepartmentSize(Integer departmentSize) {
        this.departmentSize = departmentSize;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }

    public Manager getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(Manager departmentHead) {
        this.departmentHead = departmentHead;
    }

    public Department addNewEmployee(Employee employee) {
        this.staff.add(employee);
        return this;
    }
}
