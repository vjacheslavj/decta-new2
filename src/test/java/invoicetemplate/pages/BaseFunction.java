package invoicetemplate.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFunction {

    WebDriver driver;
    WebDriverWait wait;

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    public BaseFunction() {
        LOGGER.info("Setting driver location");
        System.setProperty("webdriver.chrome.driver", "C://Users/vjermakovs/Desktop/New folder/chromedriver.exe");
        LOGGER.info("Opening browser window");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new  WebDriverWait(driver, 10);



    }

    public void openPage(String url) {
        LOGGER.info("Opening page by URL: " + url);

        if (!url.startsWith("http://") && !url.startsWith("https://")){
            url = "https://" + url;
        }

        driver.get(url);
    }

    public void click(By locator){
        LOGGER.info("Clicking on element: " + locator);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

}
