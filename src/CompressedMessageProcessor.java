public class CompressedMessageProcessor implements MessageProcessor {
    @Override
    public String process(Message message) {
        String compressedText = compress(message.getText());
        return "[Compressed] " + compressedText;
    }

    private String compress(String text) {
        return text.replaceAll("\\s+", " ");
    }
}
