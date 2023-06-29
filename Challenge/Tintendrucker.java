package Challenge;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tintendrucker extends Drucker{

    Logger log = Logger.getLogger(Tintendrucker.class.getName());

    @Override
    void scannen() {
        log.log(Level.INFO,"Scanne das Dokument mit dem Tintendrucker.");
    }

    @Override
    void drucken() {
        log.log(Level.INFO,"Drucke das Dokument mit dem Tintendrucker.");
    }
}
