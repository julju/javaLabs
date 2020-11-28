package labThird.models.group;

import labThird.models.common.Organization;
import labThird.models.student.Student;

public class Group extends Organization<Student> {
    public Group(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Group { " +
                "head = " + head +
                ", group_name = '" + name + '\'' +
                ", structure = " + structure +
                " } ";
    }
}
