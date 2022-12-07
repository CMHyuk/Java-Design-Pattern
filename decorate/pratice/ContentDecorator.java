package decorate.pratice;

public class ContentDecorator extends EmailContent {
    private EmailContent emailContent;

    public ContentDecorator(EmailContent emailContent) {
        this.emailContent = emailContent;
    }

    @Override
    public String getContent() {
        return emailContent.getContent();
    }
}
