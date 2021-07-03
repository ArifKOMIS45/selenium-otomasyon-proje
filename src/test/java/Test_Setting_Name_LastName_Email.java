import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_LastName_Email extends BaseTest {


    @Test
    public void setName() {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Arif");
        Assertions.assertEquals("Arif",practiceFormPage.getName(),"Name is not correct");
    }

    @Test
    public void setLastName() {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("komis");
        Assertions.assertEquals("komis",practiceFormPage.getlastName(),"Lastname is not correct");

    }

    @Test
    public void setEmail() {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("aaa@gmail.com");
        Assertions.assertEquals("aaa@gmail.com",practiceFormPage.getEmail(),"email is not correct");

    }

}
