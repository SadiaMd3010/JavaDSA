package ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        int a[]={1,2,3,2};
//        for(int i=0;i<a.length;i++) {
//            boolean leader=true;
//            for(int j=i+1;j<a.length;j++) {
//                if(a[j]>a[i]) {
//                    leader=false;
//                    break;
//                }
//            }
//            if(leader) {
//                System.out.println(a[i]);
//            }
//        }

        //OPTIMAL
        int max=Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--) {
            if(a[i]>max) {
                max=a[i];
                System.out.println(a[i]);
            }
        }

        //Another way -optinal
        int b[]={3,5,1,2,0} ;
        int maxi=Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=b.length-1;i>=0;i--) {
            if(b[i]>maxi) {
                al.add(b[i]);
            }
            maxi=Math.max(maxi,b[i]);
        }
        System.out.println(al);
    }
}
