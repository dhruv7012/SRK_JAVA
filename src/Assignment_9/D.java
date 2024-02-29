package Assignment_9;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

interface Job {
    void perform();
}

class TaskExecutor implements Runnable {

    private final Queue<Job> jobQueue;
    private final List<String> executionResults;

    public TaskExecutor(Queue<Job> jobQueue, List<String> executionResults) {
        this.jobQueue = jobQueue;
        this.executionResults = executionResults;
    }

    @Override
    public void run() {
        while (true) {
            Job job;
            synchronized (jobQueue) {
                while (jobQueue.isEmpty()) {
                    try {
                        jobQueue.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                job = jobQueue.poll();
            }
            if (job != null) {
                job.perform();
                synchronized (executionResults) {
                    executionResults.add(Thread.currentThread().getName() + ": Job Completed");
                }
            }
        }
    }
}

class TaskManager {
    private final Queue<Job> jobQueue;
    private final List<String> executionResults;
    private final List<TaskExecutor> taskExecutors;

    TaskManager(int maxExecutors) {
        jobQueue = new LinkedBlockingQueue<>();
        executionResults = new ArrayList<>();
        taskExecutors = new ArrayList<>();
        for (int i = 0; i < maxExecutors; i++) {
            TaskExecutor executor = new TaskExecutor(jobQueue, executionResults);
            taskExecutors.add(executor);
            new Thread(executor, "executor-" + i).start();
        }
    }

    public void submitJob(Job job) {
        synchronized (jobQueue) {
            jobQueue.add(job);
            jobQueue.notifyAll();
        }
    }

    public List<String> getExecutionResults() {
        return executionResults;
    }
}

public class D {
    public static void main(String[] args) throws InterruptedException {
        TaskManager taskManager = new TaskManager(1);
        Job job1 = () -> System.out.println("Job 1 Executing...");
        Job job2 = () -> System.out.println("Job 2 Executing...");
        Job job3 = () -> System.out.println("Job 3 Executing...");
        taskManager.submitJob(job1);
        taskManager.submitJob(job2);
        taskManager.submitJob(job3);
        Thread.sleep(500);
        System.out.println("Printing Execution Results");
        for (String result : taskManager.getExecutionResults()) {
            System.out.println(result);
        }
    }
}