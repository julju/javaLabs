package labThird.models.uni;

import labThird.models.common.Organization;
import labThird.models.faculty.Faculty;

public class Uni extends Organization<Faculty> {

    public Uni(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "University { " +
                "head = " + head +
                ", university_name = '" + name + '\'' +
                ", structure = " + structure +
                " }";
    }
}
