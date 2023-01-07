import java.util.ArrayDeque;
import java.util.Deque;

public class MultiLevelQueue {
 
  // structure to represent a process
  static class Process {
    int id;
    int burstTime;
    int priority;
 
    public Process(int id, int burstTime, int priority) {
      this.id = id;
      this.burstTime = burstTime;
      this.priority = priority;
    }
  }
 
  public static void main(String[] args) {
    // create an array of deques to represent the priority queues
    Deque<Process>[] queues = new ArrayDeque[3];
    for (int i = 0; i < 3; i++) {
      queues[i] = new ArrayDeque<>();
    }
 
    // add processes to the queues
    queues[0].add(new Process(1, 3, 3));
    queues[0].add(new Process(2, 1, 3));
    queues[1].add(new Process(3, 5, 2));
    queues[1].add(new Process(4, 4, 2));
    queues[2].add(new Process(5, 2, 1));
    queues[2].add(new Process(6, 3, 1));
 
    int currentTime = 0;
 
    // array to store the completion times of processes
    int[] completionTimes = new int[6];
 
    while (true) {
      // flag to indicate whether a process was serviced
      boolean serviced = false;
 
      // check each queue for processes to service
      for (int i = 0; i < 3; i++) {
        if (!queues[i].isEmpty()) {
          // process the first process in the queue
          Process p = queues[i].pollFirst();
          currentTime += p.burstTime;
          completionTimes[p.id - 1] = currentTime;
          serviced = true;
        }
      }
 
      // if no processes were serviced, all queues are empty
      if (!serviced) {
        break;
      }
    }
 
    System.out.println("Process\tBurst Time\tPriority\tCompletion Time");
    for (int i = 0; i < 6; i++) {
      System.out.println((i + 1) + "\t\t" + queues[i / 2].
