package jcf.map;

/*
LRU Cache implementation
LinkedHashMap removeEldestEntry
hard
Problem statement
Implement an LRU (Least Recently Used) cache with a fixed capacity using LinkedHashMap.
Support get(key) and put(key, value).
When capacity is exceeded, evict the least recently used entry.
Override removeEldestEntry to handle eviction.

Capacity: 3
put(1,A), put(2,B), put(3,C) → cache: [1,2,3]
get(1)              → cache: [2,3,1]
put(4,D)            → evicts 2 → cache: [3,1,4]
 */

public class LRUCacheImplementation {

}
