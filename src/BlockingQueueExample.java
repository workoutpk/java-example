import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

        public static void main(String[] args) throws InterruptedException {
                // Create a blocking queue with a capacity of 10 elements.
                // Create a producer thread that adds elements to the queue.
                BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

                Thread producer = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                for (int i = 0; i < 10; i++) {
                                        try {
                                                queue.put(i);
                                                System.out.println(" element added i queue: " + i);
                                        } catch (InterruptedException e) {
                                                System.out.println("Producer thread interrupted.");
                                                e.printStackTrace();
                                        }
                                }
                        }
                });

                boolean shutdown = false;
                // Create a consumer thread that removes elements from the queue.
                boolean finalShutdown = shutdown;
                Thread consumer = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                while (!finalShutdown) {
                                        try {
                                                int element = queue.take();
                                                System.out.println("Consumed element: " + element);
                                        } catch (InterruptedException e) {
                                                // This will happen when the producer thread interrupts the consumer thread.
                                                System.out.println("Consumer thread interrupted.");
                                                return;
                                        }
                                }
                        }
                });

                // Start the producer and consumer threads.
                producer.start();
                consumer.start();

                // Wait for the producer thread to finish.
                producer.join();

                // Set the shutdown flag to true.
                shutdown = true;
                // Shutdown the consumer thread.
                producer.interrupt();
                consumer.interrupt();
        }
}
