package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    /**
     * Region Variables
     **/

    //Even though is possible to reach element without starting from the header element, this is done in order to list only elements containing 'Your Store' within header level based on a requirement from exercise
    @FindBy(xpath="//header //a[contains (text(),'Your Store') ]")
    private List<WebElement> listYourStoreAtHeader;

    @FindBy(xpath="//nav[@id='top'] //a[@title='My Account']")
    private WebElement myAccountBtn;

    @FindBy(xpath="//a[contains (text(),'Register')]")
    private WebElement registerBtn;

    @FindBy(xpath="//a[contains (text(),'Login')]")
    private WebElement loginBtn;

    /**
     * Region Constructor
     **/

    public HomePage(){
        super(driver);
    }

    /**
     * Region Methods
     **/

    public void clickMyAccountBtn (){
        waitNclick(myAccountBtn);
    }

    public void clickRegisterBtn (){
        waitNclick(registerBtn);
    }

    public void clickLoginBtn () {
        waitNclick(loginBtn);
    }

    /**
     * Method which will be applied to get quantity of elements present in the header's dom based on its inner text regardless its type/tag
     * @param text Provide the inner text from webelement
     * @return int Number of element matching condition in the dom
     */
    public int qtyElementsFoundByInnerTextAtHeader (String text){
        String initialXpath = "//header //*[contains (text(),'$Text') ]";
        return driver.findElements(By.xpath(initialXpath.replace("$Text",text))).size();
    }

}
