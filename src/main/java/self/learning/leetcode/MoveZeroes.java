package self.learning.leetcode;

import java.util.Arrays;

/**
 *
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
 * Solved using two pointer approach one to maintain current Index and one to iterate over loop for non zero elements
 *
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] testCase1 = new int[]{0,1,0,3,12};
        int[] ints = moveZeroes(testCase1);
        Arrays.stream(ints).forEach(number -> System.out.print(number + " "));
        System.out.println();
        int[] testCase2 = new int[]{0,1,0,3,12,0,13,34,1,0,0};
        int[] ints2 = moveZeroes(testCase2);
        Arrays.stream(ints2).forEach(number -> System.out.print(number + " "));
    }

    public static int[] moveZeroes(int[] nums) {
        int currentIndex = 0;
        for(int index=0;index<nums.length;index++){
            if(nums[index] != 0){
                int temp = nums[index];
                nums[index] = nums[currentIndex];
                nums[currentIndex] = temp;
                currentIndex++;
            }
        }
        return nums;
    }
}
