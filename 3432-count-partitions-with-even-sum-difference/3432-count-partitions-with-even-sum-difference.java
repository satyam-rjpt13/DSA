class Solution {
    public int countPartitions(int[] nums) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        if(prefix[prefix.length-1] %2==0){
            return nums.length-1;
        }
        
        return 0;
    }
}