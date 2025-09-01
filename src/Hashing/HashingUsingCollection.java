package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashingUsingCollection {
    public static void main(String[] args) {
        int a[]= {5,8,2,0,2,8,2,2,1,2,4,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i],map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> hp : map.entrySet()) {
            System.out.println(hp.getKey() +" - "+ hp.getValue());
        }

        //String
        String s="aaabaabbcbc";
        HashMap<Character,Integer> mapp= new HashMap<>();
        for(int i=0;i<s.length();i++) {
            mapp.put(s.charAt(i),mapp.getOrDefault(s.charAt(i),0)+1);

//            if(mapp.containsKey(s.charAt(i))) {
//                mapp.put(s.charAt(i),mapp.get(s.charAt(i))+1);
//            }
//            else {
//                mapp.put(s.charAt(i),1);
//            }
        }

        for(Map.Entry<Character,Integer> hpp : mapp.entrySet()) {
            System.out.println(hpp.getKey() +" - "+ hpp.getValue());
        }

    }
}
