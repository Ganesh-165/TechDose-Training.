class Solution {
     public String reverse(String s){
        String rev = "";
        for(int i = 0; i<s.length();i++){
            rev = s.charAt(i) + rev ;
        }
        return rev;
    }
    
    public String largestPalindromic(String num) {
        int[] arr = new int[10];
        
        for(int i = 0; i<num.length() ;i++){
            int n = num.charAt(i) - '0';
            arr[n] += 1;
        }
        
        String ans = "";
        for(int i = 9; i>0 ; i--){

            while (arr[i] > 1){
                ans += Integer.toString(i);                        

                arr[i]-=2;
            }

        }
        while(arr[0] > 1 && ans != ""){
            ans += '0';
            arr[0]-=2;
        }
        String rev = reverse(ans);

        for(int i = 9;i>=0;i--){
            if(arr[i] == 1){
                ans += Integer.toString(i);
                break;
            }
        }
        return ((ans+rev).equals(""))?"0":ans+rev;
    }
}
