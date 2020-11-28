package labFourth.models.uni;

import labFourth.models.common.Organization;
import labFourth.models.faculty.Faculty;

public class Uni extends Organization<Faculty> {

    public Uni(String name) {
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
