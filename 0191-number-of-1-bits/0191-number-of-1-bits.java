class Solution {
    public int hammingWeight(int n) {
        int set_bit =0;
        while(n!=0){
            set_bit += n%2;
            n = n/2;
        }
        return set_bit;
        
    }
}