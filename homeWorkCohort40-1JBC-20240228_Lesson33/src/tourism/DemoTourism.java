package tourism;

import java.util.LinkedList;
import java.util.Queue;

class TourCollection {
    private Queue<String> collection;
    private int maxSize;

    public TourCollection(int maxSize){
        this.collection = new LinkedList<>();
        this.maxSize = maxSize;
    }
    public void addRequest(String request){
        if (collection.size() < maxSize){
            collection.offer(request);
            System.out.println("Request added: " + request);
        } else {
            System.out.println("Request collection is full. Cannot add request: " + request);
        }
    }
    public void processRequest() {
        if (!collection.isEmpty()) {
            String processedRequest = collection.poll();
            System.out.println("Processing request: " + processedRequest);
        } else {
            System.out.println("Request collection is empty. No request to process.");
        }
    }


}

public class DemoTourism {
    public static void main(String[] args) {
        TourCollection tourCollection = new TourCollection(3);

        tourCollection.addRequest("Honeymoon package");
        tourCollection.addRequest("Adventure tour");
        tourCollection.addRequest("Cultural trip");

        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
    }
}
