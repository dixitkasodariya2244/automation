package api.cucumber.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/api/cucumber/Features",
        glue = "api/cucumber/Steps"
)
public class PostRunner {
}
