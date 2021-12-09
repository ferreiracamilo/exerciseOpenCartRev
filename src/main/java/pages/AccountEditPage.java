package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountEditPage extends BasePage{

    /**
     * Region Variables
     */
    @FindBy(xpath="//input [@name='firstname']")
    private WebElement firstNameTxtBox;

    @FindBy(xpath="//input [@name='lastname']")
    private WebElement lastNameTxtBox;

    @FindBy(xpath="//input [@name='email']")
    private WebElement emailTxtBox;

    @FindBy(xpath="//input [@name='telephone']")
    private WebElement phoneTxtBox;

    @FindBy(xpath="//input [@value='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath="//input[@name='email'] /following-sibling::div[@class='text-danger']")
    private WebElement emailError;

    /**
     * Region Constructor
     */
    public AccountEditPage(){
        super(driver);
    }

    /**
     * Region Methods
     */
    public void writeFirstName (String text){
        eraseNwrite(firstNameTxtBox, text);
    }

    public void writeLastName (String text){
        eraseNwrite(lastNameTxtBox,text);
    }

    public void writeEmail (String text){
        eraseNwrite(emailTxtBox,text);
    }

    public void writePhone (String text){
        eraseNwrite(phoneTxtBox,text);
    }

    public void clickContinue(){
        waitNclick(continueBtn);
    }

    public String getEmailErrorMessageFieldLevel (){
        return emailError.getText();
    }

    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }

    public String getJsAlertText()
    {
        Object txt = ((JavascriptExecutor)driver).executeScript("return window.alert.myAlertText;");
        return (String)txt;
    }

    public String getCurrentEmailInput(){
        return emailTxtBox.getText();
    }

}
