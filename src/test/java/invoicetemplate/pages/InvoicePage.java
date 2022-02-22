package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class InvoicePage {
    private final By ADD_INVOICE_BTN = By.xpath(".//header/nav/a");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public InvoicePage(BaseFunction baseFunction) {
        this.baseFunction = baseFunction;
    }

    public void clickAddInvoiceBtn() {
        LOGGER.info("Looking for Add invoice button to click on it on the INVOICE PAGE");
        baseFunction.click(ADD_INVOICE_BTN);
    }

}
