// ==========================================================
// 33. Search in Rotated Sorted Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.5 MB (Beats 61%)
// Link       : https://leetcode.com/problems/search-in-rotated-sorted-array/
// ==========================================================

class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int st=0;
        int en=n-1;
        while(st<=en){
            int mid=st+(en-st)/2;
            if(nums[mid]==target) return mid;
            if(nums[st]<=nums[mid]){
                if(nums[mid]>target && nums[st]<=target){
                   en=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[en])
                    st=mid+1;
                else
                    en=mid-1;
            }
        }
        return -1;
    }
}