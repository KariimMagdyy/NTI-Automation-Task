import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class login {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        options.addArguments("--ignore-certificate-errors");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        Thread.sleep(1000);
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        Thread.sleep(1000);
        WebElement product = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        product.click();
        Thread.sleep(1000);
        WebElement cart = driver.findElement(By.id("shopping_cart_container"));
        cart.click();
        Thread.sleep(1000);
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        Thread.sleep(1000);
        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("Karim");
        Thread.sleep(1000);
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Magdy");
        Thread.sleep(1000);
        WebElement postal_Code = driver.findElement(By.id("postal-code"));
        postal_Code.sendKeys("12345");
        Thread.sleep(1000);
        WebElement Continue = driver.findElement(By.id("continue"));
        Continue.click();
        Thread.sleep(1000);
        WebElement finish = driver.findElement(By.id("finish"));
        finish.click();
        Thread.sleep(1000);
        WebElement ReturnToHome = driver.findElement(By.id("back-to-products"));
        ReturnToHome.click();
        Thread.sleep(1000);
    }
}
