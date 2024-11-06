public class AuthorMessageProcessor implements MessageProcessor {
    @Override
    public String process(Message message) {
        String authorName = "Siukalo Diana"; // Вкажіть своє ім'я та прізвище
        return "Author: " + authorName + message.getText();
    }
}
