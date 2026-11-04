// ==========================================================
// 45. Jump Game II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 46.4 MB (Beats 98%)
// Link       : https://leetcode.com/problems/jump-game-ii/
// ==========================================================

class Solution {
    
    public int jump(int[] nums) {
        int n=nums.length;
       int jumps=0; 
       int farth=0;
       int curr=0;
        for(int i=0;i<n-1;i++){
            farth=Math.max(farth,i+nums[i]);
            if(i==curr){
                jumps++;
                curr=farth;
            }
        }
        return jumps;
       
    }
    
}