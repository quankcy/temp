package junit.suite.suites;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SuiteDisplayName;

//@Suite
//@SuiteDisplayName("Regression Test Suite")
//@IncludeTags("Regression")
@RegressionSuite
@SuiteDisplayName("ASD Regression Test Suite")
@ConfigurationParameter(key = Base.URL, value = "http://asd.qwe")
public class TestSuite {
}
