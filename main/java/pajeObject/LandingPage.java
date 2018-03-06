package pajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by alexey.reshetnikov on 02.03.2018.
 */
public class LandingPage {
    public WebDriver driver;
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Basic Auth")
    WebElement basicAuth;

    @FindBy(linkText = "Broken Images")
    WebElement brokenImages;

    @FindBy(linkText = "Challenging DOM")
    WebElement challengingDOM;

    @FindBy(linkText = "Checkboxes")
    WebElement checkboxes;

    @FindBy(linkText = "Context Menu")
    WebElement contextMenu;

    @FindBy(linkText = "Disappearing Elements")
    WebElement disappearingElements;

    @FindBy(linkText = "Drag and Drop")
    WebElement dragAndDrop;

    @FindBy(linkText = "Dropdown")
    WebElement dropdown;

    @FindBy(linkText = "Dynamic Content")
    WebElement dynamicContent;

    @FindBy(linkText = "Dynamic Controls")
    WebElement dynamicControls;

    @FindBy(linkText = "Dynamic Loading")
    WebElement dynamicLoading;

    @FindBy(linkText = "Exit Intent")
    WebElement exitIntent;

    @FindBy(linkText = "File Download")
    WebElement fileDownload;

    @FindBy(linkText = "File Upload")
    WebElement uploadFile;

    @FindBy(linkText = "Floating Menu")
    WebElement floatingMenu;

    public WebElement getBasicAuth() {
        return basicAuth;
    }

    public WebElement getBrokenImages() {
        return brokenImages;
    }

    public WebElement getChallengingDOM() {
        return challengingDOM;
    }

    public WebElement getCheckboxes() {
        return checkboxes;
    }

    public WebElement getContextMenu() {
        return contextMenu;
    }

    public WebElement getDisappearingElements() {
        return disappearingElements;
    }

    public WebElement getDragAndDrop() {
        return dragAndDrop;
    }

    public WebElement getDropdown() {
        return dropdown;
    }

    public WebElement getDynamicContent() {
        return dynamicContent;
    }

    public WebElement getDynamicControls() {
        return dynamicControls;
    }

    public WebElement getDynamicLoading() {
        return dynamicLoading;
    }

    public WebElement getExitIntent() {
        return exitIntent;
    }

    public WebElement getFileDownload() {
        return fileDownload;
    }

    public WebElement getUploadFile() {
        return uploadFile;
    }

    public WebElement getFloatingMenu() {
        return floatingMenu;
    }
}
