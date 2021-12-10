import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestDecta {

        //  .//*[contains(@name, 'username')]
    private final By LOGIN_FIELD = By.name("username");
    private final By PASSWORD_FIELD = By.name("password");
    private final By LOG_IN = By.xpath(".//div[@class = 's-flex']");

    private final By INVOICE_SECTION = By.xpath(".//ul/li[3]");

    private final By ADD_INVOICE_BTN = By.xpath(".//header/nav/a");

    private final By REQUEST_DETAILS_FIELD = By.xpath(".//fieldset/div/div[4]/div/div/div/span[2]/span[@class = 'Select-arrow']");
    private final By REQUEST_DETAILS_FIELD_EMAIL = By.xpath(".//div[@class = 'Select-menu-outer']/div/div[1]");
    private final By SAVE_CHANGES_BTN = By.xpath(".//footer/div/aside/button");

    private final By PRODUCT_TITLE_FIELD = By.xpath(".//div[@class = 'formRow']/label/div/div/input");
    private final By PRICE_FIELD = By.xpath(".//label/div/input[@class = 's-shape-rounded--right s-shape-with-stone']");
    private final By QTY_FIELD = By.xpath(".//div[@class = 'formRow s-flex--justified s-items']/label[2]/div/input");
    private final By DISCOUNT_FIELD = By.xpath(".//div[@class = 'formField']/div/input");
    private final By TAX_FIELD = By.xpath(".//div[@class = 'formField']/div/div/div/span/span");
    private final By TAX_FIELD_VAT = By.xpath(".//div[@class = 'Select-menu-outer']/div/div[2]");
    private final By ADD_PRODUCTS_BTN = By.xpath(".//footer/div/aside/a[2]");

    private final By INVOICE_NAME_FIELD = By.xpath(".//div[@class = 'formRow']/label/input");
    private final By SAVE_TEMPLATE_BTN = By.xpath(".//footer/div/nav/a/span[2]");
    private final By INVOICE_TOTAL_PRICE = By.xpath(".//div[@class = 's-flex s-text-size--l']/div[2]");
    private final By ADD_INVOICE_PAGE_INVOICE_NAME = By.xpath(".//div/div/label/input");
        //private final By ADD_INVOICE_PAGE_INVOICE_SECTION = By.xpath(".//li[@class = 's-padding-right--xs active']/a/span[2]");
        //private final By INVOICE_POPUP_LEAVE_BTN = By.xpath(".//div[contains(@class, 'ui-dialog')]/footer/a[2]");

    private final By CREATED_INVOICE = By.xpath(".//div[@class = 's-wrapper']/div/div/div/div/a[1]");

        //private final By EDIT_INV_INV_NAME = By.xpath(".//div[@class = 'formRow']/label/input[@value = 'Automation testing invoice']");
    private final By DELETE_TEMPLATE = By.xpath(".//footer/div/nav/a[1]/span[2]");
    private final By POPUP_DELETE_TEMPLATE = By.xpath(".//div[contains(@class, 'ui-dialog ui-corner-all')]/footer/a[2]");
    private final By PRODUCTS_SECTION = By.xpath(".//ul/li[8]");
    private final By PRODUCTS_EDIT = By.xpath(".//div[contains(@class, 'products-list-cview')]/div[1]/div/footer");
    private final By DELETE_PRODUCTS = By.xpath(".//footer/div/nav/a/span[2]");
    private final By POPUP_DELETE_PRODUCT = By.xpath(".//div[contains(@class, 'ui-dialog')]/footer/a[2]");

    private final Logger LOGGER = LogManager.getLogger(FirstTestDecta.class);

    private WebDriver driver;

    @Test
    public void firstTest() throws InterruptedException {
        LOGGER.info("This test is creating Invoice template. Checking Invoice Name with Invoice total price on Add Invoice page and Edit Invoice page");

        LOGGER.info("Setting driver location");
        System.setProperty("webdriver.chrome.driver", "C://Users/vjermakovs/Desktop/New folder/chromedriver.exe");

        LOGGER.info("Opening browser window");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        LOGGER.info("Opening Home Page");
        driver.get("https://gate.dcdev.dvte.ch/merchants/en/login");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;

        LOGGER.info("Looking for Login field to click on it on the GATE LOGIN page");
        wait.until(ExpectedConditions.presenceOfElementLocated(LOGIN_FIELD));
        WebElement loginField = driver.findElement(LOGIN_FIELD);
        loginField.click();
        LOGGER.info("Looking for Password field to click on it");
        wait.until(ExpectedConditions.presenceOfElementLocated(PASSWORD_FIELD));
        loginField.sendKeys("vjaceslavs.jermakovs+22@decta.com");
        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.click();
        LOGGER.info("Looking for Login button to click on it");
        wait.until(ExpectedConditions.presenceOfElementLocated(LOG_IN));
        passwordField.sendKeys("O4calZ6spnW5oQJ2NW0B");
        WebElement logIn = driver.findElement(LOG_IN);
        logIn.click();


        LOGGER.info("Looking for Invoice section to click on it on the GATE PAGE");
        wait.until(ExpectedConditions.presenceOfElementLocated(INVOICE_SECTION));
        WebElement invoiceSection = driver.findElement(INVOICE_SECTION);
        invoiceSection.click();


        LOGGER.info("Looking for Add invoice button to click on it on the INVOICE PAGE");
        wait.until(ExpectedConditions.presenceOfElementLocated(ADD_INVOICE_BTN));
        WebElement addInvoiceBtn = driver.findElement(ADD_INVOICE_BTN);
        addInvoiceBtn.click();


        LOGGER.info("Scrolling down ADD INVOICE page and Looking for Request details Field to click on it");
        wait.until(ExpectedConditions.presenceOfElementLocated(REQUEST_DETAILS_FIELD));
        WebElement invoiceField = driver.findElement(REQUEST_DETAILS_FIELD);
        wait.until(ExpectedConditions.elementToBeClickable(REQUEST_DETAILS_FIELD));
        scrollDown.executeScript("window.scrollBy(0, 400)");
        invoiceField.click();
        LOGGER.info("Looking for request details Email to click on it");
        WebElement email = driver.findElement(REQUEST_DETAILS_FIELD_EMAIL);
        email.click();
        LOGGER.info("Looking for Save Changes button to click on it");
        wait.until(ExpectedConditions.presenceOfElementLocated(SAVE_CHANGES_BTN));
        WebElement saveChangesBtn = driver.findElement(SAVE_CHANGES_BTN);
        saveChangesBtn.click();


        LOGGER.info("Looking for Product title field to click on it on the ADD PRODUCTS page");
        wait.until(ExpectedConditions.presenceOfElementLocated(PRODUCT_TITLE_FIELD));
        WebElement productTitleField = driver.findElement(PRODUCT_TITLE_FIELD);
        productTitleField.click();
        LOGGER.info("Entering test - Automation testing to the Product title field");
        productTitleField.sendKeys("Automation testing");
        LOGGER.info("Looking for Price field to click on it");
        wait.until(ExpectedConditions.presenceOfElementLocated(PRICE_FIELD));
        WebElement priceField = driver.findElement(PRICE_FIELD);
        priceField.click();
        LOGGER.info("Entering amount - 1.00 to the Price field");
        priceField.sendKeys("1.00");
        LOGGER.info("Looking for Qty field to click on it");
        wait.until(ExpectedConditions.presenceOfElementLocated(QTY_FIELD));
        WebElement qtyField = driver.findElement(QTY_FIELD);
        qtyField.click();
        LOGGER.info("Entering amount - 1 to the Qty field");
        qtyField.sendKeys("1");
        LOGGER.info("Looking for Discount field to click on it");
        wait.until(ExpectedConditions.presenceOfElementLocated(DISCOUNT_FIELD));
        WebElement discountField = driver.findElement(DISCOUNT_FIELD);
        discountField.click();
        LOGGER.info("Entering amount - 0 to the Discount field");
        discountField.sendKeys("0");
        LOGGER.info("Looking for Tax field to click on it");
        wait.until(ExpectedConditions.presenceOfElementLocated(TAX_FIELD));
        WebElement taxField = driver.findElement(TAX_FIELD);
        taxField.click();
        LOGGER.info("Looking for VAT in the dropdown field to click on it");
        wait.until(ExpectedConditions.presenceOfElementLocated(TAX_FIELD_VAT));
        WebElement vat = driver.findElement(TAX_FIELD_VAT);
        vat.click();
        LOGGER.info("Looking for Add Products button to click on it");
        WebElement addProducts = driver.findElement(ADD_PRODUCTS_BTN);
        addProducts.click();


        LOGGER.info("Looking for Invoice name field to click on it on the ADD INVOICE page");
        wait.until(ExpectedConditions.presenceOfElementLocated(INVOICE_NAME_FIELD));
        WebElement invoiceNameField = driver.findElement(INVOICE_NAME_FIELD);
        invoiceNameField.click();
        LOGGER.info("Entering amount - Automation testing invoice to the Invoice name field");
        invoiceNameField.sendKeys("Automation testing invoice");
        LOGGER.info("Looking for Invoice name then to save it for the Assertions");
        String addInvoicePageInvoiceName = driver.findElement(ADD_INVOICE_PAGE_INVOICE_NAME).getText();
        LOGGER.info("Scrolling down the page and Looking for Invoice Total price then to save it for the Assertions");
        scrollDown.executeScript("window.scrollBy(0, 400)");
        String addInvoicePageTotalPrice = driver.findElement(INVOICE_TOTAL_PRICE).getText();

            //String addInvoicePageTotalPriceString = driver.findElement(ADD_INVOICE_PAGE_TOTAL_PRICE).getText();
            //int addInvoicePageTotalPrice = Integer.parseInt(addInvoicePageTotalPriceString);

        LOGGER.info("Looking for Save Template button to click on it");
        WebElement saveTemplateBtn = driver.findElement(SAVE_TEMPLATE_BTN);
        saveTemplateBtn.click();
        LOGGER.info("Gate need the time to save all changes so i am waiting fo 3 sec");
        Thread.sleep(3000); // gate need time to save all changes
        LOGGER.info("Looking for Add Invoice Section to click on it");
        WebElement addInvoiceInvoiceSection = driver.findElement(INVOICE_SECTION);
        addInvoiceInvoiceSection.click();

            //wait.until(ExpectedConditions.presenceOfElementLocated(INVOICE_POPUP_LEAVE_BTN));
            //WebElement invoicePageLeaveBtn = driver.findElement(INVOICE_POPUP_LEAVE_BTN);
            //wait.until(ExpectedConditions.elementToBeClickable(INVOICE_POPUP_LEAVE_BTN));
            //invoicePageLeaveBtn.click();

        LOGGER.info("Looking for Created invoice to click on it on the Invoice page");
        wait.until(ExpectedConditions.presenceOfElementLocated(CREATED_INVOICE));
        WebElement createdInvoice = driver.findElement(CREATED_INVOICE);
        createdInvoice.click();


        LOGGER.info("Looking for Invoice name to save it on the EDIT INVOICE page for the assertions");
        wait.until(ExpectedConditions.presenceOfElementLocated(INVOICE_NAME_FIELD));
        String editInvoicePageInvoiceName = driver.findElement(INVOICE_NAME_FIELD).getText();
        LOGGER.info("Scrolling down the page and Looking for Invoice Total price then to save it for the Assertions");
        scrollDown.executeScript("window.scrollBy(0, 500)");
        wait.until(ExpectedConditions.presenceOfElementLocated(INVOICE_TOTAL_PRICE));
        String editInvoicePageTotalPrice = driver.findElement(INVOICE_TOTAL_PRICE).getText();
        WebElement deleteTemplate = driver.findElement(DELETE_TEMPLATE);
        deleteTemplate.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(POPUP_DELETE_TEMPLATE));
        WebElement popupDeleteInvoices = driver.findElement(POPUP_DELETE_TEMPLATE);
        popupDeleteInvoices.click();
        Thread.sleep(3000); // gate need time to save all changes

        wait.until(ExpectedConditions.presenceOfElementLocated(PRODUCTS_SECTION));
        WebElement productsSection = driver.findElement(PRODUCTS_SECTION);
        productsSection.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(PRODUCTS_EDIT));
        WebElement productEdit = driver.findElement(PRODUCTS_EDIT);
        productEdit.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(DELETE_PRODUCTS));
        WebElement deleteProducts = driver.findElement(DELETE_PRODUCTS);
        deleteProducts.click();
        wait.until(ExpectedConditions.elementToBeClickable(POPUP_DELETE_PRODUCT));
        WebElement popDeleteProductBtn = driver.findElement(POPUP_DELETE_PRODUCT);
        popDeleteProductBtn.click();


            //wait.until(ExpectedConditions.presenceOfElementLocated(INVOICE_SECTION));
            //WebElement editInvoicePageInvoiceSection = driver.findElement(INVOICE_SECTION);
            //editInvoicePageInvoiceSection.click();

        Assertions.assertEquals(addInvoicePageInvoiceName, editInvoicePageInvoiceName, "Wrong invoice name!");
        Assertions.assertEquals(addInvoicePageTotalPrice, editInvoicePageTotalPrice, "Wrong total price!");
    }

        @AfterEach
        public void closeBrowser() {

        driver.close();
   }
}
