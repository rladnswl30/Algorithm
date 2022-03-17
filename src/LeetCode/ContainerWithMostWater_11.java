package LeetCode;

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{3,9,3,4,7,2,12,6}));
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            max = Math.max(Math.min(height[start], height[end]) * (end - start), max);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return max;
    }
}
