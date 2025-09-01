package InterviewPrep.Arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int a[]= {1,2,3,5,6,7};
        for(int i=0;i<a.length-1;i++) {
            if(a[i]<=a[i+1]) {
                System.out.println("sorted");
            }
            else {
                System.out.println("Not sorted");
            }
        }
    }

}
