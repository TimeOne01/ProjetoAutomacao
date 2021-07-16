package br.com.teamone.web.funcionalidades;

import br.com.teamone.settings.BaseTest;
import br.com.teamone.web.pages.FormularioPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormularioFuncionalidade extends BaseTest {
    private FormularioPage formularioPage;

    public FormularioFuncionalidade() {
        this.formularioPage = new FormularioPage(webDriver);
    }

    public void PreencheOsDados(){
        wait.until(ExpectedConditions.visibilityOf(this.formularioPage.getBotaoCriar()));
        this.formularioPage.getInputName().sendKeys("Amanda");
        this.formularioPage.getInputLastName().sendKeys("Fernandez");
        this.formularioPage.getInputEmail().sendKeys("amanda.fernandes@icloud.com");
        this.formularioPage.getInputEndereco().sendKeys("Alameda Santos, 350");
        this.formularioPage.getInputUniversidade().sendKeys("PUC SP");
        this.formularioPage.getInputProfissao().sendKeys("Publicitária");
        this.formularioPage.getInputGenero().sendKeys("Feminino");
        this.formularioPage.getInputIdade().sendKeys("28");
    }

    public void clicaNoBotaoCriar(){
        this.formularioPage.getBotaoCriar().click();
    }

}
