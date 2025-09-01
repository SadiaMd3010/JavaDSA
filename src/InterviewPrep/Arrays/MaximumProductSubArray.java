package InterviewPrep.Arrays;

public class MaximumProductSubArray {
    public static void main(String[] args) {
//        int[] arr={2,3,-2,4};
        //Brute
//        int len=0;
//        for(int i=0;i<arr.length;i++) {
//            int mul=1;
//            for(int j=i;j<arr.length;j++) {
//                mul=mul*arr[j];
//                len=Math.max(mul,len);
//            }
//        }
//        System.out.println(len);

        //Optimal
        int[] arr ={1,3,-2,0,4,2};
        int prefix=1;
        int siffix=1;
        int max=0;
        for(int i=0;i< arr.length;i++) {
            if(prefix==0) prefix=1;
            if(siffix==0) siffix=1;
            prefix=prefix*arr[i];
            siffix=siffix*arr[arr.length-i-1];
            max=Math.max(max,Math.max(siffix,prefix));
        }
        System.out.println(max);
    }
}
