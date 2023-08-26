import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String surname;
        double gpa;
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while(true){
            System.out.println("PRESS [1] TO ADD STUDENT \nPRESS [2] TO LIST STUDENT \nPRESS [0] TO EXIT");
            String flag = s.nextLine();
            if(flag.equals("1")){
                    System.out.println("Insert name = ");
                    name = s2.nextLine();
                    System.out.println("Insert surname = ");
                    surname = s2.nextLine();
                    System.out.println("Insert GPA = ");
                    gpa = s3.nextDouble();
                    Student st = new Student(name, surname , gpa);
                    students.add(st);

            }
            if(flag.equals("2")){
                    if (students.isEmpty()){
                        System.out.println("Tizim bos");
                    }
                    else{
                        for (Student student: students) {
                            System.out.println(student.name + " " + student.surname + " " + student.gpa);
                        }
                    }
            }
            if(flag.equals("0")){
                break;
            }
        }




    }
}