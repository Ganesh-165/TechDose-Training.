class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)return n;
        else {
            for(int i=n+1;;i++){
                if(i%2==0 && i%n==0)return i;
            }
        }
    }
}
