package invoicetemplate;

import invoicetemplate.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FirstTestDecta {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Test
    public void firstTest() {
        LOGGER.info("This test is creating Invoice template. Checking Invoice Name with Invoice total price on Add Invoice page and Edit Invoice page");

        BaseFunction baseFunction = new BaseFunction();
        baseFunction.openPage("gate.dcdev.dvte.ch/merchants/en/login");


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
        addInvoiceTemplatePage.lookingForInvFieldEntrNameAddPage();
        String addInvoicePageInvoiceName = addInvoiceTemplatePage.getInvoiceNameAddPage();
        addInvoiceTemplatePage.scrollDownAddPage();
        float addInvoicePageTotalPrice = addInvoiceTemplatePage.getInvoiceTotalPriceAddPage();
        addInvoiceTemplatePage.saveBtn();
        addInvoiceTemplatePage.sleepRedirectToInvSection();

        invoicePage.clickOnCreatedInvoice();

        String editInvoicePageInvoiceName = addInvoiceTemplatePage.getInvoiceNameEditPage();
        addInvoiceTemplatePage.scrollDownEditPage();
        float editInvoicePageTotalPrice = addInvoiceTemplatePage.getInvoiceTotalPriceEditPage();
        addInvoiceTemplatePage.lookingForDeleteBtn();

        invoicePage.clickOnProductsSection();

        ProductsPage productsPage = new ProductsPage(baseFunction);
        productsPage.LookingClickEditProduct();

        EditProductPage editProductPage = new EditProductPage(baseFunction);
        editProductPage.LookingDeleteBtnClick();


        LOGGER.info("Compare Invoice name from the ADD INVOICE PAGE and EDIT INVOICE PAGE");
        assertEquals(addInvoicePageInvoiceName, editInvoicePageInvoiceName, "Wrong invoice name!");
        LOGGER.info("Compare Invoice Total price from the ADD INVOICE PAGE and EDIT INVOICE PAGE");
        assertEquals(addInvoicePageTotalPrice, editInvoicePageTotalPrice, "Wrong total price!");
            baseFunction.closeBrowser();
    }
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