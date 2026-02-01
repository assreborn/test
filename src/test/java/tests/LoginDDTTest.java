package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ExcelReader;

import java.util.List;

public class LoginDDTTest {

    @Test
    public void loginDataDrivenTest() {
        List<String[]> testData =
                ExcelReader.readExcel("testData/loginData.xlsx");

        for (String[] data : testData) {
            String testCase = data[0];
            String email = data[1];
            String password = data[2];
            String expected = data[3];

            WebDriver driver = new ChromeDriver();
            driver.get("https://thinking-tester-contact-list.herokuapp.com/");

            try {
                driver.findElement(By.id("email")).sendKeys(email);
                driver.findElement(By.id("password")).sendKeys(password);
                driver.findElement(By.id("submit")).click();

                if (expected.equals("SUCCESS")) {
                    boolean loginSuccess =
                            driver.getCurrentUrl().contains("contactList");

                    Assert.assertTrue(loginSuccess);
                } else {
                    boolean errorDisplayed =
                            driver.findElements(By.id("error")).size() > 0;

                    Assert.assertTrue(errorDisplayed);
                }

                System.out.println(testCase + " PASSED");

            } catch (AssertionError e) {
                System.out.println(testCase + " FAILED");

            } finally {
                driver.quit();
            }
        }
    }

}
