import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class Scenario extends BaseTest{
    Steps steps = new Steps();
    @Test
    @Order(1)
    @Disabled("Login sayfasında ki bug yüzünden disable")
    public void girisTest(){
        steps.clickElement("#main-header > div:nth-child(3) > div > div > div.sc-1yvp483-0.jUYNgf > div.sc-1nx8ums-0.fQSWwJ > div > div:nth-child(1) > div");
        steps.clickElement("header#main-header > div:nth-of-type(3) > div > div > div > div:nth-of-type(3) > div > div > div:nth-of-type(2) > div > div > div > a");
        steps.sendKeysToElementTest("input[id='L-UserNameField']", "xmyle@outlook.com");
        steps.keysEnterToElementTest("input[id='L-PasswordField']", "123deneme123");
        //steps.clickElement("input#gg-login-enter");
    }

    @Test
    @Order(2)
    public void sepeteEkle(){
        //girisTest();
        //steps.getTextControlTest("#main-header > div:nth-child(4) > div > div > div > div.sc-1nx8ums-0.fePtkv > div > div:nth-child(2) > div > div.gekhq4-4.fWiwPC > span", "hasancanstoprak628616");
        steps.ifElementExistClick("a[class='tyj39b-5 lfsBU']");
        steps.keysEnterToElementTest("#main-header > div:nth-child(3) > div > div > div > div.sc-1nx8ums-0.fXQfgp > form > div > div.sc-1yew439-3.bxSoKG > div.sc-4995aq-4.dNPmGY > input", "bilgisayar");
        steps.clickElement("#__next > main > div.vfy45n-0.bWfBMK > div > div > div.sc-1nx8ums-0.fbkkZW > div > div.sc-533kbx-0.sc-1v2q8t1-0.iCRwxx.gyNBA > div.f9zh0g-0.jmjCAm > nav > ul > li:nth-child(3) > a");
        steps.getTextControlTest("#__next > main > div.vfy45n-0.bWfBMK > div > div > div.sc-1nx8ums-0.fbkkZW > div > div.sc-533kbx-0.sc-1v2q8t1-0.iCRwxx.gyNBA > div.f9zh0g-0.jmjCAm > nav > ul > li:nth-child(3) > a > span","2");
        steps.randomClick("#__next > main > div.vfy45n-0.bWfBMK > div > div > div.sc-1nx8ums-0.fbkkZW > div > div.sc-533kbx-0.sc-1v2q8t1-0.iCRwxx.gyNBA > div.sc-1favwb2-0.bTbNwr > ul > li");
        steps.saveText("#sp-price-highPrice");
        steps.clickByXpath("//*[@id=\"add-to-basket\"]");
        steps.clickElement("div[class='gg-d-10 pl0']");
        steps.waitByMilliSeconds(1000);
        steps.changeControl();
        steps.waitByMilliSeconds(6000);
        steps.getTextControlTest("div[class='gg-d-19 gg-w-21 gg-t-19 gg-m-18'] h2", "Sepetinizde ürün bulunmamaktadır."); // sepet boş mu kontrol et

    }
}
