class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length ==0){
        return 0;}

        int i=0;
        for(int j =1;j<nums.length ;j++){
            if( nums[j] != nums[i]){
                i++;
            nums[i] =nums[j];
            }
        }
            return i+1;
        }       
    }


Real-Life Implementation
A real-life application of this code can be seen in data processing where unique values are required, such as:

Database Operations: When fetching data from a database, it might contain duplicate entries. This code can help in ensuring that only unique entries are considered for further processing.
Log File Analysis: In analyzing log files, duplicates might need to be removed to get a clear picture of unique events.
User Input Validation: Ensuring that a list of user inputs contains only unique values before processing them.
