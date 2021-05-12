package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @author woonji.kim
 */
public class BirthdayCakeCandles {
	public static int birthdayCakeCandles(List<Integer> candles) {
		candles.sort(Collections.reverseOrder());
		int cnt = 0;
		int cmp = candles.get(0);
		for (Integer candle : candles) {
			if (cmp == candle) {
				cnt++;
			}

			if (cmp > candle) {
				break;
			}
		}

		return cnt;
	}

}

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
									  .map(Integer::parseInt)
									  .collect(toList());

		int result = BirthdayCakeCandles.birthdayCakeCandles(candles);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
