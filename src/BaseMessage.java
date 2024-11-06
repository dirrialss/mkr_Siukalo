public class BaseMessage implements Message {
    private String text;

    public BaseMessage(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
