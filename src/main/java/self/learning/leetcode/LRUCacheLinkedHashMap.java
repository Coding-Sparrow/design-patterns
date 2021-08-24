package self.learning.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU Cache
 * remove least recently used data from cache
 */
public class LRUCacheLinkedHashMap extends LinkedHashMap<Integer,Integer> {

    int capacity;
    LRUCacheLinkedHashMap(int capacity){
        super(capacity,0.75f,true);
        this.capacity =capacity;
    }

    public int get(int key) {
        Integer value = super.get(key);
        return value == null ? -1 : value;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCacheLinkedHashMap lRUCacheLinkedHashMap = new LRUCacheLinkedHashMap(2);
        lRUCacheLinkedHashMap.put(1, 1); // cache is {1=1}
        lRUCacheLinkedHashMap.put(2, 2); // cache is {1=1, 2=2}
        System.out.println("Data : " + lRUCacheLinkedHashMap.get(1));    // return 1
        lRUCacheLinkedHashMap.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println("Data : "+ lRUCacheLinkedHashMap.get(2));    // returns -1 (not found)
        lRUCacheLinkedHashMap.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println("Data : "+ lRUCacheLinkedHashMap.get(1));    // return -1 (not found)
        System.out.println("Data : "+ lRUCacheLinkedHashMap.get(3));    // return 3
        System.out.println("Data : "+ lRUCacheLinkedHashMap.get(4));    // return 4
    }
}
