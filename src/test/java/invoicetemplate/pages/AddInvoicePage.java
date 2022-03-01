package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddInvoicePage {
    private final By REQUEST_DETAILS_FIELD = By.xpath(".//fieldset/div/div[4]/div/div/div/span[2]/span[@class = 'Select-arrow']");
    private final By REQUEST_DETAILS_FIELD_EMAIL = By.xpath(".//div[@class = 'Select-menu-outer']/div/div[1]");
    private final By SAVE_CHANGES_BTN = By.xpath(".//footer/div/aside/button");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;


    public AddInvoicePage(BaseFunction baseFunction) {

        this.baseFunction = baseFunction;
    }

    public void EntSaveChangesOnAddInvPage(){
        LOGGER.info("Filling up all the information and Saving Changes on ADD INVOICE PAGE");

        JavascriptExecutor scrollDown = (JavascriptExecutor) baseFunction.driver;
        LOGGER.info("Scrolling down ADD INVOICE page and Looking for Request details Field to click on it");
        baseFunction.wait.until(ExpectedConditions.presenceOfElementLocated(REQUEST_DETAILS_FIELD));
        scrollDown.executeScript("window.scrollBy(0, 400)");
        baseFunction.click(REQUEST_DETAILS_FIELD);
        LOGGER.info("Looking for request details Email to click on it");
        baseFunction.click(REQUEST_DETAILS_FIELD_EMAIL);
        LOGGER.info("Looking for Save Changes button to click on it");
        baseFunction.click(SAVE_CHANGES_BTN);
    }

}
