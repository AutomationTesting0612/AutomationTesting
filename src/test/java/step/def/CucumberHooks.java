package step.def;


import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class CucumberHooks extends TestBase {

    @Before
    public void init() throws IOException {
        setup();
    }

    @After
    public void quit() {
        tearDown();
    }
}


///Test Runner
///@Test Runer Tag
//Feature
//Hooks--> Before---> browser Launch
//BackGround keyword--> login
//Scenario---


//Hooks vs BackGround









