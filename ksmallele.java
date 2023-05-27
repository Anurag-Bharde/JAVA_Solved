import java.util.*;
public class ksmallele{
    public static int findKthSmallest(int[] nums, int k) {
        if (k < 1 || k > nums.length) {
            throw new IllegalArgumentException("Invalid k value");
        }
        return quickSelect(nums, 0, nums.length - 1, k - 1);
    }

    private static int quickSelect(int[] nums, int start, int end, int k) {
        if (start == end) {
            return nums[start];
        }

        int pivotIndex = partition(nums, start, end);

        if (pivotIndex == k) {
            return nums[pivotIndex];
        } else if (pivotIndex < k) {
            return quickSelect(nums, pivotIndex + 1, end, k);
        } else {
            return quickSelect(nums, start, pivotIndex - 1, k);
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int pivotIndex = start + new Random().nextInt(end - start + 1);
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, end);

        int i = start;
        for (int j = start; j < end; j++) {
            if (nums[j] <= pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, end);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}