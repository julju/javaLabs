package labFourth.view;

import labFourth.models.uni.Uni;
import labFourth.models.human.Sex;

class ConsoleView implements Console {

    @Override
    public void createTypicalUniversity() {
        UniversityBuilder universityBuilder = new UniversityBuilder();

        universityBuilder

                .createUniversity("NGU")
                .setUniversityHead("Blah", "Blablah", "Blahblahblah", Sex.M)
                .createFaculty("System analysis and management")
                .setFacultyHead("Arian", "Bieber", "Bing", Sex.M)
                .createDepartment("System analysis and management")
                .setDepartmentHead("Lol", "Kecker", "Garold", Sex.M)
                .createGroup("124-18sk-1")
                .setGroupHead("Karl", "Eating", "Human", Sex.M)
                .createStudent("Bro", "Bro", "Bro", Sex.M)
                .createStudent("Notbro", "Notbro", "Notbro", Sex.M)
                .createStudent("Omagad", "Danila", "Kreizi", Sex.F);

        showUniversity(universityBuilder.compose());
    }

    @Override
    public void showUniversity(Uni uni) {
        System.out.println(uni);
    }
}
