class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i< n ; i++){
            for(int j = i+1 ; j<n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int c = 0 ; c < n ; c++){
        int s = 0;
        int e = n-1;
            while(s < e){
                int temp2 = matrix[c][s];
                matrix[c][s] = matrix[c][e];
                matrix[c][e] = temp2;
                s++;
                e--;
            } 
        }
    }
}
