package labFourth.models.group;

import labFourth.models.common.Organization;
import labFourth.models.student.Student;

public class Group extends Organization<Student> {
    public Group(String name) {
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
