package junit.suite.suites;

import junit.suite.SuiteConfigurationExtension;
import junit.suite.tests.TestScenario2;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectMethod;
import org.junit.platform.suite.api.SelectMethods;
import org.junit.platform.suite.api.Suite;
import junit.suite.tests.TestScenario1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Suite
//@SuiteDisplayName("Regression Test Suite")
//@IncludeTags("Regression")
//@ExtendWith(SuiteConfigurationExtension.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@SelectMethods({
        @SelectMethod(type = TestScenario1.class, name = "ts1_regression"),
        @SelectMethod(type = TestScenario2.class, name = "ts2_regression"),
})
public @interface RegressionSuite {
}
