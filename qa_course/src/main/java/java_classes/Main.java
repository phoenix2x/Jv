package java_classes;


public class Main {
    public static void main(String[] args)  {
        CreateStudent createStudent = new CreateStudent();
        StudentSelection studentSelection = new StudentSelection();

        studentSelection.getListOfStudentsOfFaculty("Биологический", createStudent.students);
        System.out.println();
        studentSelection.getListOfStudentsOfFacultyAndCourse("Биологический", 2, createStudent.students);
        System.out.println();
        studentSelection.listOfStudentsWhoWasBornAfterYear(1992, createStudent.students);
        System.out.println();
        studentSelection.getListOfStudyGroup("ФЗ-1", createStudent.students);
    }

}
