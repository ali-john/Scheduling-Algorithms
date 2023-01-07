#include <iostream>
#include <algorithm>

using namespace std;

// structure to represent a process
struct Process {
  int id;
  int burst_time;
};

// function to compare the burst times of two processes
bool cmp(Process a, Process b) {
  return a.burst_time < b.burst_time;
}

int main() {
  // array of processes
  Process processes[] = { {1, 5}, {2, 3}, {3, 4}, {4, 1} };
  int n = sizeof(processes) / sizeof(processes[0]);
  
  // sort the processes by burst time
  sort(processes, processes + n, cmp);
  
  // array to store the completion times of processes
  int completion_times[n];
  
  // variable to track the current time
  int current_time = 0;
  
  for (int i = 0; i < n; i++) {
    // add the burst time of the current process to the current time
    current_time += processes[i].burst_time;
    // store the completion time of the current process
    completion_times[i] = current_time;
  }
  
  cout << "Process\tBurst Time\tCompletion Time" << endl;
  for (int i = 0; i < n; i++) {
    cout << processes[i].id << "\t\t" << processes[i].burst_time << "\t\t" << completion_times[i] << endl;
  }
  
  return 0;
}
