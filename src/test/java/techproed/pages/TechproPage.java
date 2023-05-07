package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilies.Driver;

public class TechproPage {
    public TechproPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='eicon-close']")
    public WebElement reklam;

    @FindBy(css = "input[type='search']")
    public WebElement searchBox;
    }
