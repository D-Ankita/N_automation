import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeetCodeAutomation {

    public static void main(String[] args) {
        // Initialize the Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Open LeetCode homepage
            driver.get("https://leetcode.com/");

            // Navigate to the "Discuss" section
            WebElement discussLink = driver.findElement(By.linkText("Discuss"));
            discussLink.click();

            // Filter discussions by Java tag
            WebElement javaTagFilter = driver.findElement(By.xpath("//span[text()='java']"));
            javaTagFilter.click();

            // Open the first discussion
            WebElement firstDiscussion = driver.findElement(By.xpath("//div[@class='reactable-data']//a[@class='title__31x5']"));
            firstDiscussion.click();

            // Copy code from the discussion
            WebElement codeElement = driver.findElement(By.xpath("//div[@class=' code__2PqO']"));
            String code = codeElement.getText();

            // Back to the problem
            driver.navigate().back();

            // Paste the solution in the playground
            WebElement playground = driver.findElement(By.xpath("//textarea[@class='ace_text-input']"));
            playground.sendKeys(code);

            // Run the test
            WebElement runButton = driver.findElement(By.xpath("//button[text()='Run Code']"));
            runButton.click();

            // Wait for a few seconds to see the result (you can adjust this time)
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
            driver.quit();
        }
    }
}
