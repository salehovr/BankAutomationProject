package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    public WebElement accountDropDown;

    public String selectedOption(){
        Select accountOptions = new Select(accountDropDown);
        return accountOptions.getFirstSelectedOption().getText();
    }

}
