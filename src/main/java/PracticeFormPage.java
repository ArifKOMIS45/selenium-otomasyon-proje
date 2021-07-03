import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage extends BasePage {

    private final By nameLocater = By.id("firstName");
    private final By lastNameLocater = By.id("lastName");
    private final By emailLocater = By.id("userEmail");

    private final GenderSection genderSection;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/automation-practice-form");
        genderSection = new GenderSection(driver);
    }

    public GenderSection genderSection() {
        return genderSection;
    }

    public void setLastName(String lastName) {
        type(lastNameLocater, lastName);
    }

    public String getName() {
        return find(nameLocater).getAttribute("value");
    }

    public void setName(String name) {
        type(nameLocater, name);
    }

    public String getlastName() {
        return find(lastNameLocater).getAttribute("value");
    }

    public String getEmail() {
        return find(emailLocater).getAttribute("value");
    }

    public void setEmail(String mailAddress) {
        type(emailLocater, mailAddress);
    }


}
