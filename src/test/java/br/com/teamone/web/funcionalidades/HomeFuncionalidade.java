package br.com.teamone.web.funcionalidades;

import br.com.teamone.settings.BaseTest;
import br.com.teamone.web.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;

    public HomeFuncionalidade() {
        this.homePage = new HomePage(webDriver);
    }

    public void clicarNoBotaoComecarAutomacao(){
        WebElement botaoComecarAutomacao = this.homePage.getBotaoComecarAutomacao();
        wait.until(ExpectedConditions.elementToBeClickable(botaoComecarAutomacao));
        botaoComecarAutomacao.click();
    }

}
