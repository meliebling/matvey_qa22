import org.testng.annotations.Test;

public class Homework_2 extends TestBase {


    @Test
    public void findTelRanTitles() throws InterruptedException {
        openSite("https://www.tel-ran.com/");


        getTextAboutUs();
        getTextCourses();
        getTextEmployment();
        getTextReviews();
        getTextBlog();
        getTextContacts();
        return;


    }


}


