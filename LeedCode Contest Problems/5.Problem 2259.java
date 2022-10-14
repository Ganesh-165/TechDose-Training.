class Solution {
    public String removeDigit(String num, char d) {
        List<String> str=new ArrayList<>();
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)==d){
                str.add(num.substring(0,i)+num.substring(i+1,num.length()));
            }
        } 
        return str.stream().sorted().collect(Collectors.toList()).get(str.size()-1);
    }
}
