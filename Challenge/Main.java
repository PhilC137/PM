package Challenge;

import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) {


        Drucker d1 = new Tintendrucker();
        Drucker d2 = new Laserdrucker();

        d1.kopieren();
        d2.kopieren();


    }
}
