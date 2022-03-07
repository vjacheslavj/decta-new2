package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class AddEditInvoiceTemplatePage {
    private final By INVOICE_NAME_FIELD = By.xpath(".//div[@class = 'formRow']/label/input");
    private final By SAVE_TEMPLATE_BTN = By.xpath(".//footer/div/nav/a/span[2]");
    private final By ADD_INVOICE_PAGE_INVOICE_TOTAL_PRICE = By.xpath(".//div[@class = 's-flex s-text-size--l']/div[2]");
    private final By EDIT_INVOICE_PAGE_INVOICE_TOTAL_PRICE = By.xpath(".//div[@class = 's-flex s-text-size--l']/div[2]");
    private final By ADD_INVOICE_PAGE_INVOICE_NAME = By.xpath(".//div/div/label/input");
    private final By EDIT_INVOICE_PAGE_INVOICE_NAME = By.xpath(".//div/div/label/input");
    private final By INVOICE_SECTION = By.xpath(".//ul/li[3]");
    private final By DELETE_TEMPLATE = By.xpath(".//footer/div/nav/a[1]/span[2]");
    private final By POPUP_DELETE_TEMPLATE = By.xpath(".//div[contains(@class, 'ui-dialog ui-corner-all')]/footer/a[2]");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public AddEditInvoiceTemplatePage(BaseFunction baseFunction){
        this.baseFunction = baseFunction;
    }

    public void AddSaveInvoiceTemplate (){
        LOGGER.info("Filling up all the information and Saving Invoice template on ADD INVOICE TEMPLATE PAGE");

        JavascriptExecutor scrollDown = (JavascriptExecutor) baseFunction.driver;

        LOGGER.info("Looking for Invoice name field to click on it on the ADD INVOICE page and tp enter text");
        baseFunction.clickPlusEntrText(INVOICE_NAME_FIELD, "Automation testing invoice");

        getInvoiceNameAddPage();
        //LOGGER.info("Looking for Invoice name then to save it for the Assertions");
        //String addInvoicePageInvoiceName = baseFunction.driver.findElement(ADD_INVOICE_PAGE_INVOICE_NAME).getText();

        LOGGER.info("Scrolling down the page");
        scrollDown.executeScript("window.scrollBy(0, 400)");

        getInvoiceTotalPriceAddPage();
        //String addInvoicePageTotalPrice = baseFunction.driver.findElement(INVOICE_TOTAL_PRICE).getText();

        LOGGER.info("Looking for Save Template button to click on it");
        baseFunction.click(SAVE_TEMPLATE_BTN);

        LOGGER.info("Gate need the time to save all changes so i am waiting fo 3 sec");
        baseFunction.Sleep(); // gate need time to save all changes
        baseFunction.click(INVOICE_SECTION);

    }

    public void DeleteInvoiceTemplate () {
        LOGGER.info("Looking for the Invoice name, total price then to save for the assertions and deleting Invoice template ");

        JavascriptExecutor scrollDown = (JavascriptExecutor) baseFunction.driver;

        getInvoiceNameEditPage();
        //LOGGER.info("Looking for Invoice name to save it on the EDIT INVOICE page for the assertions");
        //baseFunction.waitingForPresenceOfElement(INVOICE_NAME_FIELD);
        //String editInvoicePageInvoiceName = baseFunction.driver.findElement(INVOICE_NAME_FIELD).getText();

        LOGGER.info("Scrolling down the page");
        scrollDown.executeScript("window.scrollBy(0, 500)");

        getInvoiceTotalPriceEditPage();
        //baseFunction.waitingForPresenceOfElement(INVOICE_TOTAL_PRICE);
        //String editInvoicePageTotalPrice = baseFunction.driver.findElement(INVOICE_TOTAL_PRICE).getText();

        LOGGER.info("Looking for Delete template button to click on it");
        baseFunction.click(DELETE_TEMPLATE);

        LOGGER.info("Looking for Yes button on the POPUP to click on it and confirm that we are sure that we want to delete Template");
        baseFunction.click(POPUP_DELETE_TEMPLATE);

        LOGGER.info("Gate need the time to save all changes so i am waiting fo 3 sec");
        baseFunction.Sleep(); // gate need time to save all changes
    }

    public String getInvoiceNameAddPage() {
        LOGGER.info("Looking for Invoice name to save it on the ADD INVOICE page for the assertions");
        return baseFunction.getText(ADD_INVOICE_PAGE_INVOICE_NAME);
    }

    public float getInvoiceTotalPriceAddPage() {
        LOGGER.info("Looking for Invoice Total price on the ADD INVOICE page then to save it for the Assertions");
        String invoiceTotalPriceToParse = baseFunction.getText(ADD_INVOICE_PAGE_INVOICE_TOTAL_PRICE);
        return Float.parseFloat(invoiceTotalPriceToParse);
        //return Integer.parseInt(invoiceTotalPriceToParse);

    }

    public String getInvoiceNameEditPage() {
        LOGGER.info("Looking for Invoice name to save it on the EDIT INVOICE page for the assertions");
        return baseFunction.getText(EDIT_INVOICE_PAGE_INVOICE_NAME);
    }

    public float getInvoiceTotalPriceEditPage() {
        LOGGER.info("Looking for Invoice Total price then to save it for the Assertions");
        String invoiceTotalPriceToParse = baseFunction.getText(EDIT_INVOICE_PAGE_INVOICE_TOTAL_PRICE);
        return Float.parseFloat(invoiceTotalPriceToParse);
       // return Integer.parseInt(invoiceTotalPriceToParse);

    }
}
