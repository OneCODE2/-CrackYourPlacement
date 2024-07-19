class Solution {
     public void moveZeroes(int[] nums) {
        int st = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]!=0){
	            int t = nums[i];
	            nums[i]=nums[st];
	            nums[st]=t;
                st++; }}}}

this problem helps to strengthen the fundamental and the logic of coding
