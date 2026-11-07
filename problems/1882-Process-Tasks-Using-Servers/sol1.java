// ==========================================================
// 1882. Process Tasks Using Servers
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 235 ms (Beats 61%)
// Memory     : 176.1 MB (Beats 26%)
// Link       : https://leetcode.com/problems/process-tasks-using-servers/
// ==========================================================

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        PriorityQueue<int[]> free= new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
              return a[0]-b[0];
        });
        PriorityQueue<int[]> busy= new PriorityQueue<>((a,b)->{
           if(a[0]!=b[0]) return a[0]-b[0];
            if(a[1]!=b[1]) return a[1]-b[1];
            return a[2]-b[2];
        });
        int n=servers.length;
        for(int i=0;i<n;i++){
            free.add(new int[]{servers[i],i});
        }
        int time=0;
        int ans[]=new int[tasks.length];
        for(int i=0;i<tasks.length;i++){
            time=Math.max(i,time);
            while(!busy.isEmpty() && busy.peek()[0]<=time){
                int arr[]=busy.poll();
                free.offer(new int[]{arr[1],arr[2]});
            }
            if(free.isEmpty()){
                time=busy.peek()[0];
                   while(!busy.isEmpty() && busy.peek()[0]<=time){
                    int arr[]=busy.poll();
                    free.offer(new int[]{arr[1],arr[2]});
                }
            }
            int arr[]=free.poll();
            ans[i]=arr[1];
            busy.offer(new int[]{(time+tasks[i]),arr[0],arr[1]});
        }
        return ans;
    }
}