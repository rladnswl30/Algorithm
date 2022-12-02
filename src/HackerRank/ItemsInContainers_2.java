import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ItemsInContainers_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int startIndicesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> startIndices = IntStream.range(0, startIndicesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int endIndicesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> endIndices = IntStream.range(0, endIndicesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> result = numberOfItems(s, startIndices, endIndices);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"))
                + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        int n = s.length();
        int[] dp = new int[n];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                dp[i] = count;
            } else {
                count++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < startIndices.size(); i++) {
            int start = startIndices.get(i)-1;
            int end = endIndices.get(i)-1;

            while (s.charAt(start) != '|') start++;
            while (s.charAt(end) != '|') end--;
            if (start < end) {
                ans.add(dp[end] - dp[start]);
            } else {
                ans.add(0);
            }
        }
        return ans;
    }
}
