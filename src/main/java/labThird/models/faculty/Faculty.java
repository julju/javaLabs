package labThird.models.faculty;

import labThird.models.common.Organization;
import labThird.models.department.Department;

public class Faculty extends Organization<Department> {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty { " +
                "head = " + head +
                ", faculty_name = '" + name + '\'' +
                ", structure = " + structure +
                " } ";
    }
}
