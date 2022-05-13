package LeetCode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8)));
//        System.out.println(Arrays.toString(searchRange(new int[] {5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(searchRange(new int[] {1}, 0)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = -1;
        int right = -1;
        int res = binarySearch(nums, target, 0, nums.length - 1);
        if (res > 0 && nums.length == 1 && target == nums[res]) {
            return new int[] {-1, -1};
        }
        if (res > 0 && nums[res - 1] == nums[res]) {
            left = res - 1;
            right = res;
        }
        if (res > 0 && res <= nums.length - 1 && nums[res] == nums[res + 1]) {
            left = res;
            right = res + 1;
        }
        return new int[] {left, right};
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) { // cannot find target
            return -1;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == target) { // find target
            return mid;
        }

        if (nums[left] <= nums[mid]) { // search left
            if (nums[left] <= target && nums[mid] >= target) { // target contains left
                return binarySearch(nums, target, left, mid - 1);
            } else { // target contains right
                return binarySearch(nums, target, mid + 1, right);
            }
        } else { // search right
            if (nums[mid] <= target && nums[right] >= target) { // target contains right
                return binarySearch(nums, target, mid + 1, right);
            } else { // target contains left
                return binarySearch(nums, target, left, mid - 1);
            }
        }
    }

    //    public static void search(int[] nums, int target, int left, int right, int[] res) {
    //        if (left > right) {  // cannot find target
    //            return;
    //        }
    //
    //        int mid = (left + right) / 2;
    //
    //        if (nums[mid] == target) {  // find target
    //            res[0] = res[0] == -1 ? mid : Math.min(res[0], mid);
    //            res[1] = Math.max(res[1], mid);
    //
    //            if (mid - 1 >= 0 && nums[mid - 1] == target) { // search left
    //                search(nums, target, left, mid - 1, res);
    //            } else { // search right
    //                search(nums, target,mid + 1, right, res);
    //            }
    //        }
    //
    //        if (nums[mid] > target) { // search left
    //            search(nums, target, left, mid - 1, res);
    //        } else { // search right
    //            search(nums, target, mid + 1, right, res);
    //        }
    //    }
}
