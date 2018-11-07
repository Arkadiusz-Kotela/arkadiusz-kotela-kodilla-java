package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrudAppTestingApp {
    public static final String XPATH_INPUT = "/html/body/main/section/form/fieldset/input";
    public static final String XPATH_TEXTAREA = "/html/body/main/section/form/fieldset/textarea";
    public static final String XPATH_BUTTON = "/html/body/main/section[1]/form/fieldset[3]/button";
    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://arkadiusz-kotela.github.io");

        WebElement searchFiled = driver.findElement(By.xpath(XPATH_INPUT));
        searchFiled.sendKeys("New Robotic Task");

        WebElement textFieldSearch = driver.findElement(By.xpath(XPATH_TEXTAREA));
        textFieldSearch.sendKeys("The robotic content");

        WebElement submitField = driver.findElement(By.xpath(XPATH_BUTTON));
        submitField.submit();

    }
}
