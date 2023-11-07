//Brute - force
// Tc -  O(n^2)
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         for(int i =0; i<n;i++){
//             int count =1;

//             for(int j =i+1;j<n;j++){
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }

//                 if(count > n/2){
//                     return nums[i];
//                 }
        
//             }
//         }
//         return nums[0];
           
//     }
// }



           // Moore’s Voting Algorithm:
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
         int count =0;
         int ele = 0;
         for(int i =0; i<n;i++){
             if(count == 0){
                 count =1;
                 ele = nums[i];
             } else if(ele == nums[i]){
                 count++;
             }else{
                 count--;
             }
         }

             int count1 =0;
             for(int j =0; j<n;j++){
                 if(nums[j] == ele){
                     count1++;
                 }
             }
                 if(count1 > nums.length/2) return ele;
                 return -1;
             }
         }