package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basics {

    @Test
    public void arrays() {
        String stringArrayEmpty[] = new String[]{};
        String stringArray[] = new String[]{
                "Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda"};
        int array[] = {1, 2, 3, 4, 5};

        Arrays.copyOf(stringArray, stringArray.length);

        Arrays.sort(stringArray);
        Arrays.sort(stringArray, Collections.reverseOrder());

        List<String> sortedList = Arrays.asList(stringArray).stream()
                .sorted().collect(Collectors.toList());

        List<String> revereseSortedList = Arrays.asList(stringArray).stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        var expected = true;
        var actual = true;
        Assertions.assertEquals(expected, actual);

    }

}
