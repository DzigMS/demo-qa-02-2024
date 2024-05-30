package org.example.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ConfigProvider {
    private static final Properties properties = initProperties();

    private static Properties initProperties() {
        Properties property = new Properties();
        try {
            property.load(ClassLoader.getSystemResourceAsStream("config.properties"));
        } catch (IOException e) {
            throw new RuntimeException("File config not found");
        }
        return property;
    }

    public static WebDriver getDriver() {
        String driverName = properties.getProperty("browser");

        WebDriver driver =
                switch (driverName) {
            case "chrome" -> new ChromeDriver();
            case "safari" -> new SafariDriver();
            default -> throw new RuntimeException("Undefined web driver");
        };

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(properties.getProperty("implicitly.wait"))));
        Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
        return driver;
    }
}
