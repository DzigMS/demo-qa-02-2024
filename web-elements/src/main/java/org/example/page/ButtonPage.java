package org.example.page;

import org.example.selectors.ButtonPageProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonPage extends BasePage {

    @FindBy(id = ButtonPageProperty.DOUBLE_CLICK_BUTTON)
    private WebElement doubleClickButton;
    @FindBy(id = ButtonPageProperty.RIGHT_CLICK_BUTTON)
    private WebElement rightClickButton;
    @FindBy(id = ButtonPageProperty.CLICK_ME_BUTTON)
    private WebElement clickMeButton;

    @FindBy(id = ButtonPageProperty.DOUBLE_CLICK_MESSAGE)
    private WebElement doubleClickMessage;
    @FindBy(id = ButtonPageProperty.RIGHT_CLICK_MESSAGE)
    private WebElement rightClickMessage;
    @FindBy(id = ButtonPageProperty.CLICK_ME_MESSAGE)
    private WebElement clickMeMessage;

    public ButtonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        openPage(ButtonPageProperty.PATH);
    }

    public void doubleClickDoubleClickButton() {
        doubleClickButton.click();
        doubleClickButton.click();
    }

    public void rightClickRightClickButton() {
        Actions action = new Actions(getDriver());
        action.contextClick(rightClickButton);
    }

    public String getDoubleClickMessage() {
        return doubleClickMessage.getText();
    }

    public String getClickMeMessage() {
        return clickMeMessage.getText();
    }

    public String getRightClickMessage() {
        return rightClickMessage.getText();
    }
}
