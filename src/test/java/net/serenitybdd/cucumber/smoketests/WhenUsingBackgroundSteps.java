package net.serenitybdd.cucumber.smoketests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/smoketests/using_background_steps.feature")
public class WhenUsingBackgroundSteps {
}
