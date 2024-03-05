package priorityQueue;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue("Task 1", 3);
        priorityQueue.enqueue("Task 2", 4);
        priorityQueue.enqueue("Task 5", 2);
        priorityQueue.enqueue("Task 3", 3);
        priorityQueue.enqueue("Task 4", 3);

        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());


    }
}
