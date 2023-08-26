public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;
    protected String role;

    public User(int id, String login, String password, String name, String surname, String role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public User() {

    }

    public String getData() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    static class BuilderUser{
        User user;
        public  BuilderUser(){
            user = new User();
        }
        BuilderUser withId(int id){
            user.id = id;
            return this;
        } BuilderUser withLogin(String login){
            user.login = login;
            return this;
        } BuilderUser withName(String name){
            user.name = name;
            return this;
        } BuilderUser withSurname(String surname){
            user.surname = surname;
            return this;
        }
        BuilderUser withRole(String role){
            user.role = role;
            return this;
        }
        User build(){
            return user;
        }


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
