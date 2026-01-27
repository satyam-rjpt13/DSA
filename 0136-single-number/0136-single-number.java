class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> name:map.entrySet()){
            if(name.getValue() ==1){
                return name.getKey();
            }
        }
        return -1;
    }
}