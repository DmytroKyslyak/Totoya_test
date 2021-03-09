package com.qaconsultants;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * For development purposes
 *
 * @author Danny Briskin (DBriskin@qaconsultants.com)
 * for qactoyotaautomation project.
 */
//@formatter:off
@CucumberOptions(strict = true,
        plugin = {"pretty"
        , "html:target/features-report/qacToyotaAuto"
        , "json:target/cucumber_report/cucumber.json"
}
        , features = {"src/test/resources/features"}
        , glue = {"com/qaconsultants"}
        , tags = {"@dataBaseToyota"}
)
@RunWith(Cucumber.class)
public class RunPagesTest   {}
