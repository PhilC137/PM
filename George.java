import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class George extends Monster{

    Logger log1 = Logger.getLogger(getClass().getName());
    ConsoleHandler consoleHandler = new ConsoleHandler();


    public void execute(){
        log1.setLevel(Level.FINE);
        consoleHandler.setLevel(Level.INFO);
        log1.addHandler(consoleHandler);
        log1.log(Level.FINE,"Angriff");
    }
}
