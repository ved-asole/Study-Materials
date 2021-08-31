import javax.mail.MessagingException;

public class EmailSender {

    public static void main(String[] args) throws MessagingException {

        Email email=new Email("lonewolfgaming2k19@gmail.com","22920028087737558");

        email.addRecipient("shekharasole@gmail.com");

        email.setSubject("Welcome to AngelDoc");

        email.setContent(email,"<h1>Welcome to AngelDoc<h1><br><h3>May your journey be a happy one<h3>");

        email.send();

    }

}
