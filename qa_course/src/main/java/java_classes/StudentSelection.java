package java_classes;


import java.util.ArrayList;
import java.util.List;

public class StudentSelection {
    public void getListOfStudentsOfFaculty (String nameOfFaculty, Student[] students) {
        System.out.println(nameOfFaculty + " факультет. Список студентов: ");
        if (!nameOfFaculty.equals("Физический") && !nameOfFaculty.equals("Биологический")) {
            System.out.println("Такого факультета не существует!");
        }else {
            for (Student student: students) {
                if (student.getFaculty().equals(nameOfFaculty)) {
                    System.out.println(student);
                }
            }
        }
    }

//    public void printListOfStudentsOfFaculty (String nameOfFaculty, Student[] students) {
//        List<Student> studentsByFaculty = getListOfStudentsOfFaculty(nameOfFaculty, students);
//        if (studentsByFaculty.isEmpty()) {
//            System.out.println("Такого факультета не существует!");
//        } else {
//            studentsByFaculty.forEach(System.out::println);
//        }
//    }
//
//    public List<Student> getListOfStudentsOfFaculty (String nameOfFaculty, Student[] students) {
//        List<Student> studentsByFaculty = new ArrayList<>();
//        for (Student student: students) {
//            if (student.getFaculty().equals(nameOfFaculty)) {
//                studentsByFaculty.add(student);
//            }
//        }
//    }

    public void getListOfStudentsOfFacultyAndCourse (String nameOfFaculty, int course, Student[] students) {
        System.out.println(nameOfFaculty + " факультет. Курс " + course + ". Список студентов:");
        for (Student student: students) {
            if (student.getFaculty().equals(nameOfFaculty) && course == student.getCourse()) {
                System.out.println(student);
            }
        }
    }

    public void listOfStudentsWhoWasBornAfterYear (int year, Student[] students) {
        System.out.println("Студенты рожденные после " + year + " года:");
            for (Student student : students) {
               int yearOfBirth = Integer.parseInt(student.getDateOfBirth().substring(0,4));
               if (yearOfBirth > year) {
                    System.out.println(student);
                }
            }
    }

    public void getListOfStudyGroup (String studyGroup, Student[] students) {
        System.out.println("Студенты группы " + studyGroup + ":");
        for (Student student: students) {
            if (student.getStudyGroup().equals(studyGroup)) {
                System.out.println(student);
            }
        }
    }
}
