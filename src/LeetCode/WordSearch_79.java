package LeetCode;

public class WordSearch_79 {
    public static void main(String[] args) {
//        System.out.println(exist(new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
        System.out.println(exist(new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE"));
        System.out.println(exist(new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));
    }

    public static boolean exist(char[][] board, String word) {
        // 1 <= word.length <= 15
        if (word.length() < 1 || word.length() > 15) {
            return false;
        }

        // 1 <= m, n <= 6
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (backtracking(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean backtracking(char[][] board, String word, int i, int j, int idx, boolean[][] visited) {
        if (idx == word.length()) {
            return true;
        }

        if (i < 0 || j < 0) {
            return false;
        }

        int m = board.length;
        int n = board[0].length;
        if (i >= m || j >= n ) {
            return false;
        }

        if (visited[i][j]) {
            return false;
        }

        if (word.charAt(idx) != board[i][j]) {
            return false;
        }

        // 방문했으므로 true
        visited[i][j] = true;

        // 위, 아래, 왼쪽, 오른쪽 방문
        boolean res = backtracking(board, word, i - 1, j, idx + 1, visited) || backtracking(board, word, i + 1, j, idx + 1, visited)
            || backtracking(board, word, i, j - 1, idx + 1, visited) || backtracking(board, word, i, j + 1, idx + 1, visited);

        // 하나라도 방문 못했으면 false
        if (res == false) {
            visited[i][j] = false;
        }
        return res;
    }
}
