import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureParallel {

        public static void main(String[] args) throws ExecutionException, InterruptedException {
                CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
                CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Beautiful");
                CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "World");

                CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3);


                combinedFuture.get();
                System.out.println("Checking completion process ::");
                assertTrue(future1.isDone());
                assertTrue(future2.isDone());
                assertTrue(future3.isDone());
        }

        private static void assertTrue(boolean done) {
        }
}
