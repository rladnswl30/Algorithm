package LeetCode;

public class DivideTwoIntegers_29 {
    public static void main(String[] args) {
        //        System.out.println(Integer.MAX_VALUE);
//        System.out.println(divide(10, 3));
//                System.out.println(divide(7, -3));
        //        System.out.println(divide(-1, -1));
                System.out.println(divide(-2147483648, -1));
//        System.out.println(divide(0, 1));
    }

    public static int divide2(int dividend, int divisor) {
        boolean negative = false;
        if (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0) {
            negative = true;
        }

        long d = Math.abs((long)dividend);
        long v = Math.abs((long)divisor);

        long res = recursive(d, v);

        if (res > Integer.MAX_VALUE) {
            res = negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return negative ? (int)res * -1 : (int)res;
    }

    private static long recursive(long d, long v) {
        if (d < v) {
            return 0;
        }

        long sum = v;
        long multiple = 1;

        while (sum + sum <= d) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + recursive(d - sum, v);
    }

    public static int divide(int dividend, int divisor) {
        boolean negative = false;
        long res = 0;

        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            negative = true;
        }

        long d = Math.abs((long) dividend);
        long v = Math.abs((long) divisor);

        while (d - v >= 0) {
            d -= v;
            res++;
        }

        if (res > Integer.MAX_VALUE) {
            res = negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        if (negative) {
            res *= -1;
        }
        return (int)res;
    }
}
