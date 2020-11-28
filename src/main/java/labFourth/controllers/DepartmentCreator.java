package labFourth.controllers;

import labFourth.models.department.Department;

public class DepartmentCreator {
    public Department department;

    public DepartmentCreator(String name) {
        this.department = new Department(name);
    }
}
