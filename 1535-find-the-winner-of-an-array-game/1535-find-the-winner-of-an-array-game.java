class Solution {
    public int getWinner(int[] arr, int k) {
        
        int ele = 0;
        int i =0;
        int j =1;
        int n = arr.length;
        int count =0;
        
        while(i<n && j<n){
            
            if(arr[i]>arr[j]){
                count++;
                ele = arr[i];
                j++;
            }else{
                i =j;
                count =1;
                ele = arr[j];
                j++;
            }
            
            if(count==k)
               return ele; 
        }
        
        return ele;
    }
}