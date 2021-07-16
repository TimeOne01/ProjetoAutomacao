package br.com.teamone.web.funcionalidades;

import br.com.teamone.commons.SeleniumRobot;
import br.com.teamone.settings.BaseTest;
import br.com.teamone.web.pages.HomePage;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;
    private SeleniumRobot seleniumRobot;

    public HomeFuncionalidade() {
        this.homePage = new HomePage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void clicarNoBotaoComecarAutomacao(){
        this.seleniumRobot.esperaFicarVisivelEClica(
                this.homePage.getBotaoComecarAutomacao());
    }

}
