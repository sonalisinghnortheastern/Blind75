class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hSet= new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    String row=board[i][j]+"is in row"+i;
                    String column=board[i][j]+"is in column"+j;
                    String smallMatrix=board[i][j]+"is in row"+i/3+"column"+j/3;
                    if(!hSet.add(row)|| !hSet.add(column)|| !hSet.add(smallMatrix)) return false;
                }
            }
        }
        return true;
    }
}
