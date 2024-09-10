// A class that implements Runnable interface can be executed by a thread
class Task implements Runnable {
        private String name;

        // Constructor
        public Task(String name) {
                this.name = name;
        }

        // The run method contains the logic of the task
        public void run() {
                // Print the name of the task and the current thread
                System.out.println("Task " + name + " is running on thread " + Thread.currentThread().getName());
                // Simulate some work by sleeping for a random time
                try {
                        int delay = (int) (Math.random() * 1000);
                        Thread.sleep(delay);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                // Print the name of the task and the current thread again
                System.out.println("Task " + name + " is done on thread " + Thread.currentThread().getName());
        }
}


