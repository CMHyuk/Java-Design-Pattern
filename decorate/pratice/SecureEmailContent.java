package decorate.pratice;

public class SecureEmailContent extends ContentDecorator{
    public SecureEmailContent(EmailContent content) {
        super(content);
    }

    public String getContent() {
        String content = super.getContent();
        String encryptedContent = encrypt(content);
        return encryptedContent;
    }

    private String encrypt(String content) {
        return content + " Encrypted";
    }
}
