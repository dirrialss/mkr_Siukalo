import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMessageProcessor implements MessageProcessor {
    @Override
    public String process(Message message) {
        String date = getCurrentDate();
        return "[Date: " + date + "] " + message.getText();
    }

    private String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(new Date());
    }
}
