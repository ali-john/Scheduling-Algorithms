import java.util.ArrayDeque;
import java.util.Deque;

public class RoundRobin {
 
  // structure to represent a process
  static class Process {
    int id;
    int burstTime;
    int remainingTime;
 
    public Process(int id, int burstTime) {
      this.id = id;
      this.burstTime = burstTime;
      this.remainingTime = burstTime;
    }
  }
 
  public static void main(String[] args) {
    Deque<Process> queue = new ArrayDeque<>();
 
    // add processes to the queue
    queue.add(new Process(1, 3));
    queue.add(new Process(2, 5));
    queue.add(new Process(3, 1));
    queue.add(new Process(4, 4));
 
    int timeQuantum = 2;
    int currentTime = 0;
 
    // array to store the completion times of processes
    int[] completionTimes = new int[queue.size()];
 
    while (!queue.isEmpty()) {
      Process p = queue.pollFirst();
      if (p.remainingTime > timeQuantum) {
        // process still has remaining time, add it back to the queue
        p.remainingTime -= timeQuantum;
        currentTime += timeQuantum;
        queue.addLast(p);
      } else {
        // process has completed, update completion time
        currentTime += p.remainingTime;
        completionTimes[p.id - 1] = currentTime;
      }
    }
 
    System.out.println("Process\tBurst Time\tCompletion Time");
    for (int i = 0; i < completionTimes.length; i++) {
      System.out.println((i + 1) + "\t\t" + queue.get(i).burstTime
          + "\t\t" + completionTimes[i]);
    }
  }
}
