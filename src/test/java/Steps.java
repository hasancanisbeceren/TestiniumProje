import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Steps extends Methods{
    public void clickElement(String key) {
        WebElement element = findElement(key);
        clickToElement(element);
        System.out.println(" Tıklanılan  "+driver.getTitle());
    }
    public void randomClick(String key){
        List<WebElement> elements = findElements(key);
        clickToElement(elements.get(randomInt()));
    }


    public void textControlTest(String key) {
        WebElement element = findElement(key);
        textControl(element);
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
    public void ifElementExistClick(String key) {
        waitByMilliSeconds(2);
        List<WebElement> elements = driver.findElements(By.cssSelector(key));
        if (elements.size() > 0) {
            clickToElement(elements.get(0));
        }
    }

    public void getTextControlTest(String key, String text) {
        WebElement element = findElement(key);
        getTextControl(element, text);
    }

    public void getAttributeControlTest(String key, String text) {
        WebElement element = findElement(key);
        getAttributeControl(element, text);
    }
   /* public void getAttributeControlTest1(String key, String text) {
        WebElement element = findElement(key);
        getAttributeControl(element, text);
    }
    */

    public void saveText(String key) {
        WebElement element = findElement(key);
        saveStaticString(element);

    }

    public void dropdownSelected(String key){
        Select se = new Select(driver.findElement(By.cssSelector(key)));
        se.selectByValue("2");
    }

    public void keysEnterToElementTest(String key,String text){
        WebElement element = findElement(key);
        keysEnterToElement(element,text);
    }
    public void changeControl() {
        if (driver.findElements(By.cssSelector("div[class='total-price-box']")).size() > 0)
        {
            textControlTest("div[class='total-price-box']"); // ürün fiyatını kontrol et
            dropdownSelected("select[class*='amount']");
            waitByMilliSeconds(2000); // 2 saniye bekle
            getAttributeControlTest("select[class*='amount']", "2"); //ürün adeti 2 mi kontrol et..
            clickElement("i[class='gg-icon gg-icon-bin-medium']"); //ürünü kaldır butonuna bas
            waitByMilliSeconds(2000);
        }
    }

}
