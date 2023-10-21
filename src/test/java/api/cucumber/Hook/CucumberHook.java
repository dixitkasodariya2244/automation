package api.cucumber.Hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHook {
    @Before
    public void setup(){
        System.out.println("----Before Hook----");
    }
    @After
    public void afterloginpage(){
        System.out.println("----After Hook----");
    }
}
