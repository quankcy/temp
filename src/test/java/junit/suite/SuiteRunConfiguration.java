package junit.suite;

import java.util.Optional;

public class SuiteRunConfiguration {

    private static SuiteRunConfiguration INSTANCE = null;

    private final Optional<String> startUrl;

    public SuiteRunConfiguration(Optional<String> startUrl) {
        this.startUrl = startUrl;
    }

    public static SuiteRunConfiguration get(Optional<String> startUrl) {
        return Optional
                .ofNullable(INSTANCE)
                .orElseGet(
                        () -> {
                            INSTANCE = new SuiteRunConfiguration(startUrl);
                            return INSTANCE;
                        }
                );
    }

    public static SuiteRunConfiguration get() {
        return INSTANCE;
    }

    public String getStartUrl(String orElse) {
        return startUrl.orElse(orElse);
    }
}
