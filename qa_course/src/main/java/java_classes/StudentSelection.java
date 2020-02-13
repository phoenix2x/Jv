package java_classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StudentSelection {
    public void getListOfStudentsOfFaculty (String nameOfFaculty, StudentInfo[] students) {
        System.out.println(nameOfFaculty + " факультет. Список студентов: ");
        for (StudentInfo student: students) {
            if (student.getFaculty().equals(nameOfFaculty)) {
                System.out.println(student);
            } else {
//                System.out.println("Такого факультета не существует!");
            }
        }
    }

    public void getListOfStudentsOfFacultyAndCourse (String nameOfFaculty, int course, StudentInfo[] students) {
        System.out.println(nameOfFaculty + " факультет. Курс " + course + ". Список студентов:");
        for (StudentInfo student: students) {
            if (student.getFaculty().equals(nameOfFaculty) && course == student.getCourse()) {
                System.out.println(student);
            } else {
//                System.out.println("Такого факультета или курса не существует!");
            }
        }
    }

    public void listOfStudentsWhoWasBornAfterYear (int year, StudentInfo[] students) {
        System.out.println("Студенты рожденные после " + year + " года:");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            for (StudentInfo student : students) {
                Date date = dateFormat.parse(student.getDateOfBirth());
                if (date.getYear() < year) {
                    System.out.println(student);
                }
            }
        }catch (ParseException ex){
            System.out.println("Неверно введена дата");
        }
    }


    public void getListOfStudyGroup (String studyGroup, StudentInfo[] students) {
        System.out.println("Студенты группы " + studyGroup + ":");
        for (StudentInfo student: students) {
            if (student.getStudyGroup().equals(studyGroup)) {
                System.out.println(student);
            } else {
//                System.out.println("Такой группы не существует!");
            }
        }
    }
}
