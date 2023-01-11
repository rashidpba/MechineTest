package demotest;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Features/testing.feature",glue={"demotest"},
monochrome=true,
plugin= {"pretty","html:target/Htmlreports"}

		)
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
