package ArraysMedium;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int a[]= {-2,-3,4,-1,-2,1,5,-3};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            int sum=0;
            for(int j=i;j<a.length;j++) {
                sum=sum+a[j];
                max=Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
}
