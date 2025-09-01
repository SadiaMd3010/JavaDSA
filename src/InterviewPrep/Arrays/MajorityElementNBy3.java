package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementNBy3 {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,2,2,2,1};
        int n=8;
        List<Integer> list = new ArrayList<>();
//        for(int i=0;i< arr.length;i++) {
//            if (list.isEmpty() || !list.contains(arr[i])) {
//                int num = arr[i];
//                int count = 1;
//                for (int j = i+1; j < arr.length; j++) {
//                    if (arr[j] == num) {
//                        count++;
//                    }
//                }
//                if (count > n / 3) {
//                    list.add(num);
//                }
//            }
//        }
//        System.out.println(list);

        //Better
        int max = Arrays.stream(arr).max().orElse(0);
        int[] hash = new int[max+1];
        for(int i=0;i<arr.length;i++) {
            hash[arr[i]]++;
            if(hash[arr[i]]>(n/3)) {
                list.add(arr[i]);
            }
            if(list.size()==2) break;
        }
        System.out.println(list);
//        jhjh
//        for(int i=0;i<hash.length;i++) {
//            if(hash[i]>n/3) {
//                System.out.println(i);
//            }
//        }

        //Optimal
//        int ele1=Integer.MIN_VALUE;
//        int ele2=Integer.MIN_VALUE;
//        int count1=0;
//        int count2=0;
//        for(int i=0;i<arr.length;i++) {
//            if(count1==0 && ele2!=arr[i]) {
//                count1=1;
//                ele1=arr[i];
//            }
//            else if(count2==0 && ele1!=arr[i]) {
//                count2=1;
//                ele2=arr[i];
//            }
//            else if(ele1==arr[i]){
//                count1++;
//            }
//            else if(ele2==arr[i]){
//                count2++;
//            }
//            else {
//                count1--;
//                count2--;
//            }
//        }
//        count1=0;
//        count2=0;
//        for(int i=0;i<arr.length;i++) {
//            if(ele1==arr[i]) {
//                count1++;
//            }
//            if(ele2==arr[i]) {
//                count2++;
//            }
//        }
//        if(count1>n/3) {
//            System.out.println(ele1);
//        }
//        if(count2>n/3) {


//            System.out.println(ele2);
//        }

    }
}
