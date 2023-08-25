import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Automation {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Instagram's login page
        driver.get("https://www.instagram.com/accounts/login/");

        // Replace 'your_username' and 'your_password' with your credentials
        String username = "ascendsolutionsonline@gmail.com";
        String password = "AscendSolutionsOnline@8888";

        // Locate the username and password fields, and the login button
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        // Input credentials and click the login button
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        // Wait for a few seconds to simulate interactions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Perform any interactions you want here, such as liking posts or following users

        // Log out
        driver.get("https://www.instagram.com/accounts/logout/");

        // Close the browser window
        driver.quit();
    }
}
