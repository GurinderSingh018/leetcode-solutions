// ==========================================================
// 3105. Longest Strictly Increasing or Strictly Decreasing Subarray
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 98%)
// Memory     : 43.6 MB (Beats 94%)
// Link       : https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
// ==========================================================

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int ans=1;
        int i=0;
        int len=1;
        int lens=1;
        while(i<n-1){
           if( nums[i]>nums[i+1]){
              len++;
              ans=Math.max(len,ans);
           }
           else len=1;
           if(nums[i]<nums[i+1]){
              lens++;
              ans=Math.max(lens,ans);
           }
           else lens=1;
           i++;
        }
        return ans;
    }
}