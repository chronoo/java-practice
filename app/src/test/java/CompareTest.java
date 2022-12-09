import org.junit.jupiter.api.Test;
import structure.SimpleDto;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

class CompareTest {
    @Test
    void test() {
        Stream.of().count();

        SimpleDto first = new SimpleDto("my", 2, true);
        SimpleDto second = new SimpleDto("you", 3, false);

        System.out.println(USER_COMPARATOR.compare(first, second));
    }

    static final Comparator<SimpleDto> USER_COMPARATOR =
            comparing(SimpleDto::getName)
                    .thenComparingInt(SimpleDto::getAge)
                    .thenComparing(SimpleDto::isMale);
}
