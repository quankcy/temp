package junit.suite;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import junit.suite.suites.Base;
import junit.suite.tests.Regression;

import java.util.Optional;

public class SuiteConfigurationExtension implements
//        BeforeAllCallback,
//        BeforeEachCallback,
        ParameterResolver
{
//    @Override
//    public void beforeAll(ExtensionContext extensionContext) throws Exception {
//        TestRunConfiguration.get(extensionContext.getConfigurationParameter(Dictionary.URL));
//    }
//
//    @Override
//    public void beforeEach(ExtensionContext extensionContext) throws Exception {
//        TestRunConfiguration.get(extensionContext.getConfigurationParameter(Dictionary.URL));
//    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.isAnnotated(Regression.class);
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        Optional<String> optionalStartUrl = extensionContext.getConfigurationParameter(Base.URL);
        return new SuiteRunConfiguration(optionalStartUrl);
    }
}
