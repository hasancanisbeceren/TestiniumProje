import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;


public class Methods extends BaseTest{
    public static String text = "";

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
    public List<WebElement> findElements(String key){
        try {
            WebDriverWait waitForFormLabel = new WebDriverWait(driver,30);
            List<WebElement> elements = driver.findElements(By.cssSelector(key));
            waitForFormLabel.until(ExpectedConditions.visibilityOfAllElements(elements));
            return elements;
        } catch (Exception ex){
            Assertions.fail(" " + key + "'li element 10 saniye boyunca arandı fakat bulunamadı...!!!!");
            return null;
        }
    }
    public void clickToElement(WebElement element) {

        scrollToElement(element);
        waitByMilliSeconds(1000);
        element.click();
    }
    public void saveStaticString(WebElement element){
        scrollToElement(element);
        text = element.getText();
        System.out.println("Elementin text değeri: "+text);
    }

    public void sendKeysToElement(WebElement element, String text) {

        scrollToElement(element);
        element.sendKeys(text);
    }
    public void getTextControl(WebElement element, String key){

        Assertions.assertEquals(key,getTextElement(element),"Eleman girilen texti içermiyor..!!!");
        System.out.println("Girilen değer ile Elementin texti uyuşuyor..");
    }
    public void getAttributeControl(WebElement element, String key) {

        Assertions.assertEquals(getAttributeElement(element), key, "Eleman girilen texti içermiyor..!!!");
        System.out.println("Girilen değer ile Elementin texti uyuşuyor..");
    }

    public void textControl(WebElement element) {

        Assertions.assertTrue(getTextElement(element).contains(text), "Eleman texti kaydedilen değer ile uyuşmuyor..!!!");
        System.out.println("Ürünün fiyatı uyuşuyor..");
    }

    public String getTextElement(WebElement element){
        scrollToElement(element);
        waitByMilliSeconds(500);
        String elemaninTexti = "";
        elemaninTexti = element.getText();
        System.out.println("Elemanın Text değeri: "+ elemaninTexti);
        return elemaninTexti;
    }
    public String getAttributeElement(WebElement element){
        scrollToElement(element);
        waitByMilliSeconds(500);
        String elemaninAttribute = "";
        elemaninAttribute = element.getAttribute("value");
        System.out.println("Elemanın Attribute değeri: " + elemaninAttribute);
        return elemaninAttribute;
    }
    /*
    public String getAttributeElement1(WebElement element){//////title değer okuma
        scrollToElement(element);
        waitByMilliSeconds(500);
        String elemaninAttribute = "";
        elemaninAttribute = element.getAttribute("title");
        System.out.println("Elemanın Attribute değeri: " + elemaninAttribute);
        return elemaninAttribute;
    }
*/
    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior:'smooth',block:'center', inline:'center'})",element);

    }
    public void keysEnterToElement(WebElement element, String text) {

        scrollToElement(element);
        waitByMilliSeconds(500);
        element.sendKeys(text, Keys.ENTER);
    }

    public int randomInt(){
        Random r = new Random();
        int low = 1;
        int high = 20;
        int result = r.nextInt(high-low)+low;
        System.out.println(result + (result+1)+ ". Elemente tıklandı...");
        return result;
    }
    public void waitByMilliSeconds(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
