package oop;

import java.util.function.IntSupplier;

@FunctionalInterface
public interface FuncInt {
    void doIt();

    default void doThis() {
        System.out.println(42);
    }

    String AAA = "42";
}

class DoIt {
    void it() {
        IntSupplier i = () -> {
            throw new RuntimeException();
        };

        FuncInt obj = new FuncInt() {
            @Override
            public void doIt() {
                System.out.println(41);
            }

            @Override
            public void doThis() {
                System.out.println(43);
            }
        };
        obj.doIt();
        obj.doThis();
        System.out.println(obj.AAA);
    }
}