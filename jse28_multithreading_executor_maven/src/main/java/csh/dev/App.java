package csh.dev;

import csh.taskPrint.TaskPrintOut;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 * @author csh110dev
 * @version 1.0
 * 
 * Executors and ExecutorService are used to manage threads.
 * They are higher level APIs that are a more convenient and flexible
 * way to create and manage threads. Many of the details of thread 
 * management are handled by the Executors and ExecutorService APIs.
 * The ExecutorService has two methods for submitting tasks for execution:
 * execute(Runnable) and submit(Callable). The execute() method takes a
 * Runnable object and returns void. The submit() method takes a Runnable
 * or Callable object and returns a Future object. The Future object can
 * be used to determine if the task has completed, to cancel the task, or
 * to retrieve the result of the task.
 * 
 */
public final class App {
    public static void main(String[] args) {
        TaskPrintOut task1 = new TaskPrintOut("task1");
        TaskPrintOut task2 = new TaskPrintOut("task2");
        TaskPrintOut task3 = new TaskPrintOut("task3");

        System.out.println("Starting Executor");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

        executorService.shutdown();

        System.out.printf("Main method ends.%n%n");
    }
}
