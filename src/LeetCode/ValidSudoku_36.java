package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ValidSudoku_36 {
    public static void main(String[] args) {
        System.out.println(isValidSudoku(new char[][] {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
            , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
            , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
            , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
            , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
            , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
            , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
            , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
            , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
    }

    public static boolean isValidSudoku(char[][] board) {
        System.out.println("================ row/col ================");
        for (int i = 0; i < 9; i++) {

            List<Character> rowCheck = new ArrayList<>();
            List<Character> colCheck = new ArrayList<>();

            for (int j = 0; j < 9; j++) {

                char row = board[i][j];
                char col = board[j][i];

                // row
                if (row != '.' && rowCheck.contains(row)) {
                    System.out.println("invalid: " + row);
                    return false;
                } else {
                    rowCheck.add(row);
                }

                // col
                if (col != '.' && colCheck.contains(col)) {
                    System.out.println("invalid: " + col);
                    return false;
                } else {
                    colCheck.add(col);
                }
            }
        }

        System.out.println("================ grid ================");
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

                List<Character> check = new ArrayList<>();

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        char gridNum = board[i + k][j + l];
                        if (gridNum != '.' && check.contains(gridNum)) {
                            System.out.println("invalid: " + gridNum);
                            return false;
                        } else {
                            check.add(gridNum);
                        }
                    }
                }
            }
        }
        return true;
    }
}
