package labFourth.controllers;

import labFourth.models.human.Sex;
import labFourth.models.student.Student;

public class StudentCreator {
    public Student student;

    public StudentCreator(String firstName, String lastName, String patronymic, Sex sex) {
        this.student = new Student(firstName, lastName, patronymic, sex);
    }
}
