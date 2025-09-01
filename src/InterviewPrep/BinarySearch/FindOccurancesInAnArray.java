package InterviewPrep.BinarySearch;

public class FindOccurancesInAnArray {
    public static void main(String[] args) {

        int[] arr={2,4,6,8,8,8,11,13};
        //Brute
//        int target=8,count=0;
//        for(int i=0;i<arr.length;i++) {
//            if(arr[i]==target) {
//                count++;
//            }
//        }
//        System.out.println(count);

        //Optimal
        int first = firstOccurance(arr, arr.length, 8);
        int last=lastOccurance(arr, arr.length, 8);
        int countOfOccurances = last-first+1;
        System.out.println(countOfOccurances);
    }

    public static int firstOccurance ( int[] arr, int n, int target){
        int first = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return first;
    }

    public static int lastOccurance ( int[] arr, int n, int target){
        int low = 0;
        int high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;

    }



}
