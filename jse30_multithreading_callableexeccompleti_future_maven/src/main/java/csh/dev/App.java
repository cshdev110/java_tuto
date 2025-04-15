package csh.dev;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import csh.taskPrint.TaskPrintOut;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;

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
 */

public class App {

    public static void main( String[] args ) throws InterruptedException,
                                                    ExecutionException,
                                                    TimeoutException{

        TaskPrintOut task1 = new TaskPrintOut("task 1");
        TaskPrintOut task2 = new TaskPrintOut("task 2");
        TaskPrintOut task3 = new TaskPrintOut("task 3");

        System.out.println("Initialising Executor");

        // Two ways to initialize the ExecutorService for multithreading
        // * ExecutorService exeService = Executors.newFixedThreatPool(3);
        // * ExecutorService exeService = Executors.newCachedThreadPool();

        ExecutorService exeService = Executors.newCachedThreadPool();
        /**
         * The `CompletionService` and `ExecutorCompletionService` are used to manage and 
         * retrieve the results of concurrent tasks efficiently. 
         * `CompletionService`**: Combines task submission and result retrieval, allowing you 
         * to process completed tasks as they finish, rather than waiting for all tasks to complete.
         * `ExecutorCompletionService`**: Implements `CompletionService` using an `Executor`, 
         * enabling you to submit tasks to an `ExecutorService` and retrieve their results in the order of completion.
        */
        CompletionService<String> ecs = new ExecutorCompletionService<>(exeService);


        Future<String> ftask1 = ecs.submit(task1);
        Future<String> ftask2 = ecs.submit(task2);
        Future<String> ftask3 = ecs.submit(task3);
        // The Future object can be used to determine if the task has completed,
        // to cancel the task, or to retrieve the result of the task.
        // The get() method blocks until the task is complete and returns the result.

        while (!ftask1.isDone() || !ftask2.isDone() || !ftask3.isDone()) {
            System.out.println(ecs.take().get());
        }

        System.out.println("All tasks initialised and completed");
        // The shutdown() method is used to stop the ExecutorService
        // and release the resources used by the threads.
        exeService.shutdown();        
        
    }
}
