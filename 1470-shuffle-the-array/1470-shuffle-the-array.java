class Solution {
    public int[] shuffle(int[] nums, int n) {
        int fh =0;
        int sh =n;
        int[] arr = new int[nums.length];
        int i = 0;
        while(fh<n){
            arr[i] = nums[fh];
            i++;
            arr[i] = nums[sh];
            fh++;
            sh++;
            i++;
        }
        return arr;
    }
}