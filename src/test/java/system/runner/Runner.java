package system.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/system/resources/features",
        glue = "system/stepDefinitions",
        tags = "@ts2021",
        monochrome = false,
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}