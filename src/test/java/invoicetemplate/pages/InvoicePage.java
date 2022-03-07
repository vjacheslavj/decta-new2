package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class InvoicePage {
    private final By ADD_INVOICE_BTN = By.xpath(".//header/nav/a");
    private final By CREATED_INVOICE = By.xpath(".//div[@class = 's-wrapper']/div/div/div/div/a[1]");
    private final By PRODUCTS_SECTION = By.xpath(".//ul/li[8]");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public InvoicePage(BaseFunction baseFunction) {
        this.baseFunction = baseFunction;
    }

    public void clickAddInvoiceBtn() {

        LOGGER.info("Looking for Add invoice button to click on it on the INVOICE PAGE");
        baseFunction.click(ADD_INVOICE_BTN);
    }

    public void clickOnCreatedInvoice() {

        LOGGER.info("Looking for Created invoice to click on it on the INVOICE PAGE");
        baseFunction.click(CREATED_INVOICE);
    }

    public void clickOnProductsSection() {
        LOGGER.info("Looking for Product section to click on it on the INVOICE PAGE");
        baseFunction.click(PRODUCTS_SECTION);
    }
}
