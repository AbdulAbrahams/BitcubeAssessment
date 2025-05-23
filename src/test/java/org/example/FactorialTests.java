package org.example;

import com.microsoft.playwright.*;
import junit.framework.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class FactorialTests {

    Page page;
    Browser browser;
    FactorialHomePage factorialHomePage;

    @BeforeMethod
    public void openFactorialWebsite() {
        Playwright playwright = Playwright.create();
        browser = playwright.chromium().launch();
        page = browser.newPage();
        page.navigate("https://qainterview.pythonanywhere.com/");
        factorialHomePage = new FactorialHomePage(page);
    }

    public void validateErrorMessage() {
        factorialHomePage.clickCalculateButton();
        String errorMessage = factorialHomePage.getMessage();
        Assert.assertEquals("Please enter an integer", errorMessage);
    }

    public void retrieveFactorialForInteger12() {
        factorialHomePage.enterNumber("12");
        factorialHomePage.clickCalculateButton();
        page.locator("#resultDiv").waitFor();
        String message = factorialHomePage.getMessage();
        Assert.assertEquals("The factorial of 12 is: 479001600", message);
    }

    public void validateConsoleMessage() {
        factorialHomePage.enterNumber("1");
        factorialHomePage.clickCalculateButton();
        page.onConsoleMessage(message ->
                Assert.assertEquals("Hello! I am in the done part of the ajax call", message.text()));
        page.evaluate("console.log('Hello! I am in the done part of the ajax call')");
    }

    public void getAPICallAndParams() {
        page.onRequest(request -> {
            Assert.assertEquals("POST", request.method());
            Assert.assertEquals("https://qainterview.pythonanywhere.com/factorial", request.url());
            Assert.assertTrue(request.headers().containsKey("content-type"));
            Assert.assertTrue(request.postData().contains("number=1"));
        });

        factorialHomePage.enterNumber("1");
        factorialHomePage.clickCalculateButton();
    }

    @AfterMethod
    public void closeBrowser() {
        browser.close();
    }
}