package java_classes;

import java.text.ParseException;

public class Main {
    public static void main(String[] args)  {

        Student student = new Student();
        student.getListOfStudentsOfFaculty("Биологический");

        student.getListOfStudentsOfFacultyAndCourse("Биологический", 2);

        student.listOfStudentsWhoWasBornAfterYear(1999);

        student.getListOfStudyGroup("ФЗ-4");


//        Student popkov = new Student (123, "Попков", "Андрей", "Васильевич",
//                "1992-08-18", "Советская д.2 кв.17", 345423, "Физический",
//                3, "ФЗ-3");
//        Student vladov = new Student (17, "Владов", "Семен", "Петрович",
//                "1993-02-10", "Владимирова д.3 кв.14", 343455, "Физический",
//                2, "ФЗ-2");
//        Student sevastyanov = new Student (27, "Севастьянов", "Алексей", "Николаевич",
//                "1991-01-15", "Фрунзе д.45 кв.1223", 346534, "Физический",
//                4, "ФЗ-4");
//        Student kotina = new Student (177, "Котина", "Екатерина", "Ивановна",
//                "1991-06-15", "Филипова д.5 кв.166", 547689, "Физический",
//                4, "ФЗ-4");
//        Student ivanov = new Student (67, "Иванов", "Флександр", "Петрович",
//                "1994-12-19", "РечицкоеШоссе д.5 кв.18", 326344, "Физический",
//                1, "ФЗ-1");
//        Student filatova = new Student (456, "Филатова", "Наталья", "Александровна",
//                "1994-05-16", "Комсомольская д.6 кв.125", 658934, "Биологический",
//                1, "БИ-1");
//        Student antonova = new Student (56, "Антонова", "Полина", "Андреевна",
//                "1993-02-17", "Партизанская д.67 кв.156", 456534, "Биологический",
//                2, "БИ-2");
//        Student smirnova = new Student (433, "Смирнова", "Татьяна", "Николавна",
//                "1992-06-30", "Ланге д.58 кв.199", 234544, "Биологический",
//                3, "БИ-3");
//        Student kurash = new Student (432, "Кураш", "Алена", "Валентиновна",
//                "1992-05-25", "Жемчужная д.47 кв.4", 567678, "Биологический",
//                3, "БИ-3");
//        Student kemej = new Student (12, "Кемеж", "Павел", "Николаевич",
//                "1991-03-25", "ленина д.52 кв.139", 456567, "Биологический",
//                4, "БИ-4");
//
//        Student [] students = {popkov, vladov, sevastyanov, kotina, ivanov, filatova, antonova, smirnova, kurash, kemej};
//
//        System.out.println("Список студентов физического факультата:");
//        for (Student s: students){
//            if(s.getFaculty().equals("Биологический")){
//                System.out.println(s);
//            }
//        }


    }

}
