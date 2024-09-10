import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentApplication {
        private static final ExecutorService executorService = Executors.newFixedThreadPool(10);

        public static void main(String[] args) {
                for (int i = 0; i < 10; i++) {
                        executorService.submit(() -> {
                                System.out.println(System.currentTimeMillis());
                        });
                }

        }
}
