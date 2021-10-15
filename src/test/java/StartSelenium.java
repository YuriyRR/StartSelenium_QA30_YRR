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

        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        //wd.navigate().forward();
        //open site

    }

    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        wd.findElement(By.className("container"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("about_main__2Uv5W"));
        wd.findElement(By.className("about_logo__1Y8cQ"));


        wd.findElement(By.id("root"));

        wd.findElement(By.tagName("body"));
        wd.findElement(By.tagName("div"));
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("h2"));
        wd.findElement(By.tagName("h3"));
        wd.findElement(By.tagName("p"));
        wd.findElement(By.tagName("br"));


        wd.findElement(By.linkText("HOME"));

        wd.findElement(By.partialLinkText("HO"));
        wd.findElement(By.partialLinkText("AB"));
        wd.findElement(By.partialLinkText("LO"));


        //click Login button

    }

    @Test
    public void testName2(){

    }


    @AfterMethod
    public void postCondition(){
        //wd.close();
        //wd.quit();
    }

}
