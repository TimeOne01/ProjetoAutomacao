package br.com.teamone.web.steps;

import br.com.teamone.web.funcionalidades.UsuarioFuncionalidade;
import io.cucumber.java.pt.Entao;

import static org.junit.Assert.*;

public class UsuarioSteps {

    private UsuarioFuncionalidade usuarioFuncionalidade;

    public UsuarioSteps() {
        this.usuarioFuncionalidade = new UsuarioFuncionalidade();
    }

    @Entao("^sou redirecionado para pagina com a mensagem \"([^\"]*)\"$")
    public void souRedirecionadoParaPaginaComAMensagem(String mensagem) {
        assertEquals(mensagem, this.usuarioFuncionalidade.pegarMensagem());
    }
}

