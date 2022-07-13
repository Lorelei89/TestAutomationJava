package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals("Incorrect alert message",alertsPage.getResults(), "You successfully clicked an alert");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals("Incorrect alert message", text, "I am a JS Confirm");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerPrompt();
        String text = "This is a test!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals("Incorrect message input", alertsPage.getResults(), "You entered: " + text);
    }
}
