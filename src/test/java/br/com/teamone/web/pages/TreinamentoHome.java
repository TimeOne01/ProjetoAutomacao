package br.com.teamone.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreinamentoHome {

    public TreinamentoHome(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Formulário']")
    private WebElement linkFormulario;

    @FindBy(xpath = "//a[text()='Criar Usuários']")
    private WebElement linkCriarUsuarios;

    public WebElement getLinkFormulario() {
        return linkFormulario;
    }

    public WebElement getLinkCriarUsuarios() {
        return linkCriarUsuarios;
    }
}
