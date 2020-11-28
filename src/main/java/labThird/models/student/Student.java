package labThird.models.student;

import labThird.models.human.Human;
import labThird.models.human.Sex;

public class Student extends Human {

    public Student(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
}
