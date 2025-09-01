package InterviewPrep.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindNumberThatOccursOnce {
    public static void main(String[] args) {
        int[] arr= {1,2,3,2,1,5,5};
        //Brute
//        for(int i=0;i< arr.length;i++) {
//            int num=arr[i];
//            int count=0;
//            for(int j=0;j<arr.length;j++) {
//                if(arr[j]==num) {
//                    count++;
//                }
//            }
//            if(count==1) {
//                System.out.println(num);
//            }
//        }



        //Hashing
        int max = Arrays.stream(arr).max().orElse(0);
        int hash[] = new int[max+1];
        for(int i=0;i<arr.length;i++) {
            hash[arr[i]]++;
        }
        for(int i=0;i< hash.length;i++) {
            if(hash[i]==1) {
                System.out.println(i);
            }
        }

        //HashMap
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++) {
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//
//        }
//
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            if(entry.getValue()==1){
//                System.out.println(entry.getKey());
//            }
//        }
        //Optimal
//        int xor=0;
//        for(int i=0;i< arr.length;i++) {
//            xor=xor^arr[i];
//        }
//        System.out.println(xor);


    }
}
