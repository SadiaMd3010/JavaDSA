package InterviewPrep.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] a = {2, 7, 0, 1, 5, 2, 9};
        int max = Integer.MIN_VALUE;
        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);

    }

}
