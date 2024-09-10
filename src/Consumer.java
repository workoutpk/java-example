import java.util.Queue;
import java.util.logging.Logger;

public class Consumer extends Thread {
        private static final Logger logger = Logger.getLogger(String.valueOf(Consumer.class));
        private final Queue sharedQ;

        public Consumer(Queue sharedQ) {
                super("Consumer");
                this.sharedQ = sharedQ;
        }

        @Override
        public void run() {
                while (true) {

                        synchronized (sharedQ) {
                                //waiting condition - wait until Queue is not empty
                                while (sharedQ.size() == 0) {
                                        try {
                                                System.out.println("Queue is empty, waiting");
                                                //logger.info("Queue is empty, waiting");
                                                sharedQ.wait();
                                        } catch (InterruptedException ex) {
                                                ex.printStackTrace();
                                        }
                                }
                                int number = (int) sharedQ.poll();
                                System.out.println("consuming : " + number);
                                //logger.info("consuming : " + number );
                                sharedQ.notify();

                                //termination condition
                                if (number == 3) {
                                        break;
                                }
                        }
                }
        }
}
