public enum Fach {
    ADS,
    MATHE("bitte nicht",0,"Ich bins BC"),
    SEXUALKUNDE("Beste",1, "LOL1"),//???????? was ist das mama???
    ITRECHT("magkeiner",20,"Mach mal Prüfung einfacher BRUDER");

    private final String BESCHREIBUNG;
    private final Integer ANZAHL;
    private final String ANSAGE;

    Fach(String b, Integer a, String ansage)
    {
        this.ANZAHL = a;
        this.BESCHREIBUNG = b;
        this.ANSAGE = ansage;

    }
    Fach(){this("Erstes",20,"LOL");}
    public static void main(String[] args) {
    }
}
