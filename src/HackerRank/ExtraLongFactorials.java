package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * @author woonji.kim
 */
public class ExtraLongFactorials {
	// Complete the extraLongFactorials function below.
	static void extraLongFactorials(int n) {
		BigInteger res = BigInteger.ONE;
		for (int i = n; i > 0; i--) {
			res = res.multiply(BigInteger.valueOf(i));
		}
		System.out.println(res);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		extraLongFactorials(n);

		scanner.close();
	}
}
