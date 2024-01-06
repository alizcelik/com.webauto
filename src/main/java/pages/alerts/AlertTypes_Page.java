package pages.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AlertTypes_Page extends BasePage {
    @FindBy(xpath = "//button[text()='Show Alert']")
    private WebElement showAlertButton;

    @FindBy(xpath = "//button[text()='Show Confirm']")
    private WebElement showConfirmButton;

    @FindBy(xpath = "//button[text()='Show Prompt']")
    private WebElement showPromptButton;

    Alert alert;

    public void switchToAlert(){
        alert = DRIVER.switchTo().alert();
    }

    public String getTextInAlert(){
        switchToAlert();
        return alert.getText();
    }

    public void confirmAlert(){
        switchToAlert();
        alert.accept();
    }

    public void dismissAlert(){
        switchToAlert();
        alert.dismiss();
    }

    public void enterInputIntoAlert(String input){
        switchToAlert();
        alert.sendKeys(input);
    }

    public void clickOnShowAlertButton(){
        showAlertButton.click();
    }
}
