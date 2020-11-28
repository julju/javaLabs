package labThird.view;

import labThird.controllers.*;
import labThird.models.human.Sex;
import labThird.models.uni.Uni;

public class UniBuilder {
    private UniCreator uniCreator;
    private FacultyCreator facultyCreator;
    private DepartmentCreator departmentCreator;
    private GroupCreator groupCreator;

    public UniBuilder createUniversity(String universityName) {
        uniCreator = new UniCreator(universityName);
        return this;
    }

    public UniBuilder createFaculty(String facultyName) {
        facultyCreator = new FacultyCreator(facultyName);
        uniCreator.uni.append(facultyCreator.faculty);
        return this;
    }

    public UniBuilder createDepartment(String departmentName) {
        departmentCreator = new DepartmentCreator(departmentName);
        facultyCreator.faculty.append(departmentCreator.department);
        return this;
    }

    public UniBuilder createGroup(String groupName) {
        groupCreator = new GroupCreator(groupName);
        departmentCreator.department.append(groupCreator.group);
        return this;
    }

    public UniBuilder createStudent(String firstName, String lastName, String patronymic, Sex sex) {
        StudentCreator studentCreator = new StudentCreator(firstName, lastName, patronymic, sex);
        groupCreator.group.append(studentCreator.student);
        return this;
    }

    public UniBuilder setUniversityHead(String firstName, String lastName, String patronymic, Sex sex) {
        uniCreator.uni.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public UniBuilder setFacultyHead(String firstName, String lastName, String patronymic, Sex sex) {
        facultyCreator.faculty.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public UniBuilder setDepartmentHead(String firstName, String lastName, String patronymic, Sex sex) {
        departmentCreator.department.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public UniBuilder setGroupHead(String firstName, String lastName, String patronymic, Sex sex) {
        groupCreator.group.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public Uni compose() {
        return uniCreator.uni;
    }
}
