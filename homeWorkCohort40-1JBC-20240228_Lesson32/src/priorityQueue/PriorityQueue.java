package priorityQueue;

import javax.lang.model.element.Element;
import java.util.Queue;

public class PriorityQueue {
    private Queue<Element> queue;

    static class Element implements Comparable<Element>{
        Object value;
        int priority;

        public Element(Object value, int priority) {
            this.value = value;
            this.priority = priority;
        }

        @Override
        public int compareTo(Element o) {
            if (this.priority != o.priority){
                return Integer.compare(o.priority, this.priority);
            } else {
                return 0;
            }
        }
    }
    public  PriorityQueue(){
        queue = new java.util.PriorityQueue<>();
    }
    public void enqueue(Object element, int priority){
        queue.add(new Element(element, priority));
    }
    public Object dequeue(){
        if (queue.isEmpty()){
            return null;
        }
        return queue.poll().value;
    }
}
