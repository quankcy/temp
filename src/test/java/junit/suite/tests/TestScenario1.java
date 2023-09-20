package junit.suite.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import junit.suite.SuiteRunConfiguration;

import java.util.Optional;

//@TestConfiguration
//@ExtendWith(TestConfigurationExtension.class)
public class TestScenario1 {

    //    @Disabled
    @Test
//    @Tag("Regression")
    @Regression
//    public void ts1_regression(@Regression TestRunConfiguration testRunConfiguration) {
    public void ts1_regression() {
//        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request();

//        SuiteLauncherDiscoveryRequestBuilder.request();
//        LauncherDiscoveryRequestBuilder.
//        LauncherConfigurationParameters
//        LauncherFactory
//        testConfiguration.getUrl("dupa");
        String asd = Optional.ofNullable(SuiteRunConfiguration.get())
                .map( a -> a.getStartUrl("asd"))
                .orElse("asd");

//        Optional<TestRunConfiguration> testRunConfiguration = TestRunConfiguration.get();
        Assertions.assertEquals("asd", asd);
    }

    @Disabled
    @Test
//    @Tag("Sanity")
    public void ts1_smoke() {
        Assertions.assertEquals(1, 1);
    }

}
