package InterviewPrep.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
//        int a[]= {8,7,1,4,5,7,8};
//        int largest = a[0];
//        int secondLargest =Integer.MIN_VALUE;
//        for(int i=1;i<a.length;i++) {
//            if(a[i]>largest) {
//                largest=a[i];
//            }
//        }
//        for(int i=0;i<a.length;i++) {
//            if(a[i]>secondLargest && a[i]!=largest) {
//                secondLargest=a[i];
//            }
//        }
//        System.out.println(secondLargest);
//    }
        int a[] = {4, 3, 1, 4, 5, 6, 8,7};
        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++) {
            if(a[i]>largest) {
                secondLargest = largest;
                largest=a[i];
            }
             else if(a[i]<largest && a[i]>secondLargest) {
                 secondLargest=a[i];
            }

        }
        System.out.println(secondLargest);

    }

}
