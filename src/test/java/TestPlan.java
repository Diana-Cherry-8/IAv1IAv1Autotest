import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Registration Submit a WebForm")
    public static void submitForm(){
        driver.get(Utils.BASE_URL);
        Registration registration = new Registration(driver);
        registration.pressRegistrationBtnOnAuthPage();
        registration.enterFirstName();
        registration.enterEmail();
        registration.enterPhoneNumber();
        registration.enterPassword();
        registration.enterConfirmPassword();

        registration.pressCheckbox();
        registration.pressRegistrationButton();
        registration.verifyAlertSuccess();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(testName = "Authorization Page, checking for items")
    public static void authorizationPageFindElements() {
        driver.get(Utils.BASE_URL);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.findEmailInput();
        authorizationPage.findPasswordInput();
        authorizationPage.findLoginButton();
        authorizationPage.findRegistrationButton();
        authorizationPage.findForgotPasswordLink();
        authorizationPage.findFacebookButton();
        authorizationPage.findGoogleButton();
        authorizationPage.findTermsLink();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    //тест не понятный, не переходит на регистрацию, или переходит очень быстро, хз
    @Test(testName = "Click Log in -> come back Auth page")
    public static void returnOnAuthPage() {
        driver.get(Utils.BASE_URL);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.pressRegistrationButton();
        Registration registration = new Registration(driver);
        registration.pressLogInButtonOnRegistrationPage();
        authorizationPage.verifyFacebookButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test(testName = "Registration Page, checking for items")
    public static void registrationPageFindElements() {
        driver.get(Utils.BASE_URL);
        Registration registration = new Registration(driver);
        registration.pressRegistrationBtnOnAuthPage();
        registration.findFirstNameInput();
        registration.findEmailInput();
        registration.findPhoneNumberInput();
        registration.findPasswordInput();
        registration.findConfirmPasswordInput();
        registration.findCheckbox();
        registration.findRegistrationButton();
        registration.findLogInButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test(testName = "Authorization with previously registered data")
    public static void authorization() {
        driver.get(Utils.BASE_URL);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.enterEmail();
        authorizationPage.enterPassword();
        authorizationPage.pressLogInButton();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        authorizationPage.verifyYourBrokerButtonInModalWindow();
    }

    @Test(testName = "Main page, checking for items, checking left sidebar")
    public static void authorizationPlusCheckingLeftSidebar() {
        driver.get(Utils.BASE_URL);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.enterEmail();
        authorizationPage.enterPassword();
        authorizationPage.pressLogInButton();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        mainPage.findNewsFeedTab();
        mainPage.findPrivacyTab();
        mainPage.findPreferencesTab();
        mainPage.findEconomicCalendarTab();
        mainPage.findInstrumentsTab();
        mainPage.findDealsTab();
        mainPage.findInvestmentListTab();
        mainPage.findChatTab();
        mainPage.findGroupTab();
        mainPage.findCompaniesTab();
        mainPage.findBookmarksTab();
        mainPage.findInviteFriendsTab();
        mainPage.findFeedbackTab();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(testName = "Check privacy modal window")
    public static void authorizationPlusOpenPrivacyModalWindow() {
        driver.get(Utils.BASE_URL);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.enterEmail();
        authorizationPage.enterPassword();
        authorizationPage.pressLogInButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        mainPage.pressPrivacyTab();
        mainPage.verifySaveButtonInThePrivacyModalWindow();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(testName = "Change nickname in privacy modal window")
    public static void authorizationPlusChangeNicknameInPrivacyModalWindow() {
        driver.get(Utils.BASE_URL);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.enterEmail();
        authorizationPage.enterPassword();
        authorizationPage.pressLogInButton();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        mainPage.pressPrivacyTab();
        mainPage.clearFieldForEnteringNewNickname();
        mainPage.enterNewNicknameInPrivacyModalWindow();
        mainPage.pressSaveButtonInThePrivacyModalWindow();
        mainPage.pressPrivacyTab();
        mainPage.compareNicknameInTheFieldForEnteringNewNickname();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }
    //Хедер
    @Test(testName = "Check the transition from header to personal account page")
    public static void authorizationPlusCheckTheTransitionFromHeaderToMyProfile() {
        driver.get(Utils.BASE_URL);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.enterEmail();
        authorizationPage.enterPassword();
        authorizationPage.pressLogInButton();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        mainPage.pressMyProfileButtonInHeader();
        MyProfile myProfile = new MyProfile(driver);
        myProfile.findTimeLineTab();
    }

    @Test(testName = "Check the opening notification window")
    public static void authorizationPlusCheckTheOpeningNotificationWindow() {
        driver.get(Utils.BASE_URL);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.enterEmail();
        authorizationPage.enterPassword();
        authorizationPage.pressLogInButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        mainPage.pressNotificationButtonInHeader();
        mainPage.findPictureNotificationForExample();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test(testName = "Check the opening broker settings modal window")
    public static void authorizationPlusCheckTheOpeningBrokerSettingsModalWindow() {
        driver.get(Utils.BASE_URL);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.enterEmail();
        authorizationPage.enterPassword();
        authorizationPage.pressLogInButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        mainPage.pressBrokerButtonInHeader();
        mainPage.findSignUpButtonInBrokerSettingsModalWindow();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}