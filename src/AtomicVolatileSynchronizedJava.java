import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVolatileSynchronizedJava {

        public static void main(String args[]){
                final IntegerCounter counter = new IntegerCounter();
                final CyclicBarrier startingBarrier = new CyclicBarrier(5);
                final CyclicBarrier endingBarrier = new CyclicBarrier(6);

                Runnable task = new Runnable(){
                        @Override
                        public void run(){
                                try {
                                        startingBarrier.await();
                                        for (int i = 0; i < 1000; i++) {
                                                int count = counter.getCount();
                                        }
                                        endingBarrier.await();

                                } catch (InterruptedException | BrokenBarrierException ex) { ex.printStackTrace();
                                }
                        }
                };

                Thread T1 = new Thread(task); T1.start();
                Thread T2 = new Thread(task); T2.start();
                Thread T3 = new Thread(task); T3.start();
                Thread T4 = new Thread(task); T4.start();
                Thread T5 = new Thread(task); T5.start();

                try {
                        endingBarrier.await();
                        System.out.println("Expected count : 5001" + " Actual count : "
                                + counter.getCount());
                } catch (InterruptedException | BrokenBarrierException ex) { ex.printStackTrace();
                }
        }

}
/**
 * A counter, which should return different count each time
 */

/*Even with the volatile variables, It may be possible that two threads may see the
same value of count and goes on to update that. To solve this issue, we can make
the getCount() method synchronized.
 */


/*By making synchronized, we got locking and visibility.
 When the thread leaves the synchronized method,
 All threads will see the updated value of the count variable.
  Let's re-run the code after making getCount() synchronized
 */
/*But, synchronized is expensive and affects performance considerably.
 */
class IntegerCounter{
        /**private int count = 1;
         //private volatile int count = 1;
         */
        private AtomicInteger count = new AtomicInteger(1);

        /*public int getCount(){
            return count++;
        }*/
        public int getCount(){
                return count.getAndIncrement();
        }
}
