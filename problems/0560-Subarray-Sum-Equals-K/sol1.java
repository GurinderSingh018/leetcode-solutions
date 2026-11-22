// ==========================================================
// 560. Subarray Sum Equals K
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 26 ms (Beats 39%)
// Memory     : 48.2 MB (Beats 81%)
// Link       : https://leetcode.com/problems/subarray-sum-equals-k/
// ==========================================================

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int i:nums){
            sum+=i;
            ans+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}