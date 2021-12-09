package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterPage extends BasePage{

    /**
     * Region Variables
     */

    //Xpath will search for an type radio element without the property checked
    @FindBy(xpath="//input [@type='radio' and not(@checked)]")
    private WebElement uncheckRButton;

    @FindBy(xpath="//input [@type='submit']")
    private WebElement continueBtn;

    /**
     * Region Constructor
     */
    public NewsletterPage(){
        super(driver);
    }

    /**
     * Region Methods
     */

    public void clickUncheckRadioBtn(){
        waitNclick(uncheckRButton);
    }

    public void clickContinueBtn (){
        waitNclick(continueBtn);
    }

}
