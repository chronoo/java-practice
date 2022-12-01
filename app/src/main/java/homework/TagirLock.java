package homework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class TagirLock {
    private static int counter = 0;

    public static void main(String[] args) {
        Runnable action = () -> {
            for (int i = 0; i < 10; i++) {
                counter++;
            }
        };

        ExecutorService executor = Executors.newScheduledThreadPool(10);
        var runnableStream = Stream.generate(() -> action)
                .limit(1000)
                .map(runnable -> CompletableFuture.runAsync(runnable, executor))
                .toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(runnableStream).join();
        executor.shutdown();
        System.out.println(counter + ";" + Thread.currentThread().getId());
    }
}
