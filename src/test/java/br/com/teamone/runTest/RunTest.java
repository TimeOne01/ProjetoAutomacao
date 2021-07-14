package br.com.teamone.runTest;

import br.com.teamone.settings.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/test/resources"}
        , glue = {}
        , tags = "@web"
        , plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-reports.html"}
        , monochrome = true
        , dryRun = false
        , snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunTest extends BaseTest {
}
