package InterviewPrep.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static List<Integer> setDifference(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Skip common elements
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                result.add(nums1[i]);
                i++;
            } else {
                result.add(nums2[j]);
                j++;
            }
        }

        // Add remaining elements from nums1
        while (i < nums1.length) {
            result.add(nums1[i++]);
        }

        // Add remaining elements from nums2
        while (j < nums2.length) {
            result.add(nums2[j++]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 6, 6};
        int[] nums2 = {-2, 2, 3, 4, 6};

        List<Integer> diff = setDifference(nums1, nums2);
        System.out.println(diff); // Output: [3, 4, 5, 9]
    }
}
