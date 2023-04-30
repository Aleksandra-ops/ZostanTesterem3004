import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class UltimateQATest extends PageSetup{

    @Test
    public void testOne(){

        driver.findElementById("idExample").click();

        driver.findElementByClassName("entry-title");

        WebElement buttonSuccess = driver.findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", buttonSuccess.getText());

            }
    }
