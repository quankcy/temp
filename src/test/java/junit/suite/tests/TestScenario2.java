package junit.suite.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestScenario2 {

//    @Disabled
    @Test
//    @Tag("Regression")
    public void ts2_regression(){
        Assertions.assertEquals(1,1);
    }

    @Test
//    @Tag("Smoke")
    public void ts2_smoke(){
        Assertions.assertEquals(1,1);
    }

}
