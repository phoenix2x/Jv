package java_classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Student {
    private int id;
    private String secondName;
    private String name;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private String studyGroup;


    public int getId () {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getSecondName() {return secondName;}
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getMiddleName () {return middleName;}
    public void setMiddleName (String middleName) {this.middleName = middleName;}
    public String getDateOfBirth (){return dateOfBirth;}
    public void setDateOfBirth (String dateOfBirth) {this.dateOfBirth = dateOfBirth;}
    public String getAddress() {return address;}
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public String getStudyGroup() {
        return studyGroup;
    }
    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }

    public Student () { }

    public Student (int id, String secondName, String name, String middleName, String dateOfBirth, String address,
                    int phoneNumber, String faculty, int course, String studyGroup) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.studyGroup = studyGroup;
    }

    @Override
    public String toString() {
        return "id:" + id + " ФИО:" + secondName + " " + name + " " + middleName + ". Дата рождения: " +dateOfBirth +
                ". Адресс: " + address + ". тел:" + phoneNumber + ". Факультет: " + faculty + ". Курс:" + course + ". Группа: "
                + studyGroup + ".";
    }


    Student popkov = new Student (123, "Попков", "Андрей", "Васильевич",
            "1992-08-18", "Советская д.2 кв.17", 345423, "Физический",
            3, "ФЗ-3");
    Student vladov = new Student (17, "Владов", "Семен", "Петрович",
            "1993-02-10", "Владимирова д.3 кв.14", 343455, "Физический",
            2, "ФЗ-2");
    Student sevastyanov = new Student (27, "Севастьянов", "Алексей", "Николаевич",
            "1991-01-15", "Фрунзе д.45 кв.1223", 346534, "Физический",
            4, "ФЗ-4");
    Student kotina = new Student (177, "Котина", "Екатерина", "Ивановна",
            "1991-06-15", "Филипова д.5 кв.166", 547689, "Физический",
            4, "ФЗ-4");
    Student ivanov = new Student (67, "Иванов", "Флександр", "Петрович",
            "1994-12-19", "РечицкоеШоссе д.5 кв.18", 326344, "Физический",
            1, "ФЗ-1");
    Student filatova = new Student (456, "Филатова", "Наталья", "Александровна",
            "1994-05-16", "Комсомольская д.6 кв.125", 658934, "Биологический",
            1, "БИ-1");
    Student antonova = new Student (56, "Антонова", "Полина", "Андреевна",
            "1993-02-17", "Партизанская д.67 кв.156", 456534, "Биологический",
            2, "БИ-2");
    Student smirnova = new Student (433, "Смирнова", "Татьяна", "Николавна",
            "1992-06-30", "Ланге д.58 кв.199", 234544, "Биологический",
            3, "БИ-3");
    Student kurash = new Student (432, "Кураш", "Алена", "Валентиновна",
            "1992-05-25", "Жемчужная д.47 кв.4", 567678, "Биологический",
            3, "БИ-3");
    Student kemej = new Student (12, "Кемеж", "Павел", "Николаевич",
            "1991-03-25", "ленина д.52 кв.139", 456567, "Биологический",
            4, "БИ-4");

    Student [] students = {popkov, vladov, sevastyanov, kotina, ivanov, filatova, antonova, smirnova, kurash, kemej};



   public void getListOfStudentsOfFaculty (String nameOfFaculty) {
       System.out.println("Студенты факультета: " + nameOfFaculty);
        for (Student student: students) {
            if (student.getFaculty().equals(nameOfFaculty)) {
                System.out.println(student);
            } else {
                System.out.println("Такого факультета не существует!");
            }
        }
   }

   public void getListOfStudentsOfFacultyAndCourse (String nameOfFaculty, int course) {
         System.out.println("Студенты факультета: " + nameOfFaculty + "курс " + course);
       for (Student student: students) {
           if (student.getFaculty().equals(nameOfFaculty) && course == student.getCourse()) {
               System.out.println(student);
           } else {
               System.out.println("Такого факультета или курса не существует!");
           }
       }
     }

     public void listOfStudentsWhoWasBornAfterYear (int year) {
         System.out.println("Студенты рожденные после " + year + " года");
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
         try {
             for (Student student : students) {
                 Date date = dateFormat.parse(student.dateOfBirth);
                 if (date.getYear() < year) {
                     System.out.println(student);
                 }
             }
         }catch (ParseException ex){
             System.out.println("Неверно введена дата");
         }
     }


    public void getListOfStudyGroup (String studyGroup) {
        System.out.println("Студенты факультета: " + studyGroup);
        for (Student student: students) {
            if (student.getStudyGroup().equals(studyGroup)) {
                System.out.println(student);
            } else {
                System.out.println("Такой шруппы не существует!");
            }
        }
    }







}
