public class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player(){

    }
    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }
    public String toString(){
        return "Номер " + number + " Аты " + name + " Фамилиясы " + surname + " Позиция " + position ;
    }

}
