class Solution {
    public int convertTime(String str1, String str2) {
        int currmin=Integer.parseInt(str1.substring(0,2))*60+Integer.parseInt(str1.substring(3));
        int cormin=Integer.parseInt(str2.substring(0,2))*60+Integer.parseInt(str2.substring(3))-currmin;
        int cov[]={1,5,15,60};
        int count=0,i=3;
        while(cormin>0){
            if(cormin<cov[i])i--;
            else{
                cormin-=cov[i];
                count++;
            }
        }
        return count;
    }
}
