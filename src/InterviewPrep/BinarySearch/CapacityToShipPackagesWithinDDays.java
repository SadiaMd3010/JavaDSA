package InterviewPrep.BinarySearch;

import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int days =5;
        int sum=0;
        int min= Arrays.stream(a).max().orElse(0);
        for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        int max=sum;
        for(int i=min;i<=max;i++) {
            if(daysRequired(a,i)<=days) {
                System.out.println(i);
                return;
            }
        }

    }

    public static int daysRequired(int[] a,int i) {
        int load=0;int day=1;
        for(int j=0;j<a.length;j++) {
            if(load+a[j]>i) {
                day++;
                load=a[j];
            }
            else {
                load+=a[j];
            }
        }
        return day;
    }
}
