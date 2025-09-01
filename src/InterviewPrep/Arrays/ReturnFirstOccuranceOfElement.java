package InterviewPrep.Arrays;

public class ReturnFirstOccuranceOfElement {
    public static void main(String[] args) {
        int a[]= {1,5,6,7,2,7,9};
        int element = 7;
        for(int i=0;i<a.length;i++) {
            if(a[i]==element) {
                System.out.println(i);
                break;
            }
        }
    }
}
