import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ERPSystem erpSystem = new ERPSystem();
        String flag;
        Scanner s = new Scanner(System.in) ;
        Scanner s2 = new Scanner(System.in) ;
        String name,surname,group,nickName,status;
        String subject;

        double  gpa;
        while(true){
            System.out.println("PRESS [1] TO ADD USER \nPRESS [2] TO LIST USERS \nPRESS [0] TO EXIT");
            flag = s.nextLine();
            if(flag.equals("1")){
                while(true){
                    System.out.println("PRESS [1] TO ADD STUDENT \nPRESS [2] TO ADD TEACHER\nPRESS [0] TO FINISH ADDING USERS");
                    flag = s.nextLine();
                    if(flag.equals("1")){
                        System.out.println("name: ");
                        name = s.nextLine();
                        System.out.println("surname: ");
                        surname = s.nextLine();
                        System.out.println("group: ");
                        group = s.nextLine();
                        System.out.println("gpa: ");
                        gpa = s2.nextDouble();
                        Student student = new Student(name,surname,group,gpa);
                        erpSystem.addUser(student);
                    }
                    else if(flag.equals("2")){

                        System.out.println("Nick name: ");
                        nickName = s.nextLine();
                        System.out.println("Status: ");
                        status = s.nextLine();
                        Teacher teacher = new Teacher(nickName,status);
                        erpSystem.addUser(teacher);
                        while (true){
                            System.out.println("PRESS [1] TO ADD Subject \nPRESS [0] TO FINISH ADDING SUBJECT");
                           flag = s.nextLine();
                           if(flag.equals("1")){
                               System.out.println("Enter subject name: ");
                               subject = s.nextLine();
                               teacher.addSubject(subject);

                           }
                           else if(flag.equals("0")){
                               break;
                           }
                           else{
                               System.out.println("PRESS [1] TO ADD Subject \nPRESS [0] TO FINISH ADDING SUBJECT");
                               flag= s.nextLine();
                           }
                        }
                    }
                    else if(flag.equals("0")){
                        break;
                    }
                    else{
                        System.out.println("PRESS [1] TO ADD Subject \nPRESS [0] TO FINISH ADDING SUBJECT");
                        flag = s.nextLine();
                    }

                }

             }
            else if(flag.equals("2")){
                System.out.println("PRESS [1] TO LIST STUDENTS \nPRESS [2] TO LIST TEACHERS");
                flag = s.nextLine();
                if(flag.equals("1")){
                    erpSystem.printAllStudents();
                }
                else if(flag.equals("2")){
                    erpSystem.printAllTeacters();
                }
                else{
                    System.out.println("PRESS [1] TO LIST STUDENTS \nPRESS [2] TO LIST TEACHERS");
                    flag = s.nextLine();
                }
            }
            else if(flag.equals("0")){
                break;
            }
            else{
                System.out.println("PRESS [1] TO ADD USER \nPRESS [2] TO LIST USERS \nPRESS [0] TO EXIT");
                flag = s.nextLine();
            }
        }
    }
}