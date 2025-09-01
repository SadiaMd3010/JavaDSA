package InterviewPrep.Arrays;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 9, 1, 2, 4, 8, 9, 8};
        int k = 3;
        Arrays.sort(arr);
        int count=1;
        int largest = arr[arr.length-1];
        for(int i= arr.length-2;i>=0;i--) {
            if(arr[i]!=largest) {
                largest = arr[i];
                count++;
            }
            if(count==k) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
