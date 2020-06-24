import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends PageObject{

    private final String FIRST_NAME = "First";
    private final String EMAIL = "wykitgbw123450000@yomail.info";
    private final String PHONE_NUMBER = "989898909";
    private final String PASSWORD = "123456dsa";

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[3]/a")
    private WebElement registrationBtnOnAuthPage;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/form/div[1]/input")
    private WebElement first_name;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/form/div[2]/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/form/div[3]/div[2]/input")
    private WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/form/div[4]/input")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/form/div[5]/input")
    private WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/form/div[6]/div/input")
    private WebElement checkbox;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/form/button")
    private WebElement registrationButton;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[2]")
    private WebElement message;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/form/a")
    private WebElement logInButtonOnRegistrationTest;

    @FindBy(xpath = "//*[@id=\"react-view\"]/div/div[1]/div/div/div[2]/div/div[2]/a")
    private WebElement termsOfUseLink;


    // @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    //private WebElement alertSuccess;

    public Registration(WebDriver driver) {
        super(driver);
    }

    public void pressRegistrationBtnOnAuthPage(){
        this.registrationBtnOnAuthPage.click();
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterEmail(){
        this.email.sendKeys(EMAIL);
    }
    public void enterPhoneNumber(){
        this.phoneNumber.sendKeys(PHONE_NUMBER);
    }
    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }
    public void enterConfirmPassword(){
        this.confirmPassword.sendKeys(PASSWORD);
    }

    public void pressCheckbox(){
        this.checkbox.click();
    }

    public void pressRegistrationButton(){
        this.registrationButton.click();
    }

    public void verifyAlertSuccess(){
        this.message.isDisplayed();
    }
    public void pressLogInButtonOnRegistrationPage() {
        this.logInButtonOnRegistrationTest.click();
    }

    //test find elements on the registration page
    public void findFirstNameInput() {
        this.first_name.isDisplayed();
    }
    public void findEmailInput() {
        this.email.isDisplayed();
    }
    public void findPhoneNumberInput() {
        this.phoneNumber.isDisplayed();
    }
    public void findPasswordInput() {
        this.password.isDisplayed();
    }
    public void findConfirmPasswordInput() {
        this.confirmPassword.isDisplayed();
    }
    public void findCheckbox() {
        this.checkbox.isDisplayed();
    }
    public void findRegistrationButton() {
        this.registrationButton.isDisplayed();
    }
    public void findLogInButton() {
        this.logInButtonOnRegistrationTest.isDisplayed();
    }
    public void findTermsLink() {
        this.termsOfUseLink.isDisplayed();
    }

}
