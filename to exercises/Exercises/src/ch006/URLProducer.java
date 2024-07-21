package ch006;

import java.util.Random;

public class URLProducer extends Thread {
    String producerID;
    int urlCount;
    URLQueue queue;

    Random delay;

    public URLProducer(String id, int count, URLQueue queue) {
        //Don't even create this producer if a negative count was supplied or there' no queue
        if (count <= 0) {
            throw new IllegalArgumentException("Count must be positive");
        }
        if (queue == null) {
            throw new IllegalArgumentException("Shared queue cannot be null");
        }
        producerID = id;
        urlCount = count;
        this.queue = queue;
        delay = new Random();
    }

    public void run() {
        for (int i = 1; i <= urlCount; i++) {
            String url = "https://www.w3schools.com" + i;
            queue.addURL(producerID + " " + url);
            System.out.println(producerID + " produced " + url);
            try {
                Thread.sleep(delay.nextInt(500));
            } catch (InterruptedException ie) {
                System.err.println("Producer " + producerID + " interrupted. Quitting.");
                break;
            }
        }
    }
}
