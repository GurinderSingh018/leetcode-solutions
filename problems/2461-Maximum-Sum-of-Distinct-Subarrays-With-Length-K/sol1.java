// ==========================================================
// 2461. Maximum Sum of Distinct Subarrays With Length K
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 63 ms (Beats 10%)
// Memory     : 97.2 MB (Beats 90%)
// Link       : https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
// ==========================================================

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if (n<k) return 0L;
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        long ans=0;
        long sum=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
            while(map.get(nums[i])>1){
                map.put(nums[l],map.get(nums[l])-1);
                sum-=nums[l];
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            if((i-l+1)>k){
                sum-=nums[l];
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            if((i-l+1)==k){
                ans=Math.max(sum,ans);
            }
           
        }
        return ans;
    }
}