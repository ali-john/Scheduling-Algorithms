def first_come_first_serve(processes, n):
  # array to store the completion times of processes
  completion_times = [0] * n
  
  # variable to track the current time
  current_time = 0
  
  for i in range(n):
    # add the burst time of the current process to the current time
    current_time += processes[i][1]
    # store the completion time of the current process
    completion_times[i] = current_time
  
  return completion_times

# example usage
processes = [(1, 3), (2, 5), (3, 1), (4, 4)]
n = len(processes)
completion_times = first_come_first_serve(processes, n)

print("Process\tBurst Time\tCompletion Time")
for i in range(n):
  print(f"{processes[i][0]}\t\t{processes[i][1]}\t\t{completion_times[i]}")
