public class Student {
    String name;
    String surname;
    double gpa;

    public Student(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    String getStudentData(){
        return name + " " + surname +" " + gpa;
    }
}
