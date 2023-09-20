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
@IncludeTags("Sanity")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@SelectClasses({
//        TestScenario2.class,
        TestScenario1.class
})
public @interface SanitySuite {
}
