package ch004.linkedlist_answer;

import java.util.*;

public class LinkedListt {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.addFirst("e");
        list.addLast("f");
        list.add(2, "g");


        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(list);
    }
}
