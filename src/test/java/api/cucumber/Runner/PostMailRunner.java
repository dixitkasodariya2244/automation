package api.cucumber.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/api/cucumber/Features/Tags.feature"},
        glue = {"api/cucumber/Steps","api/cucumber/Hook"},
//        plugin = {"pretty","html:target/HtmlReports"}
        plugin = {"pretty","junit:target/report.xml"},
//        tags = "@important"
//        tags = "@notimportant"
//        tags = "@important and @notimportant"
//        tags = "(@important or @notimportant) and @veryimportant"
//        tags = "(@important and @notimportant) and @veryimportant"
        tags = "@mustRun"
)
public class PostMailRunner {
}
