package br.com.teamone.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsuarioPage {
    public UsuarioPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//p[@id='notice']")
    private WebElement mensagem;

    public WebElement getMensagem() {
        return mensagem;
    }
}
