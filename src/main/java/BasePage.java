import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement find(By locater) {
        return driver.findElement(locater);
    }
    public void click(By locater) {find(locater).click(); }
    public void type(By locater, String text) {
        find(locater).sendKeys(text);
    }

    public boolean isSelected(By locater) { return find(locater).isSelected();}


}
