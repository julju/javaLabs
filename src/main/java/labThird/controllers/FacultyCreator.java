package labThird.controllers;

import labThird.models.faculty.Faculty;

public class FacultyCreator {
    public Faculty faculty;

    public FacultyCreator(String name) {
        this.faculty = new Faculty(name);
    }
}
