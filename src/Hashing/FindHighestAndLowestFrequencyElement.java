package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindHighestAndLowestFrequencyElement {
    public static void main(String[] args) {
        int a[]= {2,3,4,5,2,2,3,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i],map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }
        }
//        int min=Integer.MAX_VALUE;
//        int minKey=-1;
//
//        for(Map.Entry<Integer,Integer> hp : map.entrySet()) {
//            int key = hp.getKey();
//            int value= hp.getValue();
//
//            if(value<min) {
//                min=value;
//                minKey=key;
//            }
//
//        }
//        System.out.println("Minimum value is" + minKey+" and value is "+min);
        //if we have many minimum values
        int min=Integer.MAX_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer,Integer> hp : map.entrySet()) {
            int key = hp.getKey();
            int value= hp.getValue();

            if(value<min) {
                min=value;
                al.clear();
                al.add(key);
            }
            else if(value==min) {
                al.add(key);
            }

        }
        System.out.println("Minimum key is " + al+" and value is "+min);

        //using hash array
//                int a[] = {1,1,1,6,6};
//                int maxValue = Arrays.stream(a).max().orElse(0);
//                int hash[]= new int[maxValue+1];
//
//                for(int i=0;i<a.length;i++) {
//                    hash[a[i]]++;
//                }
//
//                int min=Integer.MAX_VALUE;
//                int minElement=-1;
//                for(int i=0;i<hash.length;i++) {
//                    if(hash[i] > 0 && hash[i]<min) {
//                        min=hash[i];
//                        minElement=i;
//                    }
//                }
//                System.out.println("Min value occurs at: "+minElement +" with value "+min);
//            }
//        }


    }

}
