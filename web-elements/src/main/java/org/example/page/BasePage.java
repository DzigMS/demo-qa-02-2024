package org.example.page;

import org.example.config.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public abstract void openPage();

    protected void openPage(String path) {
        driver.get(ConfigProvider.getBaseUrl() + path);
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
