// ==========================================================
// 283. Move Zeroes
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 95%)
// Memory     : 47.3 MB (Beats 78%)
// Link       : https://leetcode.com/problems/move-zeroes/
// ==========================================================

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int st=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[st++]=nums[i];
            }
        }
        for(int i=st;i<n;i++) nums[i]=0;
    }
}