package br.com.teamone.web.steps;

import br.com.teamone.web.funcionalidades.HomeFuncionalidade;
import io.cucumber.java.pt.Dado;

public class HomeSteps {

    private HomeFuncionalidade homeFuncionalidade;

    public HomeSteps() {
        this.homeFuncionalidade = new HomeFuncionalidade();
    }

    @Dado("que clico no botao {string}")
    public void queClicoNoBotao(String arg0) {
        this.homeFuncionalidade.clicarNoBotaoComecarAutomacao();
    }
}


