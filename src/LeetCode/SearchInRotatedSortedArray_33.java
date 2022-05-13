package LeetCode;

public class SearchInRotatedSortedArray_33 {
    public static void main(String[] args) {
        System.out.println(search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
//        System.out.println(search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
//        System.out.println(search(new int[] {1}, 0));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
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
                return binarySearch(nums, target,mid + 1, right);
            }
        } else { // search right
            if (nums[mid] <= target && nums[right] >= target) { // target contains right
                return binarySearch(nums, target, mid + 1, right);
            } else { // target contains left
                return binarySearch(nums, target, left, mid - 1);
            }
        }
    }
}
