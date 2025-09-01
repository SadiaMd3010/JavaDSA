package InterviewPrep.Arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int a[]= {2,2,3,3,1,2,2};
        //Brute
//        int n=a.length;
//        for(int i=0;i<a.length;i++) {
//            int num=a[i];
//            int count=1;
//            for(int j=i+1;j<a.length;j++) {
//                if(a[j]==num) {
//                    count++;
//                }
//            }
//            if(count>n/2) {
//                System.out.println(num);
//            }
//        }

        //Better
//        int n=a.length;
//        int max = Arrays.stream(a).max().orElse(0);
//        int hash[] = new int[max+1];
//        for(int i=0;i<a.length;i++) {
//            hash[a[i]]++;
//        }
//        for (int i=1;i<hash.length;i++) {
//            if(hash[i]>n/2) {
//                System.out.println(i);
//            }
//        }

        //Optimal = Moor's Voting Algo
        int n=a.length;
        int element = a[0];
        int count=0;
        for(int i=0;i<a.length;i++) {
            if(count==0) {
                count=1;
                element=a[i];
            }
            else if(a[i]==element) {
                count++;
            }
            else {
                count--;
            }

        }

        //verification
        count=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==element) {
                count++;
            }
            if(count>n/2) {
                System.out.println(element);
            }
        }

    }
}
