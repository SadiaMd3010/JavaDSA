package ArraysEasy;

public class LinearSearch {
    public static int linear(int[] a,int num) {
        for(int i=0;i<a.length;i++) {
            if(a[i]==num) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,6,3,7,2,5};
        int num=3;
        System.out.println(linear(a,num));
    }
}
