package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegistrationPage extends BasePage{

    /**
     * Region Variables
     */

    //On this case since it'll be reviewed if there's an error notification within any of the fields from registration form, is only assured belongs to one of the fields
    @FindBy(xpath="//input /following-sibling::div[@class='text-danger']")
    private List<WebElement> getErrorFields;

    @FindBy(xpath="//input [@name='agree']")
    private WebElement agreeCheck;

    @FindBy(xpath="//input [@name='firstname']")
    private WebElement firstNameTxtBox;

    @FindBy(xpath="//input [@name='lastname']")
    private WebElement lastNameTxtBox;

    @FindBy(xpath="//input [@name='email']")
    private WebElement emailTxtBox;

    @FindBy(xpath="//input [@name='telephone']")
    private WebElement phoneTxtBox;

    @FindBy(xpath="//input [@name='password']")
    private WebElement passTxtBox;

    @FindBy(xpath="//input [@name='confirm']")
    private WebElement confPassTxtBox;

    @FindBy(xpath="//input [@type='submit']")
    private WebElement continueBtn;

    @FindBy(xpath="//input[@name='email'] /following-sibling::div[@class='text-danger']")
    private WebElement emailError;

    @FindBy(xpath="//input[@name='confirm'] /following-sibling::div[@class='text-danger']")
    private WebElement passwordError;

    /**
     * Region Constructor
     */
    public RegistrationPage() {
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

    public void writePassword (String text){
        eraseNwrite(passTxtBox,text);
    }

    public void writeConfPassword (String text){
        eraseNwrite(confPassTxtBox,text);
    }

    public void clickOnAgreeCheck(){
        waitNclick(agreeCheck);
    }

    public int getQtyErrors (){
        return getErrorFields.size();
    }

    public void clickContinue () {
        waitNclick(continueBtn);
    }

    public String getEmailErrorMessageFieldLevel (){
        return emailError.getText();
    }

    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }

    public String getCurrentEmailInput(){
        return emailTxtBox.getText();
    }

    public String getPasswordNoMatchMessageFieldLevel(){
        return passwordError.getText();
    }

}
