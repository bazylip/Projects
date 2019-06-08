package employee;

public abstract class Employee {
    String firstName;
    String lastName;
    String department;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract Float calculateLastMonthSalary();
    public abstract void changeSalary();
    public abstract void promote();
    public abstract void degrade();
}
