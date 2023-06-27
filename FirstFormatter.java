import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class FirstFormatter extends Formatter {


    @Override
    public String format(LogRecord record) {
        return " -------------" +
                "\n Logger: " + record.getLoggerName() +
                "\n Level: " + record.getLevel() +
                "\n Class: " + record.getSourceClassName() +
                "\n Method: " + record.getSourceMethodName() +
                "\n Message: " + record.getMessage() +
                "\n -------------\n";
    }
}
