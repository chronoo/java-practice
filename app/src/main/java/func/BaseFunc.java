package func;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BaseFunc {
    private static Logger log = java.util.logging.Logger.getGlobal();

    public static void main_(String[] args) {

        Function<String, String> doubler = s -> s + s;
        var quarter = doubler.andThen(doubler);
        System.out.println(quarter.apply("hello"));

        BiFunction<String, String, String> merger = (s1, s2) -> s1 + s2;
        var doubleMerger = merger.andThen(x -> x + x);
        System.out.println(doubleMerger.apply("1", "2"));
    }

    public static void main(String[] args) {
        print();
    }

    private static void print() {
        StackWalker stackWalker = StackWalker.getInstance();
        var types = stackWalker.walk(x -> x.peek(stackFrame -> log.log(Level.INFO, stackFrame.getClassName() + ":" + stackFrame.getLineNumber() + ":" + stackFrame.getMethodName()))
            .map(StackWalker.StackFrame::getMethodName)
            .collect(Collectors.toList()));
        log.info(types.toString());
    }
}
