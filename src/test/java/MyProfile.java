import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfile extends PageObject {


    @FindBy(xpath = "//*[@id=\"tab1\"]")
    private WebElement timeLineTab;





    public MyProfile(WebDriver driver) {
        super(driver);
    }
    public void findTimeLineTab() {
        this.timeLineTab.isDisplayed();
    }






}



