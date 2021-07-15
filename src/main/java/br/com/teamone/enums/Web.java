package br.com.teamone.enums;

import br.com.teamone.interfaces.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;


/**
 * Enum de configuração dos Navegadores
 * CHROME configurado
 */
public enum Web implements WebApplication {
    /**
     * Chrome configurado para ser usado como Driver dos teste
     */
    CHROME {
        @Override
        public WebDriver getWebDriver() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs());
            return new ChromeDriver(options);
        }
    };

    /**
     * Metódo no qual é configurado as preferências do navegador Chrome
     * @return Map<String, Object>,
     *                            String: Índice do atributo de preferências;
     *                            Object: Valor atribuido
     */
    protected Map<String, Object> prefs() {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        return prefs;
    }
}
