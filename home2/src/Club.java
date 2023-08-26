public class Club {
    String name;
    String country;
    int ratingPoints;
    Player players[];
    public Club(){

    }
    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }
    void printClubData(){
        System.out.println("Команда аты - " + name);
        System.out.println("Мемлекет - " + country);
        System.out.println("Ұпай - " + ratingPoints);
        for (Player player: players) {
            System.out.println(player.toString());
        }

    }
}
