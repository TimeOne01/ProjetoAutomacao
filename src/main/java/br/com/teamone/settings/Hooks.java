package br.com.teamone.settings;

import br.com.teamone.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends  BaseTest {
    @Before
    public void setUp() {
        System.out.println("Abrindo o Navegador");
        initializeWebApplication(Web.CHROME,
                "https://automacaocombatista.herokuapp.com/");
    }

    @After
    public void tearDown() {
        System.out.println("Fechando o Navegador");
        closeWeb();
    }
}
