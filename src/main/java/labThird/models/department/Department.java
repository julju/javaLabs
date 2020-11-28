package labThird.models.department;

import labThird.models.common.Organization;
import labThird.models.group.Group;

public class Department extends Organization<Group> {

    public Department(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Department { " +
                "head = " + head +
                ", department_name = '" + name + '\'' +
                ", structure = " + structure +
                " } ";
    }
}
