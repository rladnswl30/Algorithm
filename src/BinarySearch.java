/**
 * @author woonji.kim
 */
public class BinarySearch {
	public static void main(String[] args) {
		solution(new int[]{3, 19, 34, 50, 87}, 19);
	}

	public static void solution(int[] arr, int key) {
		int left = 0; // first
		int right = arr.length - 1; // end
		int mid;

		while (left <= right) {
			mid = (left + right) / 2; // mid

			if (key == arr[mid]) {
				System.out.println("find... mid idx: " + mid);
				break;
			}

			if (key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
	}
}
