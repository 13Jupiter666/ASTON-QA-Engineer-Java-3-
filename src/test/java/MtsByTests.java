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
    public void testBlockTitle() {
        // Проверка названия блока «Онлайн пополнение без комиссии»
        WebElement blockTitle = driver.findElement(By.xpath("//h2[text()='Онлайн пополнение без комиссии']"));
        assertEquals("Онлайн пополнение без комиссии", blockTitle.getText());
    }

    @Test
    public void testPaymentSystemLogos() {
        // Проверка наличия логотипов платёжных систем
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='payment-systems']//img"));
        assertTrue(logos.size() > 0, "No payment system logos found");
        for (WebElement logo : logos) {
            assertTrue(logo.isDisplayed(), "Payment system logo is not displayed");
        }
    }

    @Test
    public void testMoreInfoLink() {
        // Проверка работы ссылки «Подробнее о сервисе»
        WebElement moreInfoLink = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        moreInfoLink.click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("info"), "More info link did not navigate correctly");
    }

    @Test
    public void testContinueButtonFunctionality() {
        // Заполнение полей и проверка работы кнопки «Продолжить» для варианта «Услуги связи»
        WebElement servicesDropdown = driver.findElement(By.id("services"));
        servicesDropdown.click();
        WebElement serviceOption = driver.findElement(By.xpath("//option[@value='Услуги связи']"));
        serviceOption.click();

        WebElement phoneNumberField = driver.findElement(By.id("phone-number"));
        phoneNumberField.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Проверка успешного перехода и отображения результатов
        WebElement confirmationElement = driver.findElement(By.id("confirmation"));
        assertTrue(confirmationElement.isDisplayed(), "Confirmation element is not displayed");

        // Проверка корректности отображения данных
        // Примеры проверок текста на кнопке, номера телефона и т.д.

        // Пример проверки текста на кнопке
        WebElement amountButton = driver.findElement(By.xpath("//button[@id='amount-button-id']"));
        assertEquals("Expected Text", amountButton.getText(), "Text is not correct");}}
