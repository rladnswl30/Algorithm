package LeetCode;

public class GameOfLife_289 {
    public static void main(String[] args) {
        //        gameOfLife(new int[][] {{1, 1}, {1, 0}});
        gameOfLife(new int[][] {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}});
    }

    public static void gameOfLife(int[][] board) {
        int rowLen = board.length;
        int colLen = board[0].length;

        int[][] secondGeneration = new int[rowLen][colLen];

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                int aliveCnt = 0;
                if (isAlive(board, i - 1, j - 1)) {
                    aliveCnt++;
                }

                if (isAlive(board, i - 1, j)) {
                    aliveCnt++;
                }

                if (isAlive(board, i - 1, j + 1)) {
                    aliveCnt++;
                }

                if (isAlive(board, i, j - 1)) {
                    aliveCnt++;
                }

                if (isAlive(board, i, j + 1)) {
                    aliveCnt++;
                }

                if (isAlive(board, i + 1, j)) {
                    aliveCnt++;
                }

                if (isAlive(board, i + 1, j - 1)) {
                    aliveCnt++;
                }

                if (isAlive(board, i + 1, j + 1)) {
                    aliveCnt++;
                }

                if (board[i][j] == 0) {
                    secondGeneration[i][j] = (aliveCnt == 3) ? 1 : 0;
                } else {
                    secondGeneration[i][j] = (aliveCnt < 2 || aliveCnt > 3) ? 0 : 1;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            board[i] = secondGeneration[i].clone();
        }

        for (int i = 0; i < secondGeneration.length; i++) {
            for (int j = 0; j < secondGeneration[0].length; j++) {
                System.out.print(secondGeneration[i][j]);
            }
        }
    }

    public static boolean isAlive(int[][] board, int i, int j) {
        if (i >= 0 && i < board.length && j >= 0 && j < board[0].length && board[i][j] == 1) {
            return true;
        }
        return false;
    }
}
