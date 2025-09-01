package ArraysEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindElementThatAppearsOnce {
    public static void main(String[] args) {
        //BRUTE
//        int a[]={1,1,2,3,3,3,4,4};
//        for(int i=0;i<a.length;i++) {
//            int num=a[i];
//            int count=0;
//            for(int j=0;j<a.length;j++) {
//                if(a[j]==num) {
//                    count++;
//                }
//            }
//            if(count==1) {
//                System.out.println(num);
//            }
//        }

        //BETTER - Hashing
//        int a[]={1,1,2,3,3,3,4,4};
//        int maxValue= Arrays.stream(a).max().orElse(0);
//        int hash[]=new int[maxValue+1];
//        for(int i=0;i<a.length;i++) {
//            hash[a[i]]++;
//        }
//        for(int i=0;i<hash.length;i++) {
//            if(hash[i]==1) {
//                System.out.println(i);
//            }
//        }

        //BETTER
//        int a[]={1,1,2,3,3,3,4,4};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<a.length;i++) {
//             map.put(a[i],map.getOrDefault(a[i],0)+1);
//            }
//        for(Map.Entry<Integer,Integer> hp : map.entrySet()) {
//            if(hp.getValue()==1) {
//                System.out.println(hp.getKey());
//            }
//        }

        //OPTIMAL
        int a[]={1,1,2,3,3,4,4}; //works only when array has 2 elements and one unique element
        int XOR=0;
        for(int i=0;i<a.length;i++) {
            XOR=XOR^a[i];
        }
        System.out.println(XOR);


    }
}
