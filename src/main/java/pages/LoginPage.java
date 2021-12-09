package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    /**
     * Region Variables
     **/
    @FindBy(xpath="//input[@name='email']")
    private WebElement emailTxtBox;

    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordTxtBox;

    @FindBy(xpath="//input [@type='submit']")
    private WebElement loginBtn;

    /**
     * Region Constructor
     **/
    public LoginPage(){
        super(driver);
    }

    /**
     * Region Methods
     **/

    public void writeEmail (String text){
        eraseNwrite(emailTxtBox,text);
    }

    public void writePassword (String text){
        eraseNwrite(passwordTxtBox, text);
    }

    public void clickLogin (){
        waitNclick(loginBtn);
    }

}
