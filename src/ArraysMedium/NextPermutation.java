package ArraysMedium;

import java.util.Arrays;

public class NextPermutation {
    public static void reverse(int a[],int start,int end) {
        while(start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int a[]={2,1,5,4,3,0,0};
        int n=a.length;
        int index=-1;
        for(int i=n-2;i>=0;i--) {
            if(a[i]<a[i+1]) {
                index=i;
                break;
            }
        }
        if(index==-1) {
            reverse(a,0,n-1);
        }

        for(int i=n-1;i>=index;i--) {
            if(a[i]>a[index]) {
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                break;
            }
        }

        reverse(a,index+1,n-1);
        System.out.println(Arrays.toString(a));

    }
}
