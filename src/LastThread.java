import java.util.Map;
import java.util.Set;

public class LastThread {

        public static void main(String[] args) {
                // Create a list of all the threads in the application.
                //StackTraceElement[] threads = Thread.getAllStackTraces().get();

                // Find the thread that you want to be the last thread.
                //Thread lastThread = threads.get(0);

                // Set the `daemon` property of the thread to `true`.
                //lastThread.setDaemon(true);

                // Start the thread.
                //lastThread.start();
                // get the root thread group
                ThreadGroup root = Thread.currentThread().getThreadGroup().getParent();
                while (root.getParent() != null) {
                        root = root.getParent();
                }

                // get an estimate of active threads
                int size = root.activeCount();

                // create an array to hold the threads
                Thread[] threads = new Thread[size];

                // enumerate the threads and subgroups recursively
                int actualSize = root.enumerate(threads, true);

                // check if the array was large enough
                if (actualSize > size) {
                        // enlarge the array and enumerate again
                        size = actualSize;
                        threads = new Thread[size];
                        actualSize = root.enumerate(threads, true);
                }

                // get the last thread in the array
                Thread last = threads[actualSize - 1];

                // print its name and state
                System.out.println("Last thread: " + last.getName());
                System.out.println("State: " + last.getState());


                // Get a map of all the threads in the application.
                Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();

                // Iterate over the map and print the name of each thread.
                Set<Thread> threads1 = allStackTraces.keySet();
                for (Thread thread : threads1) {
                        System.out.println("types of thread :::   "  + thread.getName() +" : :  "+thread.getId());
                }
        }
}
