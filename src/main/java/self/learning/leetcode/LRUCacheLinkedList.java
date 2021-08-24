package self.learning.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheLinkedList {
    int capacity;
    Map<Integer,Integer> cacheMap;
    LinkedList<Integer> cacheQueue;
    int cacheCount;

    public LRUCacheLinkedList(int capacity) {
        cacheMap = new HashMap<>();
        cacheQueue = new LinkedList<>();
        this.capacity = capacity;
        cacheCount = 0;

    }

    public int get(int key) {
        if (!cacheMap.containsKey(key)){
            return -1;
        }
        cacheQueue.removeLastOccurrence(key);
        cacheQueue.addLast(key);
        return cacheMap.get(key);
    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)){
            cacheMap.put(key,value);
            cacheQueue.removeLastOccurrence(key);
            cacheQueue.addLast(key);
            return;
        }
        if (cacheCount == capacity){
            Integer temp = cacheQueue.poll();
            cacheMap.remove(temp);
            cacheCount--;
        }
        cacheCount++;
        cacheQueue.addLast(key);
        cacheMap.put(key,value);
    }

    public static void main(String[] args) {
        LRUCacheLinkedList lRUCacheLinkedList = new LRUCacheLinkedList(2);
        System.out.println("Data : " + lRUCacheLinkedList.get(2));    // return -1
        lRUCacheLinkedList.put(2,6);
        System.out.println("Data : " + lRUCacheLinkedList.get(1));    // return -1
        lRUCacheLinkedList.put(1,5);
        lRUCacheLinkedList.put(1,2);
        System.out.println("Data : " + lRUCacheLinkedList.get(1)); //return 2
        System.out.println("Data : " + lRUCacheLinkedList.get(2)); //return 6
    }
}
