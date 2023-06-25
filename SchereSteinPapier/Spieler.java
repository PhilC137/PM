package SchereSteinPapier;

public class Spieler {

    private SpielZug spielZug;
    private String name;

    public Spieler(SpielZug spielZug, String name){
        this.spielZug = spielZug;
        this.name = name;
    }

    public void execute(){
        spielZug.play();
    }

}
