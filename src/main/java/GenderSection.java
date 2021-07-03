import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage  {

    private final By maleLabelLocater = By.cssSelector("label[for='gender-radio-1']");
    private final By femaleLabelLocater = By.cssSelector("label[for='gender-radio-2']");
    private final By otherLabelLocater = By.cssSelector("label[for='gender-radio-3']");

    private final By maleRadioButtonLocater = By.id("gender-radio-1");
    private final By femaleRadioButtonLocater = By.id("gender-radio-2");
    private final By otherRadioButtonLocater = By.id("gender-radio-3");


    public GenderSection(WebDriver driver) { super(driver);    }

    public void clickRadioButton(Genders gender) {
        switch (gender) {
            case MALE:
                click(maleLabelLocater);
                break;
            case FEMALE:
                click(femaleLabelLocater);
                break;
            case OTHER:
                click(otherLabelLocater);
                break;
        }


    }

    public boolean isRadioButtonCheck(Genders gender) {
        boolean isChecked = false;
        switch (gender) {
            case MALE:
                isChecked =isSelected(maleRadioButtonLocater);
                break;
            case FEMALE:
                isChecked = isSelected(femaleRadioButtonLocater);
                break;
            case OTHER:
                isChecked = isSelected(otherRadioButtonLocater);
                break;
        }

        return isChecked;
    }


    public enum Genders {MALE, FEMALE, OTHER}

}
