class Solution {
    public int countCollisions(String directions) {
        int left =0;
        int right = directions.length()-1;
        int count = 0;
        while(left<=right && directions.charAt(left)=='L'){
            left++;
        }
        while(right>=left && directions.charAt(right)=='R'){
            right--;
        }
        for(int i = left;i<=right;i++){
            if(directions.charAt(i)!='S'){
                count++;
            }
        }
        return count;
    }
}