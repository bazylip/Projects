package company;

import employee.Executive;

import java.util.List;

public class Company {
    String name;
    Integer companySize;
    List<Department> departmentList;
    Executive CEO;

    public Company(String name, Integer companySize, List<Department> departmentList, Executive CEO) {
        this.name = name;
        this.companySize = companySize;
        this.departmentList = departmentList;
        this.CEO = CEO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCompanySize() {
        return companySize;
    }

    public void setCompanySize(Integer companySize) {
        this.companySize = companySize;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public Executive getCEO() {
        return CEO;
    }

    public void setCEO(Executive CEO) {
        this.CEO = CEO;
    }

    public Company addNewDepartment(Department department) {
        this.departmentList.add(department);
        return this;
    }

    public String companyToJSON() {
        return null;
    }
}
