package InterviewPrep.Arrays;

public class MaxConsecutiVeOnes {
    public static void main(String[] args) {
        int[] a={2,1,1,4,5,6,1,1,1,7,8};
        int max=0;
        int count=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==1) {
                count++;
                max=Math.max(max,count);
            }
            else {
                count=0;
            }
        }
        System.out.println(max);
    }
}
