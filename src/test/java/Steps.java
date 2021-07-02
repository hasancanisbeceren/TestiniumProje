import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    public void pullElements(String key) {
        List<WebElement> elements = driver.findElements(By.cssSelector(key));
        if (elements.size()>0){
            for(int i=0; i<elements.size();i++){
                System.out.println(elements.get(i));
            }
        }

    }
}
