package br.com.teamone.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormularioPage {

    public FormularioPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user_name']")
    private WebElement inputName;

    @FindBy(xpath = "//input[@id='user_lastname']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='user_address']")
    private WebElement inputEndereco;

    @FindBy(xpath = "//input[@id='user_university']")
    private WebElement inputUniversidade;

    @FindBy(xpath = "//input[@id='user_profile']")
    private WebElement inputProfissao;

    @FindBy(xpath = "//input[@id='user_gender']")
    private WebElement inputGenero;

    @FindBy(xpath = "//input[@id='user_age']")
    private WebElement inputIdade;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement botaoCriar;

    public WebElement getInputName() {
        return inputName;
    }

    public WebElement getInputLastName() {
        return inputLastName;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputEndereco() {
        return inputEndereco;
    }

    public WebElement getInputUniversidade() {
        return inputUniversidade;
    }

    public WebElement getInputProfissao() {
        return inputProfissao;
    }

    public WebElement getInputGenero() {
        return inputGenero;
    }

    public WebElement getInputIdade() {
        return inputIdade;
    }

    public WebElement getBotaoCriar() {
        return botaoCriar;
    }
}
