import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hover {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        options.addArguments("--ignore-certificate-errors");

        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement user1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        WebElement user1_Cap = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div"));

        WebElement user2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        WebElement user2_Cap = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div"));

        WebElement user3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
        WebElement user3_Cap = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div"));

        user1.click();
        String Selected_text1 = user1_Cap.getText();
        if(Selected_text1.equals("name: user1"))
        {
            System.out.println("Test 1 passed");
        }

        user2.click();
        String Selected_text2 = user2_Cap.getText();
        if(Selected_text2.equals("name: user2"))
        {
            System.out.println("Test 2 passed");
        }

        user3.click();
        String Selected_text3 = user3_Cap.getText();
        if(Selected_text3.equals("name: user3"))
        {
            System.out.println("Test 3 passed");
        }

    }
}
