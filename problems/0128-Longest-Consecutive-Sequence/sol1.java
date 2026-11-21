// ==========================================================
// 128. Longest Consecutive Sequence
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 31 ms (Beats 68%)
// Memory     : 94.9 MB (Beats 68%)
// Link       : https://leetcode.com/problems/longest-consecutive-sequence/
// ==========================================================

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans=0;
        for(int i : set){
            int c=0;
            if(!set.contains(i-1)){
                c=1;
                int n=i;
                 while(set.contains(n+1)){
                    c++;
                    n++;
                 }
                 ans=Math.max(ans,c);
            }
        }
        return ans;

    }
}