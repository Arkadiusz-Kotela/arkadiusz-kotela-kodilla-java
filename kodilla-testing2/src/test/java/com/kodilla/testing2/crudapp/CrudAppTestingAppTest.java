package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CrudAppTestingAppTest {
    private static final String BASE_URL = "https://arkadiusz-kotela.github.io";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUp() {
        driver.close();
    }

    public String createCrudAppTestTask() throws InterruptedException {
        driver.manage().window().maximize();
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_DESCRIPTION = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";

        String taskName = "Task number " + generator.nextInt(100000);
        String taskDescroption = taskName + " content";

        driver.findElement(By.xpath(XPATH_TASK_NAME)).sendKeys(taskName);
        driver.findElement(By.xpath(XPATH_TASK_DESCRIPTION)).sendKeys(taskDescroption);
        driver.findElement(By.xpath(XPATH_ADD_BUTTON)).submit();

        Thread.sleep(2000);

        return taskName;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        deleteTestTask(taskName);
    }


    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[(@class=\"datatable__field-value\")]"))
                        .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]")).click();

                });

        Thread.sleep(20000);
    }

    private void deleteTestTask(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        Thread.sleep(1000);

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[(@class=\"datatable__field-value\")]"))
                        .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement deleteBtn = driver.findElement(By.xpath(".//button[4]"));
                    deleteBtn.sendKeys(Keys.ENTER);
                });
        Thread.sleep(10000);
    }

}

