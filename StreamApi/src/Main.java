import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Stream API
          List<Person> personList = getPersons();
//        List<Person> juniorList = new ArrayList<>();
//        for (Person person : personList) {
//            System.out.println(person);
//        }
//        //Imperative approach
//        for (Person person : personList) {
//            if(person.getPosition().equals(Position.JUNIOR)){
//                juniorList.add(person);
//            }
//        }
//        System.out.println("-------------------------");
//        for (Person person : juniorList) {
//            System.out.println(person);
//        }
        //Declarative approach
        //filter
//        List<Person> juniors =  personList.stream()
//                .filter(person -> person.getPosition().equals(Position.JUNIOR))
//                .toList();
//        juniors.forEach(System.out::println);
        //sort
//          personList.stream()
//                .sorted(Comparator.comparing(Person::getName))
//                .toList().forEach(System.out::println);
        //max
        Person person = personList.stream().
                max(Comparator.comparing(Person::getAge)).get();
        System.out.println(person);
    }

    private static List<Person> getPersons() {
        return List.of(new Person("Yerkebulan", 25, Position.JUNIOR),
                new Person("Arman", 24, Position.MIDDLE),
                new Person("Erlan", 28, Position.SENOIR),
                new Person("Serjan", 22, Position.JUNIOR),
                new Person("Sundet", 29, Position.SENOIR));
    }
}
enum Position{
    JUNIOR,MIDDLE,SENOIR
}
class Person{
   private String name;
   private int age;
   private Position position;

    public Person(String name, int age, Position position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + position +
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}