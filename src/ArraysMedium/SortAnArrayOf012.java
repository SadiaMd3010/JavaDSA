package ArraysMedium;

import java.util.Arrays;

public class SortAnArrayOf012 {
    public static void main(String[] args) {
        int a[]={2,1,0,1,1,1,0,2};
        int count1=0;
        int count2=0;
        int count0=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==0) {
                count0++;
            }
            else if(a[i]==1){
                count1++;
            }
            else {
                count2++;
            }
        }

        for (int i=0;i<count0;i++) {
            a[i]=0;
        }
        for(int i=count0;i<count0+count1;i++) {
            a[i]=1;
        }
        for(int i=count0+count1;i<a.length;i++) {
            a[i]=2;
        }

        System.out.println(Arrays.toString(a));
    }
}
