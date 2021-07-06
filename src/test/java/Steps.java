import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Steps extends Methods{
    public void clickElement(String key) {
        WebElement element = findElement(key);
        clictToElement(element);
    }

    public void sendKeysToElementTest(String key, String text) {
        WebElement element = findElement(key);
        sendKeysToElement(element, text);
    }
    public void clickByXpath(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        waitByMilliSeconds(800);
        element.click();
    }

    public void pullElements(String key) {
        List<WebElement> elements = driver.findElements(By.cssSelector(key));
        if (elements.size()>0){
            for(int i=0; i<elements.size();i++){
                System.out.println(elements.get(i));
            }
        }

    }
}
