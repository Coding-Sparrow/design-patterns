package self.learning.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/unique-paths/
 * Dynamic Programming
 */
public class GridTraveller {
    static Map<String,Integer> memoizedPath = new HashMap<>();

    public static int uniquePaths(int m, int n) {
        String uniquePath = m + ","+n;
        if(memoizedPath.containsKey(uniquePath)) return memoizedPath.get(uniquePath);
        if(m == 0 || n == 0) return 0;
        if(m == 1 && n ==1 ) return 1;
        memoizedPath.put(uniquePath,uniquePaths(m-1,n)+uniquePaths(m,n-1));
        return memoizedPath.get(uniquePath);
    }

    public static void main(String[] args) {
        System.out.println("3,7 = "+uniquePaths(3,7)); //Output: 28
        System.out.println("3,2 = "+uniquePaths(3,2)); //Output: 3
        System.out.println("7,3 = "+uniquePaths(7,3)); //Output: 28
        System.out.println("3,3 = "+uniquePaths(3,3)); //Output: 6
        System.out.println("1,1 = "+uniquePaths(1,1)); //Output: 1
        System.out.println("3,0 = "+uniquePaths(3,0)); //Output: 0
    }
}
