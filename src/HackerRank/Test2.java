package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int productsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> products = IntStream.range(0, productsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        long result = findMaxProducts(products);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    /*
     * Complete the 'findMaxProducts' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY products as parameter.
     */

    public static long findMaxProducts(List<Integer> products) {
        // Write your code here

        // O(n^2)

        long max = 0;

        for (int i = products.size() - 1; i >= 0; --i) { // for loop from end of products
            if (i != products.size() - 1 && products.get(i) < products.get(i + 1)) {
                continue;
            }

            long productNum = products.get(i);
            long prev = productNum;

            for (int j = i - 1; j >= 0; --j) { // for loop from end of i
                prev = Math.min(prev - 1, products.get(j));

                productNum += prev;
                if (prev == 1)
                    break;
            }

            max = Math.max(productNum, max);
        }
        return max;

//        return dp(0, 0, products);
    }

    private static long dp(int idx, long prevNum, List<Integer> products) {
        int productsLen = products.size();

        if (idx == productsLen) {
            return 0;
        }

        long currentNum = products.get(idx);
        if (currentNum < prevNum) {
            return 0;
        }

        long res = dp(idx + 1, prevNum, products);

        for (int i = products.get(idx); i < -1; --i) {
            if (i > prevNum) {
                res = Math.max(dp(idx + 1, i, products) + i, res);
            }
            return res;
        }
        return res;
    }
}
