package junit.suite.suites;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import junit.suite.tests.TestScenario1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Suite
//@SuiteDisplayName("Regression Test Suite")
@IncludeTags("Regression")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
//@SelectMethods({})
@SelectClasses({
//        TestScenario2.class,
        TestScenario1.class
})
public @interface RegressionSuite {
}
