package org.example;

import com.microsoft.playwright.Page;

public class FactorialHomePage {

    public Page page;

    public FactorialHomePage(Page page) {
        this.page = page;
    }

    public void enterNumber(String number) {
        page.locator("#number").fill(number);
    }

    public void clickCalculateButton() {
        page.locator("#getFactorial").click();
    }

    public String getMessage() {
        return page.locator("#resultDiv").innerText();
    }
}