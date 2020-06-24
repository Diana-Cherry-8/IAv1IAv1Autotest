import com.thoughtworks.qdox.model.expression.Equals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class MainPage extends PageObject {
    private final String NEW_NICKNAME = "SuperRock";
    private final String WRONG_NEW_NICKNAME = "SuperR";


    //Left sidebars
    @FindBy(id = "st-sidebar-news-feed")
    private WebElement newsFeedTab;

    @FindBy(id = "st-sidebar-privacy")
    private WebElement privacyTab;

    @FindBy(id = "st-sidebar-view-mode")
    private WebElement preferencesTab;

    @FindBy(id = "st-sidebar-financial-calendar")
    private WebElement economicCalendarTab;

    @FindBy(id = "st-sidebar-assets")
    private WebElement instrumentsTab;

    @FindBy(id = "deals")
    private WebElement dealsTab;

    @FindBy(id = "st-sidebar-item")
    private WebElement investmentListTab;

    @FindBy(id = "st-sidebar-item")
    private WebElement chatTab;

    @FindBy(id = "st-sidebar-item")
    private WebElement groupsTab;

    @FindBy(id = "st-sidebar-item")
    private WebElement companiesTab;

    @FindBy(id = "st-sidebar-item")
    private WebElement bookmarksTab;

    @FindBy(id = "st-sidebar-item")
    private WebElement inviteFriendsTab;

    @FindBy(id = "st-sidebar-item")
    private WebElement feedbackTab;


    //modal window Privacy
    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div/div[2]/button")
    private WebElement saveButtonInThePrivacyModalWindow;

    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div/div[2]/div[2]/input")
    private WebElement fieldForEnteringNewNickName;

    //Хедер
    @FindBy(id = "header-avatar")
    private WebElement myProfileButtonInHeader;

    @FindBy(xpath = "//*[@id=\"notifications\"]/img")
    private WebElement notificationButton;

    @FindBy(xpath = "//*[@id=\"notification\"]/div/div/div[2]/div/div/div/div[1]/div[1]/img")
    private WebElement pictureNotificationForExample;

    @FindBy(id = "//*[@id=\"broker\"]/div/a/img")
    private WebElement brokerButtonInHeader;

    //modal window broker settings
    @FindBy(id = "/html/body/div[4]/div/div[1]/div/div/div[2]/div/div[2]/div/form/button")
    private WebElement signUpButtonInBrokerSettingModalWindow;



    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void findNewsFeedTab() {
        this.newsFeedTab.isDisplayed();
    }
    public void findPrivacyTab() {
        this.privacyTab.isDisplayed();
    }
    public void findPreferencesTab() {
        this.preferencesTab.isDisplayed();
    }
    public void findEconomicCalendarTab() {
        this.economicCalendarTab.isDisplayed();
    }
    public void findInstrumentsTab() {
        this.instrumentsTab.isDisplayed();
    }
    public void findDealsTab() {
        this.dealsTab.isDisplayed();
    }
    public void findInvestmentListTab() {
        this.investmentListTab.isDisplayed();
    }
    public void findChatTab() {
        this.chatTab.isDisplayed();
    }
    public void findGroupTab() {
        this.groupsTab.isDisplayed();
    }
    public void findCompaniesTab() {
        this.companiesTab.isDisplayed();
    }
    public void findBookmarksTab() {
        this.bookmarksTab.isDisplayed();
    }
    public void findInviteFriendsTab() {
        this.inviteFriendsTab.isDisplayed();
    }
    public void findFeedbackTab() {
        this.feedbackTab.isDisplayed();
    }
    public void pressPrivacyTab() {
        this.privacyTab.click();
    }
    public void verifySaveButtonInThePrivacyModalWindow() {
        this.saveButtonInThePrivacyModalWindow.isDisplayed();
    }
    public void enterNewNicknameInPrivacyModalWindow() {
        this.fieldForEnteringNewNickName.sendKeys(NEW_NICKNAME);
    }
    public void pressSaveButtonInThePrivacyModalWindow() {
        this.saveButtonInThePrivacyModalWindow.click();
    }
    public void clearFieldForEnteringNewNickname() {
        this.fieldForEnteringNewNickName.clear();
    }
    public void compareNicknameInTheFieldForEnteringNewNickname() {
        String actualResult = this.fieldForEnteringNewNickName.getAttribute("value");
        assertEquals ("Done", NEW_NICKNAME, actualResult);
    }
    public void pressMyProfileButtonInHeader() {
        this.myProfileButtonInHeader.click();
    }
    public void pressNotificationButtonInHeader() {
        this.notificationButton.click();
    }
    public void findPictureNotificationForExample() {
        this.pictureNotificationForExample.isDisplayed();
    }
    public void pressBrokerButtonInHeader() {
        this.brokerButtonInHeader.click();
    }
    public void findSignUpButtonInBrokerSettingsModalWindow() {
        this.signUpButtonInBrokerSettingModalWindow.isDisplayed();
    }











}


