package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        glue = {"stepDefinitions", "hooks"},
        features = {"src/test/resources/features"},
        tags = "@Positive"
)
public class CucumberRunnerTest {
}
