import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MtsByTests {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("http://mts.by");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testEmptyFieldLabels() {
        // Проверка надписей в незаполненных полях для каждого варианта оплаты услуг
        String[][] fieldData = {
                {"//*[@id=\"connection-phone\"]", "Номер телефона"},
                {"//*[@id=\"connection-sum\"]", "Сумма"},
                {"//*[@id=\"connection-email\"]", "E-mail для отправки чека"},
                {"//*[@id=\"internet-phone\"]", "Номер абонента"},
                {"//*[@id=\"internet-sum\"]", "Сумма"},
                {"//*[@id=\"internet-email\"]", "E-mail для отправки чека"},
                {"//*[@id=\"score-instalment\"]", "Номер счета на 44"},
                {"//*[@id=\"instalment-sum\"]", "Сумма"},
                {"//*[@id=\"instalment-email\"]", "E-mail для отправки чека"},
                {"//*[@id=\"score-arrears\"]", "Номер счета на 2073"},
                {"//*[@id=\"arrears-sum\"]", "Сумма"},
                {"//*[@id=\"arrears-email\"]", "E-mail для отправки чека"}
        };

        for (String[] data : fieldData) {
            WebElement field = driver.findElement(By.xpath(data[0]));
            String placeholder = field.getAttribute("placeholder");
            assertEquals(data[1], placeholder, "Placeholder text is not correct for field: " + data[0]);
        }
    }

    @Test
    public void testContinueButtonFunctionality() throws InterruptedException {
        // Заполнение полей и проверка работы кнопки «Продолжить» для варианта «Услуги связи»
        WebElement phoneNumberField = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        phoneNumberField.sendKeys("297777777");

        WebElement amountField = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        amountField.sendKeys("10");

        Thread.sleep(10000);
//*[@id="cookie-agree"]
        element = driver.findElement(By.id("pay-connection"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pay-connection\"]/button")));
        element.click();}}

//        // Пример проверки успешного перехода и отображения результатов
//        WebElement confirmationElement = driver.findElement(By.id(""));
//        assertTrue(confirmationElement.isDisplayed(), "Confirmation element is not displayed");
//
//        // Проверка корректности отображения данных
//        WebElement phoneField = driver.findElement(By.xpath(""));
//        assertEquals("297777777", phoneField.getText().trim(), "Phone number is not correct");
//
//        WebElement amountFieldConfirmation = driver.findElement(By.xpath(""));
//        assertEquals("10", amountFieldConfirmation.getText().trim(), "Amount is not correct");
//
//        WebElement cardNumberField = driver.findElement(By.xpath(""));
//        assertTrue(cardNumberField.getAttribute("placeholder").contains("Номер карты"), "Card number placeholder text is not correct");
//
//        WebElement expiryDateField = driver.findElement(By.xpath(""));
//        assertTrue(expiryDateField.getAttribute("placeholder").contains("Срок действия"), "Expiry date placeholder text is not correct");
//
//        WebElement cvvField = driver.findElement(By.xpath(""));
//        assertTrue(cvvField.getAttribute("placeholder").contains("CVV"), "CVV placeholder text is not correct");
//
//        WebElement paymentSystemLogos = driver.findElement(By.xpath(""));
//        List<WebElement> logos = paymentSystemLogos.findElements(By.tagName("img"));
//        assertFalse(logos.isEmpty(), "No payment system logos found on confirmation page");
//        for (WebElement logo : logos) {
//            assertTrue(logo.isDisplayed(), "Payment system logo on confirmation page is not displayed");
//        }
//    }
//}

////*[@id="cookie-agree"]