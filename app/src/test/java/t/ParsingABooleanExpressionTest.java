package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParsingABooleanExpressionTest {
    ParsingABooleanExpression obj = new ParsingABooleanExpression();

    @Test
    void test1() {
        assertThat(obj.parseBoolExpr("&(|(f))")).isFalse();
    }

    @Test
    void test2() {
        assertThat(obj.parseBoolExpr("|(f,f,f,t)")).isTrue();
    }

    @Test
    void test3() {
        assertThat(obj.parseBoolExpr("!(&(f,t))")).isTrue();
    }
}