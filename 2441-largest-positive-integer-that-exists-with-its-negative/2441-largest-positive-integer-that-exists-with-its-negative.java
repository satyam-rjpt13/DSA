class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num<0){
                set.add(num);
            }
        }
        Arrays.sort(nums);
        for(int i = nums.length-1 ; i>=0 ; i--){
            if(set.contains(-nums[i])){
                return nums[i];
            }
        }
        return -1;
        
    }
}