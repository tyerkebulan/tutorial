import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        String name;
        String surname;
        String department;
        int salary;
        BankApplication bankApplication = new BankApplication();
        Worker worker = new Worker();
        while(true){
            System.out.println("PRESS [1] TO ADD Worker \nPRESS [2] TO LIST Worker \nPRESS [0] TO EXIT");
            String flag = s.nextLine();
            if(flag.equals("1")){
                System.out.println("Enter name: ");
                name = s2.nextLine();
                System.out.println("Enter surname: ");
                surname = s2.nextLine();
                System.out.println("Enter department: ");
                department = s2.nextLine();
                System.out.println("Enter salary: ");
                salary = s5.nextInt();
                bankApplication.addWorker(name,surname,department,salary);
            }
            else if(flag.equals("2")){
                bankApplication.listWorkers();
            }
            else if(flag.equals("0")){
                break;
            }
            else{
                System.out.println("PRESS [1] TO ADD Worker \nPRESS [2] TO LIST Worker \nPRESS [0] TO EXIT");
                flag = s.nextLine();
            }
        }
    }
}