package com.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private final int INITIAL_CAPACITY;

    public LRUCache(int initialCapacity) {
        super(initialCapacity,0.75f,true);
        this.INITIAL_CAPACITY = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > INITIAL_CAPACITY;
    }

    public static void main(String[] args) {

        LRUCache<Integer,String> cache = new LRUCache<>(3);

        cache.put(1,"one");
        cache.put(2,"two");
        cache.put(3,"three");

        cache.get(1);
        System.out.println("Cache after accessing key 1: " + cache);
        cache.get(2);

        cache.put(4,"four");
        System.out.println("Cache after adding key 4: "+cache);
    }
}
