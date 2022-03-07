package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class ProductsPage {
    private final By PRODUCTS_EDIT = By.xpath(".//div[contains(@class, 'products-list-cview')]/div[1]/div/footer");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public ProductsPage(BaseFunction baseFunction) {
        this.baseFunction = baseFunction;
    }

    public void LookingClickEditProduct() {
        LOGGER.info("Looking for Product Edit button to click on it on the PRODUCTS PAGE");
        baseFunction.waitingForPresenceOfElement(PRODUCTS_EDIT);
        baseFunction.click(PRODUCTS_EDIT);
    }
}
