package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends BasePage{

    /**
     * Region Variables
     */

    @FindBy(xpath="//a[contains (text(),'Edit your account information') ]")
    private WebElement editYourAccountBtn;

    @FindBy(xpath="//a[contains (text(),'Subscribe / unsubscribe to newsletter') ]")
    private WebElement subNewsletterBtn;

    @FindBy(xpath="//a[contains (text(),'View your order history') ]")
    private WebElement orderHistoryBtn;

    @FindBy(xpath="//a[contains (text(),'Modify your wish list') ]")
    private WebElement wishListBtn;

    /**
     * Region Constructor
     */
    public YourAccountPage(){
        super(driver);
    }

    /**
     * Region Methods
     */

    public void accessAccountEditionPage (){
        waitNclick(editYourAccountBtn);
    }

    public void accessNewsletterPage(){
        waitNclick(subNewsletterBtn);
    }

    public void accessOrderHistoryPage (){
        waitNclick(orderHistoryBtn);
    }

    public void accessWishlistPage(){
        waitNclick(wishListBtn);
    }

}
