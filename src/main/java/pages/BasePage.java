package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    /**
    * Region Variables
    **/
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_win.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicit wait
        wait = new WebDriverWait(driver,10); //explicit wait greather than the implicit since will be applied for specific elements if necessary
    }

    /**
     * Region Constructor
     */
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
    }

    /**
     * Region Methods
     */

    public static void navigateToOpenCartWeb(){
        driver.get("https://demo.opencart.com/");
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public static String getBrowserURL(){
        return driver.getCurrentUrl();
    }

    /**
     * Given a webelement which accept input text: 1) Erase any text that could be present within 2) Insert new text from argument
     * @param textbox Text box webelement
     * @param newText Argument text to write in text box element
     */
    protected void eraseNwrite (WebElement textbox, String newText){
        if(!newText.equalsIgnoreCase("voidval")){
            // textbox.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));
            textbox.clear();
            textbox.sendKeys(newText);
        }
    }

    /**
     * Given a clickable webelement: 1) Wait element to be clickable 2) Click on element
     * @param ele Webelement to be clicked
     */
    protected void waitNclick (WebElement ele){
        //this.wait.until(ExpectedConditions.elementToBeClickable(ele)); //Explicit wait applied until is verified that element is clickable
        ele.click();
    }

    /**
     * Method which will be applied to get quantity of elements present in the dom based on its inner text regardless its type/tag
     * @param text Provide the inner text from webelement
     * @return int Number of element matching condition in the dom
     */
    public int qtyElementsFoundByInnerText (String text){
        String initialXpath = "//*[contains (text(),'$Text') ]";
        return driver.findElements(By.xpath(initialXpath.replace("$Text",text))).size();
    }
}
