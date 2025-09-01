package ArraysEasy;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,3,3};
        int b[]={1,1,2,2,3,3,3,3};
        int i=0;
        int j=0;
        while(i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                i++;
            }
            else if(a[i]>b[j]) {
                j++;
            }
            else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
}
