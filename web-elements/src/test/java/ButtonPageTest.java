import org.example.page.ButtonPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ButtonPageTest extends BaseTest {

    @Test
    public void doubleClickButtonTest() {
        String expectedMessage = "You have done a double click";

        ButtonPage bp = new ButtonPage(driver);
        bp.openPage();
        bp.doubleClickDoubleClickButton();
        String actual = bp.getDoubleClickMessage();

        Assertions.assertEquals(expectedMessage, actual);
    }

    @Test
    public void rightClickButtonTest() {
        String expectedMessage = "You have done a right click";

        ButtonPage bp = new ButtonPage(driver);
        bp.openPage();
        bp.rightClickRightClickButton();
        String actual = bp.getRightClickMessage();

        Assertions.assertEquals(expectedMessage, actual);
    }
}
