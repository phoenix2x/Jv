package java_classes;


import java.util.ArrayList;
import java.util.List;

public class StudentSelection {

    public void printListOfStudentsByFaculty (String nameOfFaculty, Student[] students) {
        System.out.println(nameOfFaculty + " факультет. Список студентов: ");
        List<Student> studentsByFaculty = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(nameOfFaculty)) {
                studentsByFaculty.add(student);
            }
        }
        if (!studentsByFaculty.isEmpty()){
            for (Student student: studentsByFaculty){
                System.out.println(student);
            }
        }else{
            System.out.println("Список пуст, либо такого факультета не существует.");
        }
    }

    public void printListOfStudentsByFacultyAndCourse (String nameOfFaculty, int course, Student[] students) {
        System.out.println(nameOfFaculty + " факультет. Курс " + course + ". Список студентов:");
        List <Student> studentsByFacultyAndCourse = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(nameOfFaculty) && course == student.getCourse()) {
                studentsByFacultyAndCourse.add(student);
            }
        }
            if (!studentsByFacultyAndCourse.isEmpty()) {
                for (Student student: studentsByFacultyAndCourse) {
                    System.out.println(student);
                }
            } else {
                System.out.println("Список пуст, либо такого факультета или группы не существует.");
            }
    }

    public void printListOfStudentsWhoWasBornAfterYear (int year, Student[] students) {
        System.out.println("Студенты рожденные после " + year + " года:");
        List <Student> listOfStudentsWhoWasBornAfterYear  = new ArrayList<>();
        for (Student student : students) {
            int yearOfBirth = Integer.parseInt(student.getDateOfBirth().substring(0,4));
            if (yearOfBirth > year) {
                listOfStudentsWhoWasBornAfterYear.add(student);
            }
        }
        if (!listOfStudentsWhoWasBornAfterYear.isEmpty()) {
            for (Student student: listOfStudentsWhoWasBornAfterYear) {
                System.out.println(student);
            }
        } else {
            System.out.println("Список пуст.");
        }
    }

    public void printListOfStudentsByStudyGroup (String studyGroup, Student[] students) {
        System.out.println("Студенты группы " + studyGroup + ":");
        List<Student> listOfStudentsByStudyGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudyGroup().equals(studyGroup)) {
                listOfStudentsByStudyGroup.add(student);
            }
        }
        if (!listOfStudentsByStudyGroup.isEmpty()){
            for (Student student: listOfStudentsByStudyGroup){
                System.out.println(student);
            }
        }else{
            System.out.println("Список пуст, либо такой группы не существует.");
        }
    }
}
