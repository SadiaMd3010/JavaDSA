package ArraysEasy;

import java.util.Arrays;

public class SecondLargestElementInArray {
    //OPTIMAL
    public static void main(String[] args) {
        int a[]={4,3,5,1,2};
        int largest=a[0];
        int secondlargest=-1;
        for(int i=0;i<a.length;i++) {
            if(a[i]>largest) {
                secondlargest=largest;
                largest=a[i];
            }

            else if(a[i]>secondlargest && a[i]!=largest) {
                secondlargest=a[i];
            }
        }
        System.out.println(secondlargest);
    }
    //BRUTE
//    public static void quickSort(int[] a, int low,int high) {
//        if(low<high) {
//            int partitionIndex= partition(a,low,high);
//            quickSort(a,low,partitionIndex-1);
//            quickSort(a,partitionIndex+1,high);
//        }
//    }
//
//    public static int partition(int[] a,int low,int high) {
//        int i=low;
//        int j=high;
//        int pivot=a[low];
//        while(i<j) {
//            while(i<high && a[i]<=pivot) {
//                i++;
//            }
//            while ((j>low && a[j]>pivot)) {
//                j--;
//            }
//            if(i<j) {
//                int temp=a[i];
//                a[i]=a[j];
//                a[j]=temp;
//            }
//        }
//        int temp=a[low];
//        a[low]=a[j];
//        a[j]=temp;
//
//        return j;
//    }
//    public static void main(String[] args) {
//        int a[]= {3,2,1,5,2};
//        //BRUTE
//        quickSort(a,0,a.length-1);
//        System.out.println(Arrays.toString(a));
//        int largest=a[a.length-1];
//        int secondLargest=-1;
//        for(int i=a.length-2;i>=0;i--) {
//            if(a[i]!=largest) {
//                secondLargest=a[i];
//                break;
//            }
//        }
//        System.out.println(secondLargest);
//}

    //BETTER
//    public static void main(String[] args) {
//        int a[]={5,3,4,1,2};
//        int largest=a[0];
//        for(int i=0;i<a.length;i++) {
//            if(a[i]>largest) {
//                largest=a[i];
//            }
//        }
//        System.out.println(largest);
//
//        int secondlargest=-1;
//        for(int i=0;i<a.length;i++) {
//            if(a[i]>secondlargest && a[i]!=largest) {
//                secondlargest=a[i];
//            }
//        }
//        System.out.println(secondlargest);
//    }




}
