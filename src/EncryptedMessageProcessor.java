public class EncryptedMessageProcessor implements MessageProcessor {
    @Override
    public String process(Message message) {
        String encryptedText = encrypt(message.getText());
        return "[Encrypted] " + encryptedText;
    }

    private String encrypt(String text) {
        return new StringBuilder(text).reverse().toString(); // Заглушка для шифрування
    }
}
