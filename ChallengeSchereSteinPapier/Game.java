package ChallengeSchereSteinPapier;

public class Game {
    public static void main(String[] args) {

        Spieler s1;
        Spieler s2;

        s1 = new Spieler(new Stein(),"Olli");
        s2 = new Spieler(new Papier(), "Jan");
        s1.execute();
        s2.execute();

        s1 = new Spieler(new Schere(),"Olli");
        s2 = new Spieler(new Papier(), "Jan");
        s1.execute();
        s2.execute();

    }
}