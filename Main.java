import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Token t = new KeyWord();
        LOG.info(t.getHtml());
    }
}
