public class Student extends User{

    public Student(int id, String login, String password, String name, String surname, String role) {
        super(id, login, password, name, surname, role);
    }

    @Override
    public String getData() {
        return super.getData();
    }
}
