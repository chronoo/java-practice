package homework;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TagirLock {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> action2 = () -> {
            for (int i = 0; i < 10; i++) {
                counter.getAndIncrement();
            }
            return counter.get();
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        BlockingQueue<Future<Integer>> queue = new LinkedBlockingQueue<>();
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(
                threadPool,
                queue
        );

        for (int i = 0; i < 10; i++) {
            completionService.submit(action2);
        }

        System.out.println(completionService.take().get());

        threadPool.shutdown();
        System.out.println(counter + ";" + ProcessHandle.current().pid());

        for (Future<Integer> future : queue) {
            System.out.println(future + ":" + future.get());
        }
    }
}
