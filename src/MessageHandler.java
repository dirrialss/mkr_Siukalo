public class MessageHandler {
    private String processedText;

    public MessageHandler(Message message) {
        this.processedText = message.getText();
    }

    public void applyProcessor(MessageProcessor processor) {
        processedText = processor.process(() -> processedText); // Лямбда, щоб обернути текст в Message
    }

    public String getProcessedMessage() {
        return processedText;
    }
}
