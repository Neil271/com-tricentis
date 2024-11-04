package browsertest; /**
 * Project-1 - ProjectName: com-tricentis
 * BaseUrl = https://demowebshop.tricentis.com/
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demowebshop.tricentis.com/login ”
 * 7. Print the current URL.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current URL.
 * 11. Refresh the page.
 * 12. Enter the email in the email field.
 * 13. Enter the password in the password field.
 * 14. Click on the Login Button.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        //BaseUrl
        String baseUrl = "https://demowebshop.tricentis.com/";

        //1. Set up FireFox browser.
        WebDriver driver = new FirefoxDriver();

        //2. Open URL.
        driver.get(baseUrl);

        //Maximise the Browser window
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //4. Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url " + currentUrl);

        //5. Print the page source.
        System.out.println("The page source :" + driver.getPageSource());

        //6. Navigate to Url.
        //“https://demowebshop.tricentis.com/login ”
        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginUrl);

        //7. Print the current URL.
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

        //8. Navigate back to the home page.
        driver.navigate().back();
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

        //9. Navigate to the login page.
        driver.navigate().forward();

        //10. Print the current URL.
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Enter the email in the email field.
        WebElement emailId = driver.findElement(By.id("Email"));
        emailId.sendKeys("abc123@gmail.com");

        //13. Enter the password in the password field.
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("xyz123@");

        //14. Click on the Login Button.
        WebElement button = driver.findElement(By.className("login-button"));
        button.click();

        //15. Close the browser.
        driver.quit();
    }
}
