import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class SecondFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return record.getLoggerName() + "," + record.getLevel() + "," + record.getSourceMethodName() + "," + record.getSourceClassName() + "," + record.getMessage() + "\n";
    }
}