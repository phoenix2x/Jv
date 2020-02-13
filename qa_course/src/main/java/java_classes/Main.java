package java_classes;

public class Main {
    public static void main(String[] args)  {
        CreateStudent createStudent = new CreateStudent();
        StudentSelection studentSelection = new StudentSelection();

        studentSelection.getListOfStudentsOfFaculty("Физический", createStudent.students);
        System.out.println();
        studentSelection.getListOfStudentsOfFacultyAndCourse("Биологический", 2, createStudent.students);
        System.out.println();
        studentSelection.listOfStudentsWhoWasBornAfterYear(1999, createStudent.students);
        System.out.println();
        studentSelection.getListOfStudyGroup("ФЗ-4", createStudent.students);
    }

}
