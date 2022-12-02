package Programmers_CodingTest;

import java.util.Arrays;

public class Programmers_땅따먹기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
    }

    private static int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < land[0].length; k++) {
                    if (k != j) {
                        sum = Math.max(sum, land[i - 1][k]);
                    }  else {
                        continue;
                    }
                }
                land[i][j] += sum;
            }
        }
        return 0;
    }
}
