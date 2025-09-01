package InterviewPrep.BinarySearch;

import java.util.Arrays;

public class AllocateBooksToStudents {
    public static void main(String[] args) {
        int[] a={25,46,28,49,24};
        int students=4;
        int sum=0;
        int min = Arrays.stream(a).max().orElse(0);
        for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        int max=sum;
        //Brute
//        for(int i=min;i<=max;i++) {
//            if(booksAllocated(a,i)<=students) {
//                System.out.println(i);
//                return;
//            }
//        }

        //Optimal
        System.out.println(allocateBooks(a,students));



    }

    public static int allocateBooks(int[] a, int students) {
        int sum=0;int ans=-1;
        int min = Arrays.stream(a).max().orElse(0);
        for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        int low=min,high=sum;
        while(low<=high) {
            int mid=(low+high)/2;
            if(booksAllocated(a,mid)<=students) {
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        return ans;
    }

    public static int booksAllocated(int[] a,int i) {
        int last = 0; int studentCount=1;
        for(int j=0;j<a.length;j++) {
            if(last+a[j]<=i) {
                last+=last+a[j];
            }
            else {
                studentCount++;
                last=a[j];
            }
        }
        return studentCount;
    }
}
