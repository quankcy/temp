package junit.suite.tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import junit.suite.SuiteConfigurationExtension;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(SuiteConfigurationExtension.class)
@Tag("Regression")
public @interface Regression {
}
