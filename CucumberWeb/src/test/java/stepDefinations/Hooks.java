package stepDefinations;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by rishabh.sakhare on 8/7/2019.
 */
public class Hooks {

    @Before
    public void beforeScenario(Scenario scene){
        System.out.println("\n <==========Starting "+scene.getName()+"========>");
    }

    @After
    public void afterScenario(Scenario scene){
        System.out.println("\n <==========="+scene.getName() +" Ended=========>");
    }


}
