// ==========================================================
// 2567. Minimum Score by Changing Two Elements
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 18 ms (Beats 89%)
// Memory     : 59.2 MB (Beats 86%)
// Link       : https://leetcode.com/problems/minimum-score-by-changing-two-elements/
// ==========================================================

class Solution {
    public int minimizeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n<=3) return 0;
        return Math.min(nums[n-2]-nums[1],Math.min(nums[n-3]-nums[0],nums[n-1]-nums[2]));
    }
}