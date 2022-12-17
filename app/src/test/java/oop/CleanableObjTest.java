package oop;

import org.junit.jupiter.api.Test;

class CleanableObjTest {
    @Test
    void test1() throws Exception {
        try (var obj1 = new CleanableObj(42)) {
            obj1.read();
        }
    }

    @Test
    void test2() throws Exception {
        CleanableObj obj = new CleanableObj(42);
        obj.read();
        obj.close();
    }
}