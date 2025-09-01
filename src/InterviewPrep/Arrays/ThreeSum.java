package InterviewPrep.Arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
//        Set<List<Integer>> set = new HashSet<>();
//        List<Integer> temp=new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            for(int j=i+1;j<a.length;j++) {
//                for(int k=j+1;k<a.length;k++) {
//                    if(a[i]+a[j]+a[k]==0) {
//                        temp = Arrays.asList(a[i],a[j],a[k]);
//                        Collections.sort(temp);
//                        set.add(temp);
//                    }
//                }
//            }
//        }
//        System.out.println(set);

        //Better
//        Set<List<Integer>> ans = new HashSet<>();
//        for(int i=0;i<a.length;i++) {
//            Set<Integer> set = new HashSet<>(Set.of());
//            for(int j=i+1;j<a.length;j++) {
//                int k= -(a[i]+a[j]);
//                if(set.contains(k)) {
//                   List<Integer> temp = Arrays.asList(a[i],a[j],k);
//                   Collections.sort(temp);
//                   ans.add(temp);
//                }
//                set.add(a[j]);
//            }
//        }
//        System.out.println(ans);

        //Optimal
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++) {
            if(i>0 && a[i]==a[i-1]) {
                continue;
            }
            int j=i+1;
            int k=a.length-1;
            while(j<k) {
                int sum=a[i]+a[j]+a[k];
                if(sum<0) {
                    j++;
                }
                else if(sum>0) {
                    k--;
                }
                else {
                    List<Integer> list = Arrays.asList(a[i],a[j],a[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while(j<k && a[j]==a[j-1]) j++;
                    while (j<k && a[k]==a[k+1]) k--;
                }
            }
        }
        System.out.println(ans);

    }
}