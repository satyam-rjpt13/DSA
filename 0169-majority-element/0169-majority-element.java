class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxFreq = 0;
        int ans = -1;
        for(int key : map.keySet()){
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                ans = key;
            }
        }

        return ans;
        
    }
}