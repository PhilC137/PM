package AnonymeKlassen;

public class AnonymeKlasse {
    public static void main(String[] args){

    //1. Klasse erweitern
        Katze katze = new Katze(){
            @Override
            public void miau() {
                System.out.println("Wuf");;
            }
        };
        katze.miau();
    }

    //2. Interface Implementieren
    Lebewesen affe = new Lebewesen() {
        @Override
        public void machEtwas() {
            System.out.println("Uh Ah");
        }
    };

}


class Katze {
    public void miau(){
        System.out.println("Miau");
    }
}

