package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NestedIframe_Page extends BasePage {
    @FindBy(xpath = "(//iframe[@id='courses-iframe'])[2]")
    private WebElement nestedIframe;

    @FindBy(css = "h1")
    private WebElement header;

    public void switchToIframe(){
        DRIVER.switchTo().frame(nestedIframe);
    }

    public String getHeaderText(){
        switchToIframe();
        return header.getText();
    }

}
