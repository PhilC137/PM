package Challenge;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Laserdrucker extends Drucker{
    static final Logger log = Logger.getLogger(Laserdrucker.class.getName());
    @Override
    void scannen() {
        log.log(Level.INFO,"Scanne das Dokument mit dem Laserdrucker.");
    }

    @Override
    void drucken() {
        log.log(Level.INFO,"Drucke das Dokument mit dem Laserdrucker.");
    }
}
