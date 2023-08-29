import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //AnonimClass
//        OperationAlgebra operationAlgebra = new OperationAlgebra() {
//            @Override
//            public int calculate(int a, int b) {
//                return a + b;
//            }
//        };
//        System.out.println(operationAlgebra.calculate(10, 25));
        //lambda
//        OperationAlgebra operationAlgebra = Integer::sum;
//        System.out.println(operationAlgebra.calculate(10,20));
        //Comparable and comparator
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Yerkebulan", 25, 450000.25));
        persons.add(new Person("Erlan", 12, 650000.25));
        persons.add(new Person("Arman", 50, 250000.25));
        Collections.sort(persons,new SortByAge());
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}

interface OperationAlgebra {
    int calculate(int a, int b);
}

class Person {
    private String name;
    private int age;
    private double salary;

    public Person() {

    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
//    @Override
//    public int compareTo(Person o) {
//        if(this.age==o.age)
//        return 0;
//        else if(this.age>o.age)
//            return 1;
//        return -1;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}

class SortByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() == o2.getAge())
            return 0;
        else if (o1.getAge() > o2.getAge())
            return 1;
        return -1;
    }
}