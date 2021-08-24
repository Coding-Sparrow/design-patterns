package self.learning.leetcode;

/**
 *
 * LeetCode :- https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
 *
 * Level - Easy
 *
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * Return k after placing the final result in the first k slots of nums.
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int currentIndex = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[currentIndex+1] = nums[i+1];
                currentIndex = currentIndex+1;
            }
        }
        return currentIndex+1;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2});
    }
}
