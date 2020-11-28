package labFourth.models.student;

import labFourth.models.human.Human;
import labFourth.models.human.Sex;

public class Student extends Human {

    public Student(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
}
