package git.mauryasantosh.cucumberRest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/java/features/Login.feature"
		 ,glue={"stepDefinition"}
		 ,monochrome = false)
public class AppTest 
{
	
}
