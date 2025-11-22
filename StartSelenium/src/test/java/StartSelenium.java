import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd=new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","/");
        //wd.get("https://obcpneustg-desktopui.obcompanion.cloud/login");

        wd.navigate().to("https://obcpneustg-desktopui.obcompanion.cloud/login");
        //wd.navigate().forward();

    }

    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("div"));
        List<WebElement> elements = wd.findElements(By.tagName("div"));
        System.out.println(elements.size());

        wd.findElement(By.className("ng-star-inserted"));
        //wd.findElement(By.id("login-page-container"));
        //wd.findElement(By.linkText("row"));
        //wd.findElement(By.partialLinkText("ca"));




    }

    @AfterMethod
    public void postCondition(){
        //wd.close();
        //wd.quit();

    }
}
