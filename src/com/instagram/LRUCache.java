package com.instagram;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> lruCache = new LRUCache<>(3);
        lruCache.put("Alice", 89);
        lruCache.put("Bob", 79);
        lruCache.put("Charlie", 69);
        lruCache.put("Dux", 59);

        System.out.println(lruCache);
    }
}
