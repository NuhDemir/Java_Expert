package ch006.assignment;

public class QueueTest {

    public static void main(String[] args) {
        Queue queue = new Queue();
System.out.println(queue.queue("0"));
System.out.println("Size: " +queue.size());

        System.out.println(queue.queue("1"));
        System.out.println("Size: " +queue.size());

        System.out.println(queue.queue("2"));
        System.out.println("Size: " +queue.size());

        System.out.println(queue.queue("3"));
        System.out.println("Size: " +queue.size());

        System.out.println(queue.queue("4"));
        System.out.println("Size: " +queue.size());

        System.out.println(queue.queue("5"));
        System.out.println("Size: " +queue.size());


        queue.showElements();

        System.out.println("Capacity: " +queue.getCapacity());
        System.out.println("Empty: " + queue.isEmpty());
        
    }
}
