package InterviewPrep.Arrays;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int arr[]= {1,0,-1,0,-2,2};
//        Set<List<Integer>> set = new HashSet<>();
//        for(int i=0;i< arr.length;i++) {
//            for(int j=i+1;j< arr.length;j++) {
//                for(int k=j+1;k<arr.length;k++) {
//                    for(int l=k+1;l< arr.length;l++) {
//                        if(arr[i]+arr[j]+arr[k]+arr[l]==0) {
//                            List<Integer> list= Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
//                            Collections.sort(list);
//                            set.add(list);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(set);

        //Better - hashing
//        int target =0;
//        Set<List<Integer>> ans = new HashSet<>();
//        for(int i=0;i< arr.length;i++) {
//            for(int j=i+1;j<arr.length;j++) {
//                Set<Integer> set = new HashSet<>();
//                for(int k=j+1;k<arr.length;k++) {
//                    int l=target-(arr[i]+arr[j]+arr[k]);
//                    if(set.contains(l)) {
//                        List<Integer> list = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
//                        Collections.sort(list);
//                        ans.add(list);
//                    }
//                    set.add(arr[k]);
//                }
//            }
//        }
//        System.out.println(ans);

        //Optimal
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i< arr.length;i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if(j>i+1 && arr[j] == arr[j-1]) continue;
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum < 0) {
                        k++;
                    } else if (sum > 0) {
                        l--;
                    } else {
                        List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        ans.add(list);
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l + 1]) l--;
                    }
                }

            }
        }
        System.out.println(ans);
    }
}
