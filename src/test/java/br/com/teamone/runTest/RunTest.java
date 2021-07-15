package br.com.teamone.runTest;

import br.com.teamone.settings.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Classe RunTest para executar os teste criado com o cucumber.
 * * ATENÇÃO: Não esqueça de atualizar as configurações do CucumberOptions.
 * * features: path da pasta onde estão os arquivos de bdd com os cenários de teste;
 * * glue: path de onde estão os arquivos (as classes onde foram implementados) de execução dos cenários;
 * * tags: a tag dos cenários ou funcionalidades que serão executadas no Teste.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/test/resources"}
        , glue = {"br.com.teamone.web", "br.com.teamone.settings"}
        , tags = "@web"
        , plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-reports.html"}
        , monochrome = true
        , dryRun = false
        , snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunTest extends BaseTest {
}
