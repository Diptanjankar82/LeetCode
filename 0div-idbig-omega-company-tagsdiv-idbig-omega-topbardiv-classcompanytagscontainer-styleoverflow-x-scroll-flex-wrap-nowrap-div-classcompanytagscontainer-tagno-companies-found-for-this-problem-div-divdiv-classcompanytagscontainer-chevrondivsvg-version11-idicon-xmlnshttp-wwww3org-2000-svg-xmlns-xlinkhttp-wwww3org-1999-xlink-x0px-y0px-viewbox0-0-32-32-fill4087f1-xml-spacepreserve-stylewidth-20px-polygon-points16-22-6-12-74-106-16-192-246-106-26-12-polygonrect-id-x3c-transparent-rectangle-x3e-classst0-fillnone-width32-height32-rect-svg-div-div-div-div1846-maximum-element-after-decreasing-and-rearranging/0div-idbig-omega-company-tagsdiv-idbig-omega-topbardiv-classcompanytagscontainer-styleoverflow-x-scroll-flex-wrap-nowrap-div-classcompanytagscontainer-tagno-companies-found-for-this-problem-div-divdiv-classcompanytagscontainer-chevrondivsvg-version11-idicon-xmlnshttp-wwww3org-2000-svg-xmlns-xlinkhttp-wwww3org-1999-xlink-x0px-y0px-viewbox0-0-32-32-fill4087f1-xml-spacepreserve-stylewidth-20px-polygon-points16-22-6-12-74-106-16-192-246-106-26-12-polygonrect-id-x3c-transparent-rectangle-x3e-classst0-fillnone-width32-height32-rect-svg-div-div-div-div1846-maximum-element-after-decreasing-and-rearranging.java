class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int last = 1;
        for (int i = 1; i < arr.length; i++) 
            last = Math.min(arr[i], last+1);
        return last;
    }
}