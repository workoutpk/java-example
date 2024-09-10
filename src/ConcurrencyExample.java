public class ConcurrencyExample {

        public static void main(String[] args) {
                // Create four tasks with different names
                Task task1 = new Task("A");
                Task task2 = new Task("B");
                Task task3 = new Task("C");
                Task task4 = new Task("D");

                // Create four threads and assign them the tasks
                Thread thread1 = new Thread(task1);
                Thread thread2 = new Thread(task2);
                Thread thread3 = new Thread(task3);
                Thread thread4 = new Thread(task4);

                // Start the threads
                thread1.start();
                thread2.start();
                thread3.start();
                thread4.start();

                // Wait for the threads to finish
                try {
                        thread1.join();
                        thread2.join();
                        thread3.join();
                        thread4.join();
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }

                // Print a message when all threads are done
                System.out.println("All tasks are completed.");
        }
}