// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.ShortCode;

public class Example {
  /// Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<ShortCode> shortCodes = ShortCode.reader()
        .setShortCode("898")
        .read();

    // Loop over shortCodes and print out a property for each one.
    for (ShortCode shortCode : shortCodes) {
      System.out.println(shortCode.getSmsMethod());
    }
  }
}