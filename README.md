![image](https://user-images.githubusercontent.com/63426759/211526331-e521935d-fe88-4f44-a531-f25a4d5786e7.png)

# Scheduling-Algorithms
---

- First-Come First-Served (FCFS): This is the most basic scheduling algorithm, where the process that arrives first is executed first. It is simple to implement, but can lead to long wait times for processes that arrive later, as they will have to wait for all the earlier processes to finish executing.

- Shortest Job First (SJF): In this algorithm, the process with the shortest execution time is chosen for execution first. This can help to minimize average wait times, as shorter processes will finish more quickly and allow longer processes to start sooner. However, it can be difficult to predict the execution time of a process accurately, which can lead to poor performance.

- Priority Scheduling: In this algorithm, each process is assigned a priority, and the process with the highest priority is executed first. This can be useful for important processes that need to be completed as soon as possible, but it can also lead to lower priority processes being starved of CPU time.

- Round Robin (RR): In this algorithm, each process is assigned a time slice or quantum, and the CPU is cycled between processes in a round-robin fashion. This can help to prevent long wait times for lower priority processes, but it can also lead to overhead as the CPU constantly switches between processes.

- Bankers Algorithms: The Banker's algorithm is a resource allocation and deadlock avoidance algorithm used in operating systems. It prevents deadlock by keeping track of the maximum number of resources each process may need and the resources currently allocated to each process. When a process requests additional resources, the Banker's algorithm checks if the resources are available and, if they are, whether granting the request would leave the system in a safe state. If the request can be granted safely, it is granted. Otherwise, the process must wait until more resources become available. The Banker's algorithm uses a safety algorithm to determine whether the system is in a safe state, where it is safe to grant resource requests. This helps to ensure that a system can operate indefinitely without entering a deadlock state.

- Multi Level Queue Scheduling: Multiple-Level Queues Scheduling is a CPU scheduling algorithm that organizes processes into different priority queues. These priority queues are arranged in a hierarchical manner, with higher priority queues being serviced before lower priority queues. When a process is added to the system, it is placed into the highest priority queue that it is eligible for. Processes in the highest priority queue are serviced first, followed by processes in the next highest priority queue, and so on. If a process in a higher priority queue becomes blocked, the CPU is assigned to a process in the next highest priority queue. This scheduling algorithm is useful in real-time systems where certain processes must be completed within a certain time frame.
