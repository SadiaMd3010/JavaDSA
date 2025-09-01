package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSubArraySumEqualsK {
    public static void main(String[] args) {
        int[] a= {1,2,3,3,1,1,1,4,2,3};
        int k=3;
        int count=0;
        int ansstart=-1;
        int ansend=-1;
//        List<List<Integer>> list= new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            int sum=0;
//            for(int j=i;j<a.length;j++) {
//                sum+=a[j];
//                if(sum==k) {
//                    count++;
//                    List<Integer> ls = new ArrayList<>();
//                    ansstart=i;
//                    ansend=j;
//                    for (int l=ansstart;l<=ansend;l++) {
//                        ls.add(a[l]);
//                    }
//                    list.add(ls);
//                }
//            }
//        }
//        System.out.println(count);
//        System.out.println(list);

        //Optimal
//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
//        int prefixSum=0;
//        for(int i=0;i<a.length;i++) {
//            prefixSum=prefixSum+a[i];
//            int remove=prefixSum-k;
//            if(map.containsKey(remove)) {
//                count+=map.get(remove);
//            }
//
//            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
//        }
//        System.out.println(count);

        //2 pointers
        int i=0;
        int j=0;
        int sum=0;
        while(j<a.length) {
            sum=sum+a[j];
            while(sum>k) {
                sum=sum-a[i];
                i++;
            }
            if(sum==k) {
                count++;
            }
            j++;
        }
        System.out.println(count);
    }
}
