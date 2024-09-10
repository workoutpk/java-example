public class SelfTest extends Thread {
        @Override
        public void run() {
                System.out.println("Thread is running :::  " + Thread.currentThread().getId());
        }
        public static void main(String[] args) {
        Thread thread1 = new Thread(new SelfTest());
        Thread thread2 = new Thread(new SelfTest());
        thread1.start();
        thread2.start();
        }


}
