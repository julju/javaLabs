package labFourth.models.department;

import labFourth.models.common.Organization;
import labFourth.models.group.Group;

public class Department extends Organization<Group> {

    public Department(String name) {
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
