package br.com.teamone.settings;

import br.com.teamone.interfaces.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    /**
     * Iniciar o webDriver com o enum Web para configuração do navegador e a url que será testada
     * @param webApplication O Driver que será implementado, selecionar pelo Enum Web
     * @param url            Endereço do site que será testado
     */
    protected void initializeWebApplication(WebApplication webApplication, String url) {
        if (webDriver != null)
            webDriver.quit();

        webDriver = webApplication.getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);

        wait = new WebDriverWait(webDriver, 60);
    }

    /**
     * Fecha o driver web
     */
    protected static void closeWeb() {
        webDriver.close();
    }
}
