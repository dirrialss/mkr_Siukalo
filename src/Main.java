public class Main {
    public static void main(String[] args) {
        Message message = new BaseMessage("This is    my text for encryption and compression");
        MessageHandler handler = new MessageHandler(message);

        System.out.println("My message:");
        System.out.println(handler.getProcessedMessage());

        // Стиснення


        // Шифрування
        handler.applyProcessor(new EncryptedMessageProcessor());
        System.out.println("After Encryption:");
        System.out.println(handler.getProcessedMessage());

        // Додавання дати та часу
        handler.applyProcessor(new DateMessageProcessor());
        System.out.println("Date and time:");
        System.out.println(handler.getProcessedMessage());

        // Додавання ПІБ автора
        handler.applyProcessor(new AuthorMessageProcessor());
        System.out.println("Adding author:");
        System.out.println(handler.getProcessedMessage());

        handler.applyProcessor(new CompressedMessageProcessor());
        System.out.println("After Compression:");
        System.out.println(handler.getProcessedMessage());
    }
}
