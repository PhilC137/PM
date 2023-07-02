import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Monster {

    Logger log = Logger.getLogger(getClass().getName());
    ConsoleHandler handler;

    public Monster(){

        handler = new ConsoleHandler();
        log.addHandler(handler);
        handler.setLevel(Level.FINE);
    }
}
