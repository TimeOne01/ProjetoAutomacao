package br.com.teamone.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TreinamentoPage {

    public TreinamentoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



}
