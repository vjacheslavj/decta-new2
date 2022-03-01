package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class AddInvoiceTemplatePage {
    private final By INVOICE_NAME_FIELD = By.xpath(".//div[@class = 'formRow']/label/input");
    private final By SAVE_TEMPLATE_BTN = By.xpath(".//footer/div/nav/a/span[2]");
    private final By INVOICE_TOTAL_PRICE = By.xpath(".//div[@class = 's-flex s-text-size--l']/div[2]");
    private final By ADD_INVOICE_PAGE_INVOICE_NAME = By.xpath(".//div/div/label/input");
    private final By INVOICE_SECTION = By.xpath(".//ul/li[3]");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public AddInvoiceTemplatePage(BaseFunction baseFunction){
        this.baseFunction = baseFunction;
    }

    public void AddSaveInvoiceTemplate (){
        LOGGER.info("Filling up all the information and Saving Invoice template on ADD INVOICE TEMPLATE PAGE");

        JavascriptExecutor scrollDown = (JavascriptExecutor) baseFunction.driver;
        LOGGER.info("Looking for Invoice name field to click on it on the ADD INVOICE page and tp enter text");
        baseFunction.clickPlusEntrText(INVOICE_NAME_FIELD, "Automation testing invoice");
        LOGGER.info("Looking for Invoice name then to save it for the Assertions");
        String addInvoicePageInvoiceName = baseFunction.driver.findElement(ADD_INVOICE_PAGE_INVOICE_NAME).getText();
        LOGGER.info("Scrolling down the page and Looking for Invoice Total price then to save it for the Assertions");
        scrollDown.executeScript("window.scrollBy(0, 400)");
        String addInvoicePageTotalPrice = baseFunction.driver.findElement(INVOICE_TOTAL_PRICE).getText();
        LOGGER.info("Looking for Save Template button to click on it");
        baseFunction.click(SAVE_TEMPLATE_BTN);
        LOGGER.info("Gate need the time to save all changes so i am waiting fo 3 sec");
        baseFunction.Sleep(); // gate need time to save all changes
        baseFunction.click(INVOICE_SECTION);

    }

}
