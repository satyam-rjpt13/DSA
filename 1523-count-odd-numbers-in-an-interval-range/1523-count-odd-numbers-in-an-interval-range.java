class Solution {
    public int countOdds(int low, int high) {
        int sub = high-low+1;
        if(low%2!=0 && high%2!=0){
            return ((sub/2)+1);
        }else{
            return (sub/2);
        }
        
    }
}