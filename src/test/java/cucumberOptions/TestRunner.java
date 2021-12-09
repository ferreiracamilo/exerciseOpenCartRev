package cucumberOptions;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue="stepDefinitions",
        publish = true,
        // For setting permanent reporting with cucumber io reports. Place into environment variables from IntelliJ idea Run/Debug dropdown toolbar
        // CUCUMBER_PUBLISH_TOKEN=53ed0120-6fa2-4607-b489-e68ccd07ad54
        //And run through the toolbar
        tags="@do" //In order to specify which scenario to be executed meantime are tested to check out if everything is working out
)

public class TestRunner {

    //If @do tags from .feature are executed from TestRunner, driver will be closed after ending scenario. It's been tested within step definitions to use @After but doesn't work properly

    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }


}
