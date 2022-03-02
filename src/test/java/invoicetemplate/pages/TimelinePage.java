package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TimelinePage {
    private final By INVOICE_SECTION = By.xpath(".//ul/li[3]");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public TimelinePage(BaseFunction baseFunction) {
        this.baseFunction = baseFunction;
    }

    public void goToInvoiceSection(){

        LOGGER.info("Looking for Invoice section to click on it on the TIMELINE PAGE");
        baseFunction.click(INVOICE_SECTION);
    }
}
