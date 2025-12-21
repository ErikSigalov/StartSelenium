import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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
        wd.findElement(By.xpath("//tr[8]/td[last()]"));
        String text = canada.getText();

        System.out.println(text);
        Assert.assertEquals(text,"Canada");
    }

    @Test

    public void tableHomeWork(){
        WebElement row4 = wd.findElement(By.cssSelector("tr:nth-child(4)"));
        wd.findElement(By.xpath("//tr[4]"));
        String text1 = row4.getText();

        System.out.println(text1);
        Assert.assertTrue(text1.contains("Chang"));
    }

    @Test

    public void tableHomeWork1(){
        WebElement francisco = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)"));
        wd.findElement(By.xpath("//tr[4]//td[2]"));
        String text2 = francisco.getText();

        System.out.println(text2);

        Assert.assertEquals(text2,"Francisco Chang");
    }

    @Test

    public void tableHomeWork2(){
        //print count of rows
        List<WebElement> rows = wd.findElements(By.cssSelector("tr"));
        wd.findElement(By.xpath("//tr"));
        System.out.println(rows.size());

        Assert.assertEquals(rows.size(), 28);

        //print count of columns
        List<WebElement> columns = wd.findElements(By.cssSelector("tr th"));
        wd.findElement(By.xpath("//tr/th"));
        System.out.println(columns.size());

        //print row 3
        List<WebElement> row3 = wd.findElements(By.cssSelector("tr:nth-child(3) td"));
        wd.findElement(By.xpath("//tr[3]/td"));
        System.out.println("Row 3 --->" + row3.size());

        for(WebElement el: row3) {
            System.out.println(el.getText());
        }

        //print last columns
        List<WebElement> lastColumns = wd.findElements(By.cssSelector("td:last-child"));
        wd.findElements(By.xpath("//td[last()]"));
        for (WebElement el:
        lastColumns){
            System.out.println(el.getText());
        }

        //print MAaria Anders
        System.out.println(wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)")).getText());
        wd.findElement(By.xpath("//tr[2]/td[2]"));


    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
