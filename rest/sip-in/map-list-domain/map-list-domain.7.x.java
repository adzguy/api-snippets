// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMapping;

public class Example {
  // Get your Account SID and Auth Token from https://twilio.com/console
  // To set up environment variables, see http://twil.io/secure
  public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
  public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    IpAccessControlListMapping ipAccessControlListMapping = IpAccessControlListMapping
        .creator("SD32a3c49700934481addd5ce1659f04d2", "AL95a47094615fe05b7c17e62a7877836c")
        .create();

    System.out.println(ipAccessControlListMapping.getSid());
  }
}
