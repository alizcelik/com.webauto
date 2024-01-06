package iframeTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

/**
 * 1. Land on home page
 * 2. Click on webautomation link
 * 3.Click on Iframe link
 * 4.Click on Nested Iframe link
 * 5.Verify that the header text "Join Inar Academy'sIntro Session" In iframe
 */
public class NestedIframe_Test extends Hooks {

    @Test
    void testNestedIframe(){
        //1. Land on home page
        //2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();

        //3.Click on Iframe link
        pages.getWebAutomationPage().clickOnIframeLink();

        BrowserUtils.scrollUpWithPageUp();

        //4.Click on Nested Iframe link
        pages.getWebAutomationPage().clickOnNestedIframe();

        //5.Verify that the header text "Join Inar Academy'sIntro Session" In iframe
        String actualHeader = pages.getNestedIframePage().getHeaderText();
        String expectedHeader = "Join Inar Academy's\n" +
                "Intro Session";

        Assertions.assertThat(expectedHeader).isEqualTo(actualHeader);

    }
}
