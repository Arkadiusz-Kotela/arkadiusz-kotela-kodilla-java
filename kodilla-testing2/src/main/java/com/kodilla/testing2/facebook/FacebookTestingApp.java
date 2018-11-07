package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_BIRTH_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_BIRTH_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_BIRTH_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        Select day = new Select(driver.findElement(By.xpath(XPATH_BIRTH_DAY)));
        day.selectByVisibleText("18");

        Select month = new Select(driver.findElement(By.xpath(XPATH_BIRTH_MONTH)));
        month.selectByVisibleText("Oct");

        Select year = new Select(driver.findElement(By.xpath(XPATH_BIRTH_YEAR)));
        year.selectByVisibleText("1971");
    }
}