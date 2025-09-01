package BinarySearch;

public class FindHowManyTimesArrayIsRotated {
        public static void main(String[] args) {
            int a[] = {7, 8, 9, 2, 3, 4};
            int low = 0;
            int high = a.length - 1;
            int min = Integer.MAX_VALUE;
            int index = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (a[low] <= a[mid]) {
                    if (a[low] < min) {
                        index = low;
                        min = a[low];
                    }
                    low = mid + 1;
                }
                else{
                    if(a[mid]<min) {
                        index = mid;
                        min=a[mid];
                    }
                    high = mid - 1;
                }
            }
            System.out.println(index);
        }

}
