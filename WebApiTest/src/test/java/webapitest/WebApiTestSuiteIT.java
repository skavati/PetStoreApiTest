package webapitest;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(publish=true,features="src/test/resources/WebApiTestResource/features",tags="@petStore")
public class WebApiTestSuiteIT {
} 
