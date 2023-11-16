class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int reachable=0;
        int count=0;
        int cur=0;

        for(int i=0;i<n-1;i++){
            reachable=Math.max(reachable,nums[i]+i);
            if(cur==i){
                cur=reachable;
                count++;
            }
           
        }
        return count;
    }
}