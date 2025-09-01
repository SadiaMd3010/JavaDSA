package ArraysEasy;

public class CheckArrayIsSorted {
    public static boolean checkIfSorted(int[] a) {
        for(int i=1;i<a.length;i++) {
            if(a[i-1]>a[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[] = {1, 1, 3, 4, 5};
        System.out.println(checkIfSorted(a));
    }
}
