package comm.actitime.testscripts;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.actitime.commonutils.WebDriverUtils;
import com.actitime.configuration.Commonsetup;
import com.actitime.pages.LoginPage;
public class LoginTest extends Commonsetup
{
 @Test
 public void loginTest() throws IOException, InterruptedException
 {
 
  LoginPage lp = new LoginPage(driver);
  WebDriverUtils utils= new WebDriverUtils(); 
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get(url);
  
  String user = utils.getDataFromProperties("username");
  String pass = utils.getDataFromProperties("password");
  lp.loginoperation(user,pass);
   
 }
}
