package br.com.teamone.web.funcionalidades;

import br.com.teamone.settings.BaseTest;
import br.com.teamone.web.pages.UsuarioPage;

public class UsuarioFuncionalidade extends BaseTest {
    private UsuarioPage usuarioPage;

    public UsuarioFuncionalidade() {
        this.usuarioPage = new UsuarioPage(webDriver);
    }

    public String pegarMensagem(){
        return this.usuarioPage.getMensagem().getText();
    }

}
