class Solution {
    public String reverseStr(String s, int k) {
        char arr[] = s.toCharArray();
        int n = arr.length;

        // if(n<k){
        //     int l = 0;
        //     int r = n-1;
        //     while(l<r){
        //         char temp = arr[l];
        //         arr[l] = arr[r];
        //         arr[r]= temp;
        //         l++;
        //         r--;
        //     }
        // }else if(n<2*k && n>=k || n>=2*k){
            for(int i = 0;i<arr.length;i += 2*k){
                int l = i;
                int r = Math.min(i+k - 1 ,arr.length-1);
                while(l<r){
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r]= temp;
                    l++;
                    r--;
                }
            }
        // }
        String str = new String(arr);
        return str;
    }    
}