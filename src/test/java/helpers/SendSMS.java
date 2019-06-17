package helpers;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSMS {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "ACd784fc17bfd9bc694848b812a30d3a5a";
    public static final String AUTH_TOKEN =
            "9523aee52866b430a1f712b96a376cb2";

    public static void sentOutputThroughSMS() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+917307751532"), // to
                        new PhoneNumber("+12565703797"), // from
                        "Run Completed")
                .create();

        System.out.println(message.getSid());
    }
}