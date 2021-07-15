package br.com.teamone.interfaces;

import org.openqa.selenium.WebDriver;

/**
 * Interface para implementação do webDriver
 * obs.: os navegadores que serão retornado no getWebDriver são configurados no Enum Web
 */
public interface WebApplication {
    /**
     * @return o webDriver que será utilizado para realizar os testes
     */
    WebDriver getWebDriver();
}
