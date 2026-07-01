class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        char ch = word.charAt(0);
        boolean[][] visited = new boolean[n][m];
        int row = 0;
        int col = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                if(backtrack(board , word , i , j , 0 , visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board , String word , int row , int col , int index , boolean[][] visited) {
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }
        if(index == word.length()-1) {
            return true;
        }
        visited[row][col] = true;
        boolean found = backtrack(board , word , row+1 , col , index+1 , visited)||
        backtrack(board , word , row-1 , col , index+1 , visited) || 
        backtrack(board , word , row , col+1 , index+1 , visited) ||
        backtrack(board , word , row , col-1 , index+1 , visited);
        visited[row][col] = false;

        return found;
    }
}
