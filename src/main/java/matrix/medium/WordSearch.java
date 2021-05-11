package matrix.medium;

public class WordSearch {
    public boolean exist(char[][] board, String word) {

        char[] arrayWord = word.toCharArray();
        int indexWord = 0;

        // search in matrix until find first letter
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == arrayWord[indexWord]) {
                    if (j + 1 < board[i].length)
                    searchNextLetterInAdjacentCell(board, i, j);
                }
            }
        }

        boolean flag = true;
        while (flag) {

        }
        return false;
    }

    private void searchNextLetterInAdjacentCell(char[][] board, int i, int j) {
    }
}
