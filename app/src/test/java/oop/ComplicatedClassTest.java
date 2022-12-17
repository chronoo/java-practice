package oop;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
class ComplicatedClassTest {
    @Test
    @SneakyThrows
    void test1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        EasyRandomParameters parameters = new EasyRandomParameters();
        parameters.collectionSizeRange(1,5);
        parameters.randomizationDepth(2);

        ComplicatedClass obj = new EasyRandom(parameters)
                .nextObject(ComplicatedClass.class);
        System.out.println(obj);

        String output = out.toString();

        assertThat(output)
                .contains("age=" + obj.getAge())
                .contains("name=" + obj.getName())
                .contains("gender=" + obj.getGender());

        System.err.println(output);
    }
}