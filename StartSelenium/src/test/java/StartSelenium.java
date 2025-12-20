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
        //wd.get("https://obcpneustg-desktopui.obcompanion.cloud/login"); // open string url

        wd.navigate().to("https://obcpneustg-desktopui.obcompanion.cloud/login"); // open string url and save history
        //wd.navigate().forward();

    }

    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("div")); // 1 element find

        List<WebElement> elements = wd.findElements(By.tagName("div")); // all elements find
        System.out.println(elements.size()); // import class ALT + enter

        //wd.findElement(By.className("card-title"));
        wd.findElement(By.cssSelector("a")); // tag name
        wd.findElement(By.cssSelector("div"));

        wd.findElement(By.cssSelector(".container")); //. class
        wd.findElement(By.cssSelector("#root")); //# id
        wd.findElement(By.cssSelector("[href='/login']")); //text
        wd.findElement(By.cssSelector("href"));
        wd.findElement(By.cssSelector("[href ^='/lo']")); //start
        wd.findElement(By.cssSelector("[href $='in']")); //end
        wd.findElement(By.cssSelector("[href *='ogi']")); //contains

        wd.findElement(By.linkText("Privacy notice"));
        wd.findElement(By.partialLinkText("Terms"));




    }

    @AfterMethod
    public void postCondition(){
        //wd.close(); close just current page
        //wd.quit(); close all pages

    }
}
