package LeetCode;

import java.util.Arrays;

public class SortColors_75 {
    public static void main(String[] args) {
        sortColors(new int[] {2, 0, 2, 1, 1, 0});
    }

    public static void sortColors(int[] nums) {
        int n0 = 0;
        int n1 = 0;
        int n2 = 0;

        for (int num : nums) {
            if (num == 0) {
                n0++;
            } else if (num == 1) {
                n1++;
            } else {
                n2++;
            }
        }

        int i = 0;
        while (n0 + n1 + n2 > 0) {
            if (n0 > 0) {
                nums[i] = 0;
                n0--;
            } else if (n1 > 0) {
                nums[i] = 1;
                n1--;
            } else {
                nums[i] = 2;
                n2--;
            }
            i++;
        }

        Arrays.stream(nums).forEach(System.out::println);
    }
}
