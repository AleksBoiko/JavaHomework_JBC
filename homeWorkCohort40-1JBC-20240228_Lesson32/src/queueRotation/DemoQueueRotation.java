package queueRotation;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueueRotation {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);
        integerQueue.add(6);

        int k = 3;

        System.out.println("Очередь до ротации: " + integerQueue);
        rotateQueue(integerQueue, k);
        System.out.println("Очередь после " + k + " ротации: " + integerQueue);

    }
    public static void rotateQueue(Queue<Integer> integerQueue, int k){
        if (k < 0){
            System.out.println("Количество ротаций не может быть отрицательным числом");
            return;
        }
        for (int i = 0; i < k; i++) {
            if (integerQueue.isEmpty()){
                System.out.println("Очередь пуста");
                return;
            }
            int lastElement = integerQueue.poll();
            integerQueue.add(lastElement);
        }
    }
}
