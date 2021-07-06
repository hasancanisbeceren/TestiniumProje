import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods extends BaseTest {
    public WebElement findElement(String key) {
        try {
            WebElement element = (new WebDriverWait(driver, 5, 300))
                    .until(ExpectedConditions.elementToBeClickable(By.cssSelector(key)));
            return element;

        } catch (Exception ex) {
            Assertions.fail("" + key + "'li element 10 saniye boyunca arandı fakat bulunamadı..!!!");
            return null;
        }
    }
    public void clictToElement(WebElement element) {

        scrollToElement(element);
        waitByMilliSeconds(1000);
        element.click();
    }

    public void sendKeysToElement(WebElement element, String text) {

        scrollToElement(element);
        element.sendKeys(text);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior:'smooth',block:'center', inline:'center'})",element);

    }
    public void waitByMilliSeconds(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
