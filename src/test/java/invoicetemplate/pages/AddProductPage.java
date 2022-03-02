package invoicetemplate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class AddProductPage {
    private final By PRODUCT_TITLE_FIELD = By.xpath(".//div[@class = 'formRow']/label/div/div/input");
    private final By PRICE_FIELD = By.xpath(".//label/div/input[@class = 's-shape-rounded--right s-shape-with-stone']");
    private final By QTY_FIELD = By.xpath(".//div[@class = 'formRow s-flex--justified s-items']/label[2]/div/input");
    private final By DISCOUNT_FIELD = By.xpath(".//div[@class = 'formField']/div/input");
    private final By TAX_FIELD = By.xpath(".//div[@class = 'formField']/div/div/div/span/span");
    private final By TAX_FIELD_VAT = By.xpath(".//div[@class = 'Select-menu-outer']/div/div[2]");
    private final By ADD_PRODUCTS_BTN = By.xpath(".//footer/div/aside/a[2]");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;


    public AddProductPage (BaseFunction baseFunction) {

        this.baseFunction = baseFunction;
    }

    public void EntSaveChangesOnAddProdPage(){
        LOGGER.info("Filling up all the information and Saving Changes on ADD PRODUCT PAGE");

        LOGGER.info("Looking for Product title field to click on it on the ADD PRODUCTS page");
        baseFunction.click(PRODUCT_TITLE_FIELD);

        LOGGER.info("Entering text - Automation testing to the Product title field");
        baseFunction.clickPlusEntrText(PRODUCT_TITLE_FIELD, "Automation testing");

        LOGGER.info("Looking for Price field to click on it");
        baseFunction.click(PRICE_FIELD);

        LOGGER.info("Entering amount - 1.00 to the Price field");
        baseFunction.clickPlusEntrText(PRICE_FIELD, "1.00");

        LOGGER.info("Looking for Qty field to click on it");
        baseFunction.click(QTY_FIELD);

        LOGGER.info("Entering amount - 1 to the Qty field");
        baseFunction.clickPlusEntrText(QTY_FIELD, "1");

        LOGGER.info("Looking for Discount field to click on it");
        baseFunction.clickPlusEntrText(DISCOUNT_FIELD, "0");

        LOGGER.info("Looking for Tax field to click on it");
        baseFunction.click(TAX_FIELD);

        LOGGER.info("Looking for VAT in the dropdown field to click on it");
        baseFunction.click(TAX_FIELD_VAT);

        LOGGER.info("Looking for Add Products button to click on it");
        baseFunction.click(ADD_PRODUCTS_BTN);

    }
}
