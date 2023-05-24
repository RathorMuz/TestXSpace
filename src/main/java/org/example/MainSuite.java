package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.example.DriverSetup.driver;

public class MainSuite {

        DriverSetup t2 = new DriverSetup();
        @BeforeTest
        public void driverInitialize () throws InterruptedException
        {
            t2.driverinitials();
        }
        @Test(priority = 1, enabled = false)
        public void clickCustomerCenterIcon () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.clickCustomerCenterIcon(driver);

        }
        @Test(priority = 2, enabled = false)
        public void BuyerSelection () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.BuyerSelection(driver);
        }
        @Test(priority = 3, enabled = false)
        public void SelectBuyer () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.SelectBuyer(driver);
        }
        @Test(priority = 4, enabled = false)
        public void SearchByEmail () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.SearchByEmail(driver);
        }
        @Test(priority = 5, enabled = false)
        public void SearchbyPhoneNumber () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.SearchbyPhoneNumber(driver);
        }
        @Test(priority = 6, enabled = false)
        public void SearchbyUserID () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.SearchbyUserID(driver);
        }
        @Test(priority = 7, enabled = false)
        public void SearchbyOrderID () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.SearchbyOrderID(driver);
        }
        @Test(priority = 8, enabled = false)
        public void SearchbyItemID () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.SearchbyItemID(driver);
        }
        @Test(priority = 9, enabled = false)
        public void SearchSOP () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.SearchSOP(driver);
        }
        @Test(priority = 10, enabled = false)
        public void SearchVoucher () throws InterruptedException {
            OpenCustomerCenter occ = new OpenCustomerCenter(driver);
            occ.SearchVoucher(driver);
        }
        @Test(priority = 11)
        public void clickCaseCenterIcon () throws InterruptedException {
            CaseCenter cc = new CaseCenter(driver);
            cc.clickCaseCenterIcon(driver);
        }
        @Test(priority = 12, enabled = false)
        public void C360DarazPluginData () {
            C360BuyerPlugin bp = new C360BuyerPlugin(driver);
            bp.C360DarazPluginData(driver);
        }


}
