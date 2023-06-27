import java.io.IOException;
import java.util.logging.*;
import java.util.logging.Logger;

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) throws IOException {
        log.setUseParentHandlers(false);

        log.setLevel(Level.ALL);

        ConsoleHandler handler2 = new ConsoleHandler();
        handler2.setLevel(Level.ALL);
        handler2.setFormatter(new FirstFormatter());
        log.addHandler(handler2);

        FileHandler handler1 = new FileHandler("log.csv",true);
        log.addHandler(handler1);
        handler1.setLevel(Level.WARNING);
        handler1.setFormatter(new SecondFormatter());


        loggerAusgabe();
    }

    private static void loggerAusgabe() {

        log.severe("SEVERE");
        log.log(Level.WARNING, "WARNING");
        log.log(Level.INFO, "INFO");
        log.log(Level.CONFIG, "CONFIG");
        log.log(Level.FINE, "FINE");
        log.log(Level.FINER, "FINER");
        log.log(Level.FINEST, "FINEST");
    }


}
