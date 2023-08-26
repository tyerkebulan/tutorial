import java.lang.reflect.Array;
import java.util.Arrays;

public class Staff extends User{
    private double salary;
    private String subjects[];

    public Staff(int id, String login, String password, String name, String surname, String role,double salary, String subjects[]) {
        super(id, login, password, name, surname, role);
        this.salary = salary;
        this.subjects = subjects;
    }


    @Override
    public String getData() {
        return super.getData() + " ,salary =  " + salary + ",  subjects = " + Arrays.toString(subjects);
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}
