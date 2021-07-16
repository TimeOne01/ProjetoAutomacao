package br.com.teamone.web.funcionalidades;

import br.com.teamone.commons.SeleniumRobot;
import br.com.teamone.settings.BaseTest;
import br.com.teamone.web.pages.TreinamentoHome;

public class TreinamentoFuncionalidade extends BaseTest {

    private TreinamentoHome treinamentoHome;
    private SeleniumRobot seleniumRobot;

    public TreinamentoFuncionalidade() {
        this.treinamentoHome = new TreinamentoHome(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void clicarNoLinkFormulario(){
        this.seleniumRobot.esperaFicarVisivelEClica(
                this.treinamentoHome.getLinkFormulario());
    }

    public void clicarNoLinkCriarUsuarios(){
        this.seleniumRobot.esperaFicarVisivelEClica(
                this.treinamentoHome.getLinkCriarUsuarios());
    }
}
