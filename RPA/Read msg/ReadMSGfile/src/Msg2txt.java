import com.auxilii.msgparser.Message;
import com.auxilii.msgparser.MsgParser;

public class Msg2txt {
    public static void main(String[] args) {

        try {

        MsgParser messageParser = new MsgParser();
        Message message = messageParser.parseMsg("D:\\Projects\\MSGparser\\sample\\sample.msg");
        String fromMail= message.getFromEmail();
        String fromName= message.getFromName();
        String fromSubject= message.getSubject();
        String fromBody= message.getBodyText();

            System.out.println("mail: " + fromMail);
            System.out.println("Name: " + fromName);
            System.out.println("Subject: " + fromSubject);
            System.out.println("Body: " + fromBody);

        }catch (Exception e){
            System.out.println(" Wrong path");
        }
    }

}
