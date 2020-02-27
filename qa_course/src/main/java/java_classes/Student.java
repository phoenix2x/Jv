package java_classes;


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

    public Student() { }

    public Student(int id, String secondName, String name, String middleName, String dateOfBirth, String address,
                   String faculty, int course, String studyGroup) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.faculty = faculty;
        this.course = course;
        this.studyGroup = studyGroup;
    }

    public Student(int id, String secondName, String name, String middleName, String dateOfBirth,
                   int phoneNumber, String faculty, int course, String studyGroup) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.studyGroup = studyGroup;
    }


    public Student(int id, String secondName, String name, String middleName, String dateOfBirth, String address,
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

}
