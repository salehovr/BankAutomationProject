package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    public WebElement accountDropDown;

    public String selectedOption(){
        Select accountOptions = new Select(accountDropDown);
        return accountOptions.getFirstSelectedOption().getText();
    }

    public List<String> accountOptionsList(){
        Select accountOptionsDropDown = new Select(accountDropDown);
        return BrowserUtils.getElementsText(accountOptionsDropDown.getOptions());
    }
}
