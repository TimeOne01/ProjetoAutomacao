package br.com.teamone.commons;


import br.com.teamone.settings.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumRobot extends BaseTest {

    public void esperaFicarVisivelEClica(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
