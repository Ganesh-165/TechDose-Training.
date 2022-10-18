class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                pq.add(matrix[i][j]);
            }
        }
        for(int i=0;i<k-1;i++)pq.poll();
        return pq.peek();
    }
}
