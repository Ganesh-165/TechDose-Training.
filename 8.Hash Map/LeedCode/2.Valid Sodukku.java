class Solution {
    public boolean isValidSudoku(char[][] b) {
        Map<String,Integer> map =new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]!='.'){
                    String row=b[i][j]+"row"+i;
                    String col=b[i][j]+"col"+j;
                    String box=b[i][j]+"box"+i/3+"-"+j/3;
                    map.put(row,map.getOrDefault(row,0)+1);
                    map.put(col,map.getOrDefault(col,0)+1);
                    map.put(box,map.getOrDefault(box,0)+1);
                    if(map.get(row)>1 || map.get(col)>1||map.get(box)>1)return false;
                }
            }
        }
        return true;
    }
}
