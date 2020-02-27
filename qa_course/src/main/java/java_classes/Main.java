package java_classes;


public class Main {
    public static void main(String[] args)  {
        CreateStudent createStudent = new CreateStudent();
        StudentSelection studentSelection = new StudentSelection();

        studentSelection.printListOfStudentsByFaculty("Биологический", createStudent.students);
        System.out.println();
        studentSelection.printListOfStudentsByFacultyAndCourse("Физический", 3, createStudent.students);
        System.out.println();
        studentSelection.printListOfStudentsWhoWasBornAfterYear(1992, createStudent.students);
        System.out.println();
        studentSelection.printListOfStudentsByStudyGroup("ФЗ-2", createStudent.students);
    }

}
