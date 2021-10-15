import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW1 {
    WebDriver webd;

    @BeforeMethod
    public void preCondition(){
        webd=new ChromeDriver();

        webd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");

    }

    @Test
    public void testName(){
        WebElement element = webd.findElement(By.tagName("a"));

        webd.findElement(By.tagName("body"));
        webd.findElement(By.tagName("div"));
        webd.findElement(By.tagName("h1"));
        webd.findElement(By.tagName("a"));
        webd.findElement(By.tagName("input"));
        webd.findElement(By.tagName("br"));
        webd.findElement(By.tagName("button"));

        webd.findElement(By.id("root"));

        webd.findElement(By.className("container"));
        webd.findElement(By.className("navbar-component_nav__1X_4m"));
        webd.findElement(By.className("login_login__3EHKB"));

        



    }

    @AfterMethod
    public void postCondition(){

    }
}
