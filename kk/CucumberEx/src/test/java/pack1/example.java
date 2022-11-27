package pack1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\Selenium-Tasks\\Task-selenium\\CucumberEx\\src\\test\\resources\\Features\\test.feature",
glue= {"pack1.cucumber1"})

public class example {

}
