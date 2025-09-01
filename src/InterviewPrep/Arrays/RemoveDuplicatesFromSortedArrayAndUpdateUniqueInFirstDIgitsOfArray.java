package InterviewPrep.Arrays;

public class RemoveDuplicatesFromSortedArrayAndUpdateUniqueInFirstDIgitsOfArray {
    public static void main(String[] args) {
        int a[]= {3,3,4,5,5,5,6,7,8};
        int i=0;
        for(int j=1;j<a.length;j++) {
            if(a[j]!=a[i]) {
                a[i+1]  = a[j];
                i++;
            }
        }
        System.out.println(a[i]);
        for(int k=0;k<a.length;k++) {
            System.out.println(a[k]);
        }
    }
}
