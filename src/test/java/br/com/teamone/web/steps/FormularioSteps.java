package br.com.teamone.web.steps;

import br.com.teamone.web.funcionalidades.FormularioFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class FormularioSteps {

    private FormularioFuncionalidade formularioFuncionalidade;

    public FormularioSteps() {
        this.formularioFuncionalidade = new FormularioFuncionalidade();
    }

    @Dado("^preencho os campos com dados validos$")
    public void  preenchoOsCamposComDadosValidos() {
        this.formularioFuncionalidade.PreencheOsDados();
    }

    @Quando("^clico em \"([^\"]*)\"$")
    public void clicoEm(String arg0) {
        this.formularioFuncionalidade.clicaNoBotaoCriar();
    }
}


