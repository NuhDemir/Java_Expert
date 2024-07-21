package ch006;

import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {

        //Create our shared queue object
        URLQueue queue = new URLQueue();

        //now create some producers with unique names aa reference to our queue
        URLProducer producer1 = new URLProducer("Producer 1: ", 2, queue);
        URLProducer producer2 = new URLProducer("Producer 2: ", 4, queue);
// And some consumers with their own names and a reference to our queue
        URLConsumer c1 = new URLConsumer("C1", queue);
        URLConsumer c2 = new URLConsumer("C2", queue);

        System.out.println("Starting...");
        producer1.start();
        producer2.start();
        c1.start();
        c2.start();

        try {
            producer1.join();
            producer2.join();
        } catch (InterruptedException interruptedException) {
            System.err.println("Interrupted waiting for producers to finish");
        }

        c1.setKeepWorking(false);
        c2.setKeepWorking(false);

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException interruptedException) {
            System.err.println("Interrupted waiting for consumer to finish");

        }
        System.out.println("Done");
    }
}