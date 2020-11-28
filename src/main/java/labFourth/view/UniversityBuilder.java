package labFourth.view;

import labFourth.controllers.*;
import labFourth.models.human.Sex;
import labFourth.models.uni.Uni;

public class UniversityBuilder {
    private UniCreator uniCreator;
    private FacultyCreator facultyCreator;
    private DepartmentCreator departmentCreator;
    private GroupCreator groupCreator;

    public UniversityBuilder createUniversity(String universityName) {
        uniCreator = new UniCreator(universityName);
        return this;
    }

    public UniversityBuilder createFaculty(String facultyName) {
        facultyCreator = new FacultyCreator(facultyName);
        uniCreator.uni.append(facultyCreator.faculty);
        return this;
    }

    public UniversityBuilder createDepartment(String departmentName) {
        departmentCreator = new DepartmentCreator(departmentName);
        facultyCreator.faculty.append(departmentCreator.department);
        return this;
    }

    public UniversityBuilder createGroup(String groupName) {
        groupCreator = new GroupCreator(groupName);
        departmentCreator.department.append(groupCreator.group);
        return this;
    }

    public UniversityBuilder createStudent(String firstName, String lastName, String patronymic, Sex sex) {
        StudentCreator studentCreator = new StudentCreator(firstName, lastName, patronymic, sex);
        groupCreator.group.append(studentCreator.student);
        return this;
    }

    public UniversityBuilder setUniversityHead(String firstName, String lastName, String patronymic, Sex sex) {
        uniCreator.uni.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public UniversityBuilder setFacultyHead(String firstName, String lastName, String patronymic, Sex sex) {
        facultyCreator.faculty.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public UniversityBuilder setDepartmentHead(String firstName, String lastName, String patronymic, Sex sex) {
        departmentCreator.department.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public UniversityBuilder setGroupHead(String firstName, String lastName, String patronymic, Sex sex) {
        groupCreator.group.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public Uni compose() {
        return uniCreator.uni;
    }
}
