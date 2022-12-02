package LeetCode;

public class FindTheDuplicateNumber_287 {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1, 3, 4, 2, 2}));
    }

    public static int findDuplicate(int[] nums) {
        //        for (int i = 0; i < nums.length; i++) {
        //            for (int j = i + 1; j < nums.length; j++) {
        //                if (nums[i] == nums[j]) {
        //                    return nums[j];
        //                }
        //            }
        //        }
        //        return -1;

        boolean[] visit = new boolean[nums.length];

        for (int num : nums) {
            if (visit[num]) {
                return num;
            } else {
                visit[num] = true;
            }
        }

        return 0;
    }
}
