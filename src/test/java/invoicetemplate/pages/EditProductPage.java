package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class EditProductPage {
    private final By DELETE_PRODUCTS = By.xpath(".//footer/div/nav/a/span[2]");
    private final By POPUP_DELETE_PRODUCT = By.xpath(".//div[contains(@class, 'ui-dialog')]/footer/a[2]");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public EditProductPage(BaseFunction baseFunction) {
        this.baseFunction = baseFunction;
    }

    public void LookingDeleteBtnClick() {
        LOGGER.info("Looking for Delete product button to click on it on the EDIT PRODUCTS PAGE");
        baseFunction.waitingForPresenceOfElement(DELETE_PRODUCTS);
        baseFunction.click(DELETE_PRODUCTS);

        LOGGER.info("Looking for Yes button on the POPUP to click on it and confirm that we are sure that we want to delete Product");
        baseFunction.click(POPUP_DELETE_PRODUCT);
    }
}
