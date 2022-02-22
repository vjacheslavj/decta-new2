package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

    private final By LOGIN_FIELD = By.name("username");
    private final By PASSWORD_FIELD = By.name("password");
    private final By LOG_IN = By.xpath(".//div[@class = 's-flex']");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public LoginPage(BaseFunction baseFunction){
        this.baseFunction = baseFunction;
    }

    public void loginGate(){
        LOGGER.info("Login to the Gate page");

        LOGGER.info("Looking for Login field to click on it");
        baseFunction.wait.until(ExpectedConditions.presenceOfElementLocated(LOGIN_FIELD));
        WebElement loginField = baseFunction.driver.findElement(LOGIN_FIELD);
        loginField.click();
        loginField.sendKeys("vjaceslavs.jermakovs+22@decta.com");
        LOGGER.info("Looking for Password field to click on it");
        baseFunction.wait.until(ExpectedConditions.presenceOfElementLocated(PASSWORD_FIELD));
        WebElement passwordField = baseFunction.driver.findElement(PASSWORD_FIELD);
        passwordField.click();
        passwordField.sendKeys("O4calZ6spnW5oQJ2NW0B");
        LOGGER.info("Looking for Login button to click on it");
        baseFunction.click(LOG_IN);
    }
}
