package labThird.controllers;

import labThird.models.human.Sex;
import labThird.models.student.Student;

public class StudentCreator {
    public Student student;

    public StudentCreator(String firstName, String lastName, String patronymic, Sex sex) {
        this.student = new Student(firstName, lastName, patronymic, sex);
    }
}
