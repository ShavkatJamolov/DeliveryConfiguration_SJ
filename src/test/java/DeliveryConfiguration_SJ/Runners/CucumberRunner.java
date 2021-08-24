package DeliveryConfiguration_SJ.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

        features="src/test/resources/features",
        glue = "DeliveryConfiguration_SJ/StepDef",
        monochrome = true,
        publish = true,
        dryRun = false,
        stepNotifications = false,
        plugin = {"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "timeline:target/timeline-report",
                "junit:target/cucumber-html-reports/cucumber.xml"
        },

        tags = "@Login or @MyReports"

)
public class CucumberRunner {
}