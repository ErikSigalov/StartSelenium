import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableTest {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void tableTestCss(){
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(8) td:last-child"));
        String text = canada.getText();

        System.out.println(text);
        Assert.assertEquals(text,"Canada");
    }

    @Test

    public void tableHomeWork(){
        WebElement row4 = wd.findElement(By.cssSelector("tr:nth-child(4)"));
        String text1 = row4.getText();

        System.out.println(text1);
        Assert.assertTrue(text1.contains("Chang"));
    }

    @Test

    public void tableHomeWork1(){
        WebElement franisco = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)"));
        String text2 = franisco.getText();

        System.out.println(text2);

        Assert.assertEquals(text2,"Francisco Chang");
    }

    @Test

    public void tableHomeWork2(){
        
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
