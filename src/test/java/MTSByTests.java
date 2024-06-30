import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTSByTests {

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
    public void testBlockTitle() {
        WebElement blockTitle = driver.findElement(By.xpath("//h2[text()='Онлайн пополнение без комиссии']"));
        assertEquals("Онлайн пополнение без комиссии", blockTitle.getText());
    }

    @Test
    public void testPaymentSystemLogos() {
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='payment-systems']//img"));
        assertTrue(logos.size() > 0, "No payment system logos found");
        for (WebElement logo : logos) {
            assertTrue(logo.isDisplayed(), "Payment system logo is not displayed");
        }
    }

    @Test
    public void testMoreInfoLink() {
        WebElement moreInfoLink = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        moreInfoLink.click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("info"), "More info link did not navigate correctly");
    }

    @Test
    public void testContinueButtonFunctionality() {
        WebElement servicesDropdown = driver.findElement(By.id("services"));
        servicesDropdown.click();
        WebElement serviceOption = driver.findElement(By.xpath("//option[@value='Услуги связи']"));
        serviceOption.click();

        WebElement phoneNumberField = driver.findElement(By.id("phone-number"));
        phoneNumberField.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Проверка на успешное выполнение действия (например, переход на страницу подтверждения)
        WebElement confirmationElement = driver.findElement(By.id("confirmation"));
        assertTrue(confirmationElement.isDisplayed(), "Confirmation element is not displayed");

        // Проверка отображения суммы
        WebElement amountElement = driver.findElement(By.id("amount-id"));
        assertEquals("Expected amount", amountElement.getText(), "Amount text mismatch");

        // Проверка отображения номера телефона
        WebElement phoneNumberElement = driver.findElement(By.id("phone-number-id"));
        assertEquals("297777777", phoneNumberElement.getText(), "Phone number mismatch");

        // Проверка надписи в незаполненных полях для ввода реквизитов карты
        WebElement cardDetailsPlaceholder = driver.findElement(By.id("card-details-id"));
        assertEquals("Введите реквизиты карты", cardDetailsPlaceholder.getAttribute("placeholder"), "Card details placeholder mismatch");

        // Проверка наличия иконок платёжных систем
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='payment-systems']//img"));
        assertTrue(logos.size() > 0, "No payment system logos found in the confirmation window");
        for (WebElement logo : logos) {
            assertTrue(logo.isDisplayed(), "Payment system logo in the confirmation window is not displayed");
        }
    }
}