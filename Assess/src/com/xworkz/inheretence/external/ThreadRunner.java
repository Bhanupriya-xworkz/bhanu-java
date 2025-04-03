package com.xworkz.inheretence.external;
import com.xworkz.inheretence.internal.Thread;
import com.xworkz.inheretence.internal.RunnableThread;

public class ThreadRunner {
        public static void main(String[] args) {
            // Create an object of RunnableThread (which is a subclass of ThreadExample)
            ThreadExample thread = new RunnableThread();
            ThreadExample basicThread = new ThreadExample();

            // Using basic thread operations
            basicThread.start();
            basicThread.sleep(1000);

            // Using RunnableThread operations
            RunnableThread runnableThread = new RunnableThread();
            runnableThread.start();
            runnableThread.run();
            runnableThread.sleep(3000);
        }
    }

