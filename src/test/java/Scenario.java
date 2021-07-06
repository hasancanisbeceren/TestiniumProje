import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Scenario extends BaseTest {
    Steps steps = new Steps();
    @Test
    @Order(1)
    public void girisTest(){
        steps.sendKeysToElementTest("input[id='L-UserNameField']", "xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='L-PasswordField']", "123deneme123");
        steps.clickElement("input[id='gg-login-enter']");
    }

    @Test
    @Order(2)
    public void urunArama(){
        girisTest();
        steps.sendKeysToElementTest("#main-header > div:nth-child(3) > div > div > div > div.sc-1nx8ums-0.fXQfgp > form > div > div.sc-1yew439-3.bxSoKG > div.sc-4995aq-4.dNPmGY > input", "iphone telefon");
        steps.clickElement("#main-header > div:nth-child(3) > div > div > div > div.sc-1nx8ums-0.fXQfgp > form > div > div.sc-1yew439-1.gPcKGA > button");
    }

    @Test
    @Order(3)
    public void urunleriCek(){
        girisTest();
        steps.sendKeysToElementTest("#main-header > div:nth-child(3) > div > div > div > div.sc-1nx8ums-0.fXQfgp > form > div > div.sc-1yew439-3.bxSoKG > div.sc-4995aq-4.dNPmGY > input", "iphone telefon");
        steps.clickElement("#main-header > div:nth-child(3) > div > div > div > div.sc-1nx8ums-0.fXQfgp > form > div > div.sc-1yew439-1.gPcKGA > button");
        steps.pullElements("p[class='image-container product-hslider-container']");

    }
    @Test
    @Order(4)
    public void sepeteEkle(){
        girisTest();
        steps.clickElement("#__next > main > div:nth-child(2) > section.tyj39b-0.iqtPYy > section.tyj39b-4.jZoSqD > a");
        steps.sendKeysToElementTest("#main-header > div:nth-child(3) > div > div > div > div.sc-1nx8ums-0.fXQfgp > form > div > div.sc-1yew439-3.bxSoKG > div.sc-4995aq-4.dNPmGY > input", "iphone telefon");
        steps.clickElement("body");
        steps.clickElement("#main-header > div:nth-child(3) > div > div > div > div.sc-1nx8ums-0.fXQfgp > form > div > div.sc-1yew439-1.gPcKGA > button");
        steps.clickElement("#item-info-block-658047116 > p > img");
        steps.clickElement("#add-to-basket");
        steps.clickElement("#wis-lightbox > div > div > div > button.wis-btn-2.wis-btn-72687.control-button.gg-ui-button.plr10.gg-ui-btn-default.wis-height");
        steps.clickElement("#header_wrapper > div.header-icon-container.robot-header-iconContainer.gg-w-5.gg-d-6.gg-t-14.gg-m-11.gg-w-push-14.gg-d-push-12.gg-t-push-0.gg-m-push-0 > div.basket-container.robot-header-iconContainer-cart > a");
    }
}
