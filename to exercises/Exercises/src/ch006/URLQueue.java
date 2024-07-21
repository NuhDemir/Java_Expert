package ch006;

import java.util.LinkedList;

public class URLQueue {
    LinkedList<String> urlQueue = new LinkedList<>();

    public synchronized void addURL(String url) {
        urlQueue.add(url);
    }

    public synchronized String getURL() {
        if (!urlQueue.isEmpty()) {
            return urlQueue.removeFirst();
        }
        return null;
    }

    public boolean isEmpty() {
        return urlQueue.isEmpty();
    }
}
