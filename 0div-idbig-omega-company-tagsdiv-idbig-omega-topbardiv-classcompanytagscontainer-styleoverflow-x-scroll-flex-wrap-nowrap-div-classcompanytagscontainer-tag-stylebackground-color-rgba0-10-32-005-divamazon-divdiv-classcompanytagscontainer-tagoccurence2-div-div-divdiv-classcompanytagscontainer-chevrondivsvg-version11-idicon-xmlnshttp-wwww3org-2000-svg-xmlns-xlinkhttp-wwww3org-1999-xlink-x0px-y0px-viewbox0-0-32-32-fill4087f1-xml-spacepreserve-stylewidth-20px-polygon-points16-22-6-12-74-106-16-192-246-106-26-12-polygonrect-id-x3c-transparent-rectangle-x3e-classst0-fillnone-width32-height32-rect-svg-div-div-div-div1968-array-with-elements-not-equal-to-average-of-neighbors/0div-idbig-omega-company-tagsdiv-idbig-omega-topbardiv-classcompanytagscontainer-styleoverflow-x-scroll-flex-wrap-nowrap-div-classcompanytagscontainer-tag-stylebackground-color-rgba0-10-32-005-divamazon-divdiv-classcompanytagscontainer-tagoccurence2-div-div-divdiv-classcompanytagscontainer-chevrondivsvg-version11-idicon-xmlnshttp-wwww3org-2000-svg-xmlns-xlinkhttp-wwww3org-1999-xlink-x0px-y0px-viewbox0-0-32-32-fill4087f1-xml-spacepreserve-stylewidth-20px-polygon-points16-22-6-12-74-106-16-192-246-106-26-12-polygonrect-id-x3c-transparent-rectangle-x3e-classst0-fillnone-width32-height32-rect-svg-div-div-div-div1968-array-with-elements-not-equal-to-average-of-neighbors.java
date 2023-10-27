class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] ans = new int[n];
        int i = 0, j = n-1, k = 0;
        while(i<=j) {
            if(k<n)
                ans[k++] = nums[i++];
            if(k<n)
                ans[k++] = nums[j--];
        }
        return ans;
    }
}