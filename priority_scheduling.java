import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityScheduling {
 
  // structure to represent a process
  static class Process implements Comparable<Process> {
    int id;
    int burstTime;
    int priority;
 
    public Process(int id, int burstTime, int priority) {
      this.id = id;
      this.burstTime = burstTime;
      this.priority = priority;
    }
 
    // function to compare the priorities of two processes
    @Override
    public int compareTo(Process p) {
      return p.priority - this.priority;
    }
  }
 
  public static void main(String[] args) {
    List<Process> processes = new ArrayList<>();
 
    // add processes to the list
    processes.add(new Process(1, 3, 3));
    processes.add(new Process(2, 5, 1));
    processes.add(new Process(3, 1, 4));
    processes.add(new Process(4, 4, 2));
 
    // sort the processes by priority
    Collections.sort(processes);
 
    // array to store the completion times of processes
    int[] completionTimes = new int[processes.size()];
 
    // variable to track the current time
    int currentTime = 0;
 
    for (int i = 0; i < processes.size(); i++) {
      // add the burst time of the current process to the current time
      currentTime += processes.get(i).burstTime;
      // store the completion time of the current process
      completionTimes[i] = currentTime;
    }
 
    System.out.println("Process\tBurst Time\tPriority\tCompletion Time");
    for (int i = 0; i < processes.size(); i++) {
      Process p = processes.get(i);
      System.out.println(p.id + "\t\t" + p.burstTime + "\t\t" + p.priority + "\t\t" + completionTimes[i]);
    }
  }
}
