package br.com.teamone.web.steps;

import br.com.teamone.web.funcionalidades.TreinamentoFuncionalidade;
import io.cucumber.java.pt.Dado;

public class TreinamentoSteps {

    private TreinamentoFuncionalidade treinamentoFuncionalidade;

    public TreinamentoSteps() {
        this.treinamentoFuncionalidade = new TreinamentoFuncionalidade();
    }

    @Dado("^que navego ate o formulario de criar novo usuario$")
    public void queNavegoAteOFormularioDeCriarNovoUsuario(){
        this.treinamentoFuncionalidade.clicarNoLinkFormulario();
        this.treinamentoFuncionalidade.clicarNoLinkCriarUsuarios();
    }
}
