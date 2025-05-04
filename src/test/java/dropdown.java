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

public class dropdown {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        options.addArguments("--ignore-certificate-errors");

        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        Select dropdown_select = new Select(dropdown);
        dropdown_select.selectByValue("2");

        String selectedText = dropdown_select.getFirstSelectedOption().getText();

        if(selectedText.equals("Option 2")){
            System.out.println("Test Passed");
        }
    }
}
