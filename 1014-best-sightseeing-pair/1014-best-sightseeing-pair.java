class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = 0;
        int curr = 0;
        for(int a: values){
            max = Math.max(max, curr+a);
            curr = Math.max(curr , a)-1;
        }
        return max;
    }
}