package invoicetemplate;

import invoicetemplate.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FirstTestDecta {

    private final By PRODUCTS_SECTION = By.xpath(".//ul/li[8]");
    private final By PRODUCTS_EDIT = By.xpath(".//div[contains(@class, 'products-list-cview')]/div[1]/div/footer");
    private final By DELETE_PRODUCTS = By.xpath(".//footer/div/nav/a/span[2]");
    private final By POPUP_DELETE_PRODUCT = By.xpath(".//div[contains(@class, 'ui-dialog')]/footer/a[2]");


    private final Logger LOGGER = LogManager.getLogger(this.getClass());


    private WebDriver driver;


    @Test
    public void firstTest()  {
        LOGGER.info("This test is creating Invoice template. Checking Invoice Name with Invoice total price on Add Invoice page and Edit Invoice page");

        BaseFunction baseFunction = new BaseFunction();
        baseFunction.openPage("gate.dcdev.dvte.ch/merchants/en/login");


        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
//

        LoginPage loginPage = new LoginPage(baseFunction);
        loginPage.loginGate();

        TimelinePage timelinePage = new TimelinePage(baseFunction);
        timelinePage.goToInvoiceSection();

        InvoicePage invoicePage = new InvoicePage(baseFunction);
        invoicePage.clickAddInvoiceBtn();

        AddInvoicePage addInvoicePage = new AddInvoicePage(baseFunction);
        addInvoicePage.EntSaveChangesOnAddInvPage();

        AddProductPage addProductPage = new AddProductPage(baseFunction);
        addProductPage.EntSaveChangesOnAddProdPage();

        AddEditInvoiceTemplatePage addInvoiceTemplatePage = new AddEditInvoiceTemplatePage(baseFunction);
        addInvoiceTemplatePage.AddSaveInvoiceTemplate();

        invoicePage.clickOnCreatedInvoice();

        addInvoiceTemplatePage.DeleteInvoiceTemplate();


   //    LOGGER.info("Looking for Product section to click on it on the INVOICE PAGE");
   //    wait.until(ExpectedConditions.presenceOfElementLocated(PRODUCTS_SECTION));
   //    WebElement productsSection = driver.findElement(PRODUCTS_SECTION);
   //    productsSection.click();


   //    LOGGER.info("Looking for Product Edit button to click on it on the PRODUCTS PAGE");
   //    wait.until(ExpectedConditions.presenceOfElementLocated(PRODUCTS_EDIT));
   //    WebElement productEdit = driver.findElement(PRODUCTS_EDIT);
   //    productEdit.click();


   //    LOGGER.info("Looking for Delete product button to click on it on the EDIT PRODUCTS PAGE");
   //    wait.until(ExpectedConditions.presenceOfElementLocated(DELETE_PRODUCTS));
   //    WebElement deleteProducts = driver.findElement(DELETE_PRODUCTS);
   //    deleteProducts.click();
   //    LOGGER.info("Looking for Yes button on the POPUP to click on it and confirm that we are sure that we want to delete Product");
   //    wait.until(ExpectedConditions.elementToBeClickable(POPUP_DELETE_PRODUCT));
   //    WebElement popDeleteProductBtn = driver.findElement(POPUP_DELETE_PRODUCT);
   //    popDeleteProductBtn.click();


   //    LOGGER.info("Compare Invoice name from the ADD INVOICE PAGE and EDIT INVOICE PAGE");
   //    Assertions.assertEquals(addInvoicePageInvoiceName, editInvoicePageInvoiceName, "Wrong invoice name!");
   //    LOGGER.info("Compare Invoice Total price from the ADD INVOICE PAGE and EDIT INVOICE PAGE");
   //    Assertions.assertEquals(addInvoicePageTotalPrice, editInvoicePageTotalPrice, "Wrong total price!");
    }

  //    @AfterEach
  //    public void closeBrowser() {

  //    driver.close();
  //
}

//  .//*[contains(@name, 'username')]
//private final By ADD_INVOICE_PAGE_INVOICE_SECTION = By.xpath(".//li[@class = 's-padding-right--xs active']/a/span[2]");
//private final By INVOICE_POPUP_LEAVE_BTN = By.xpath(".//div[contains(@class, 'ui-dialog')]/footer/a[2]");
//private final By EDIT_INV_INV_NAME = By.xpath(".//div[@class = 'formRow']/label/input[@value = 'Automation testing invoice']");

//-----Add invoice page--------
//String addInvoicePageTotalPriceString = driver.findElement(ADD_INVOICE_PAGE_TOTAL_PRICE).getText();
//int addInvoicePageTotalPrice = Integer.parseInt(addInvoicePageTotalPriceString);


//wait.until(ExpectedConditions.presenceOfElementLocated(INVOICE_POPUP_LEAVE_BTN));
//WebElement invoicePageLeaveBtn = driver.findElement(INVOICE_POPUP_LEAVE_BTN);
//wait.until(ExpectedConditions.elementToBeClickable(INVOICE_POPUP_LEAVE_BTN));
//invoicePageLeaveBtn.click();


//wait.until(ExpectedConditions.presenceOfElementLocated(INVOICE_SECTION));
//WebElement editInvoicePageInvoiceSection = driver.findElement(INVOICE_SECTION);
//editInvoicePageInvoiceSection.click();