package ArraysMedium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        //BRUTE
//        int a[]= {2,2,3,3,1,2,2};
//        int n = a.length;
//        for(int i=0;i<a.length;i++) {
//            int count =0;
//            for(int j=0;j<a.length;j++) {
//                if(a[i]==a[j]) {
//                    count++;
//                }
//            }
//            if(count>n/2) {
//                System.out.println(a[i]);
//                return;
//            }
//        }
        //BETTER
        int a[]= {2,2,3,3,1,2,2};
        int n=a.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++) {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> hp : map.entrySet()) {
            if(hp.getValue()>n/2) {
                System.out.println(hp.getKey());
            }
        }


    }
}
