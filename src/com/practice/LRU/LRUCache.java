package com.practice.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, String> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size() > this.capacity;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1, "amod");
        lruCache.put(2, "kunwar");
        lruCache.put(3, "singh");
        lruCache.get(1);
        lruCache.put(4, "hello");

        System.out.println(lruCache);

    }


}
