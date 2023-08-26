public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(21,"Yerkebulan", "Tasploat","шабуылшы");
        Player player2 = new Player(20,"Berik", "Kablanbrk","қақпашы");
        Player player3 = new Player(25,"Kanat", "Jaksylyk","қорғаушы");
        Player player4 = new Player(15,"Erjigit", "Beisenbek","жартылай шабуылшы");
        Player player5 = new Player(27,"Abdumanap", "Bekbolat","жартылай шабуылшы");
        Player player6 = new Player(28,"Seken", "Zhalgas","жартылай шабуылшы");
        Player[] players = {player1,player2,player5,player6};
        Player[] players2 = {player3,player4};
        Club realMadrid = new Club("Real","Ispanya",35,players);
        Club barcelona = new Club("Barsa", "Ispnya",30,players2);
        Club atletic = new Club("Atletico", "Ispnya",24,players);
        Club[] clubs = {realMadrid,barcelona,atletic};
        for (Club cl: clubs) {
            cl.printClubData();
        }
        System.out.println("--------------");
        Player[] players3 = sortPlayer(players);
        for (Player p : players3) {
            System.out.println(p.toString());
        }
        System.out.println("--------------");
        Club[] clubs3 = sortClub(clubs);
        for (Club c : clubs3) {
            c.printClubData();
            System.out.println("+++++++++++++");
        }
    }
    public static Player[] sortPlayer(Player[] players){
        Player templayer;
        for (int i = 0; i < players.length-1; i++) {
            for (int j = 0; j < players.length-i-1; j++) {
                if(players[j].number<players[j+1].number){
                    templayer = players[j];
                    players[j] = players[j+1];
                    players[j+1] = templayer;
                }
            }
        }
        return players;
    }
    public static Club[] sortClub(Club[] clubs){
        Club tempClub;
        for (int i = 0; i < clubs.length-1; i++) {
            for (int j = 0; j < clubs.length-i-1; j++) {
                if(clubs[j].ratingPoints<clubs[j+1].ratingPoints){
                    tempClub = clubs[j];
                    clubs[j] = clubs[j+1];
                    clubs[j+1] = tempClub;
                }
            }
        }
        return clubs;
    }
}