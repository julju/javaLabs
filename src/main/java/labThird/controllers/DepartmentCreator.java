package labThird.controllers;

import labThird.models.department.Department;

public class DepartmentCreator {
    public Department department;

    public DepartmentCreator(String name) {
        this.department = new Department(name);
    }
}
