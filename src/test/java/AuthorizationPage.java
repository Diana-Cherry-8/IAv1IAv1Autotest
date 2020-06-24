import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationPage extends PageObject {

    private final String EMAIL = "yrxqbdep@10mail.org";
    private final String PASSWORD = "123456dsa";


    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[1]/input")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[2]/input")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[3]/button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[3]/a")
    private WebElement registrationBtnOnAuthPage;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/a/span")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/button[1]")
    private WebElement facebookButton;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/button[2]")
    private WebElement googleButton;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[2]/a")
    private WebElement termsOfUseLink;

    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div/div[2]/div/div[2]/div/button")
    private WebElement yourBrokerButtonInModalWindow;



    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }
    public void findEmailInput(){
        this.emailInput.isDisplayed();
    }
    public void findPasswordInput(){
        this.passwordInput.isDisplayed();
    }
    public void findLoginButton(){
        this.loginButton.isDisplayed();
    }
    public void findRegistrationButton(){
        this.registrationBtnOnAuthPage.isDisplayed();
    }
    public void findFacebookButton(){
        this.facebookButton.isDisplayed();
    }
    public void findGoogleButton(){
        this.googleButton.isDisplayed();
    }
    public void findForgotPasswordLink(){
        this.forgotPasswordLink.isDisplayed();
    }
    public void findTermsLink(){
        this.termsOfUseLink.isDisplayed();
    }
    public void verifyFacebookButton() {
        this.facebookButton.isDisplayed();
    }

    public void enterEmail() {
        this.emailInput.sendKeys(EMAIL);
    }
    public void enterPassword() {
        this.passwordInput.sendKeys(PASSWORD);
    }
    public void pressLogInButton() {
        this.loginButton.click();
    }
    public void verifyYourBrokerButtonInModalWindow() {
        this.yourBrokerButtonInModalWindow.isDisplayed();
    }
    public void pressRegistrationButton() {
        this.registrationBtnOnAuthPage.click();
    }






}

