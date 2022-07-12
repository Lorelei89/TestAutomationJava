package ForgotPassword;

import Base.BaseTests;
import Pages.ForgotPasswordPage;
import Pages.InternalServerErrorPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testForgotPasswordError() {
        ForgotPasswordPage loginPage = homePage.clickForgotPassword();
        loginPage.enterEmail("example@example@gmail.com");
        InternalServerErrorPage internalError = loginPage.clickRetrievePassword();
        assertTrue(internalError.getInternalError().contains("Internal Server Error"), "Incorrect returned error");
    }
}
