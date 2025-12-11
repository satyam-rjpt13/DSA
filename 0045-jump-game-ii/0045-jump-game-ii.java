class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int minJump = 0;
        int currentEnd =0;
        int maxReach = 0;
        for(int i = 0; i < nums.length-1 ; i++){
            maxReach = Math.max(maxReach,i+nums[i]);
            if(i == currentEnd){
                minJump++;
                currentEnd = maxReach;
            }
        }
        return minJump;
        
    }
}