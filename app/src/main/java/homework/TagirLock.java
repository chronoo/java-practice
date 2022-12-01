package homework;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TagirLock {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Void> action2 = () -> {
            for (int i = 0; i < 10; i++) {
                synchronized (TagirLock.class) {
                    counter.getAndIncrement();
                }
            }
            return null;
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        CompletionService<Void> completionService = new ExecutorCompletionService<>(threadPool);

        for (int i = 0; i < 10; i++) {
            completionService.submit(action2);
        }

        completionService.take().get();

        threadPool.shutdown();
        System.out.println(counter + ";" + ProcessHandle.current().pid());
    }
}
