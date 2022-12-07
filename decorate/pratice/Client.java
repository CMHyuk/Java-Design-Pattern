package decorate.pratice;

public class Client {
    public static void main(String[] args) {
        BasicEmailContent simple = new BasicEmailContent("Hello");
        System.out.println(simple.getContent());

        ExternalEmailContent external = new ExternalEmailContent(simple);
        System.out.println(external.getContent());

        SecureEmailContent secure = new SecureEmailContent(simple);
        System.out.println(secure.getContent());

        SecureEmailContent secureEMailContent = new SecureEmailContent(external);
        System.out.println(secureEMailContent.getContent());
    }
}
