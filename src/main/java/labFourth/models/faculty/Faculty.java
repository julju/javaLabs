package labFourth.models.faculty;

import labFourth.models.department.Department;
import labFourth.models.common.Organization;

public class Faculty extends Organization<Department> {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "{head="+head+
                ", name="+name+
                ", structure="+structure+
                "}";
    }
}
