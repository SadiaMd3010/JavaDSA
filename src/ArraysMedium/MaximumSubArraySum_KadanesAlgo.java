package ArraysMedium;

public class MaximumSubArraySum_KadanesAlgo {
//    public static void main(String[] args) {
//        int a[]= {-2,-3,4,-1,-2,1,5,-3};
//        int sum=0;
//        int max=0;
//        for(int i=0;i<a.length;i++) {
//            sum=sum+a[i];
//
//            if(sum>max) {
//                max=sum;
//            }
//            if(sum<0) {
//                sum=0;
//            }
//        }
//        System.out.println(max);
//    }

    //VArient 2 - To find sunarray that has maxsum
    public static void main(String[] args) {
        int a[]= {-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        int max=0;
        int ansStart=-1;
        int ansEnd=-1;
        int start=0;
        for(int i=0;i<a.length;i++) {
            if(sum==0) {
                start=i;
            }
            sum=sum+a[i];

            if(sum>max) {
                max=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0) {
                sum=0;
            }
        }
        for(int i=ansStart;i<=ansEnd;i++) {
            System.out.println(a[i]);
        }
    }
}
