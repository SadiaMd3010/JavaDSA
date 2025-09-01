package Hashing;

public class CountElementsInArrayBruteForce {
    public static void main(String[] args) {
        int a[] = {1,1,1,9,6,9,9,4,9,7};
        int count=0;
        int element=9;
        for(int i=0;i<a.length;i++) {
            if(a[i]==element) {
                count++;
            }
        }
        System.out.println(count);
    }

}
