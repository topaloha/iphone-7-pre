package ua.citrus;


import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.bouncycastle.asn1.x500.style.RFC4519Style.o;

public class OrderIphone7 {

    @Test
    public void testCreateTask() {


        System.setProperty("webdriver.chrome.driver",
                /* put path to YOUR chromedriver*/
        "/usr/bin/chromedriver");
        System.setProperty("selenide.browser", "Chrome");


        open("http://www.citrus.ua//");

        $(By.linkText("Смартфоны")).click();

        $$("#reeers #last_p1").findBy(text("Apple iPhone")).click();

        $$("#ff447f").findBy(text("iPhone 7")).click();

        //choose memory value
        $$(".hdd_list").findBy(text("256 Gb")).click();

        //choose silver color
        $(By.xpath("//*[@id=\"content-center\"]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/table/tbody/tr/td[2]/a[1]\n"))
                .click();
        $(By.xpath("//*[@id=\"content-center\"]/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div/span[1]"))
                .click();

        $("table #fio").val("Диана");
        $("table #tel").val("380689966999");
        $("table #selCity").click();
        $(By.linkText("Киев")).click();
        $("table #email").val("drDre@gmail.com");
        $("table textarea").val("booletproov");
        $("table #igreed").click();
        $("table #send_preorder").click();

        $(By.xpath(".//*[@id=\"vald_form\"]/div/p[1]/span")).shouldHave(matchesText("успешно оформлен"));

    }

}
