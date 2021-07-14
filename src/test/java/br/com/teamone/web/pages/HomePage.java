package br.com.teamone.web.pages;

import br.com.teamone.settings.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='index-banner']/div/div/a")
    private WebElement botaoComecarAutomacao;

    public WebElement getBotaoComecarAutomacao() {
        return botaoComecarAutomacao;
    }
}

