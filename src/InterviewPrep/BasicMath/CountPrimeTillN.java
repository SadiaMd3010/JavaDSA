package InterviewPrep.BasicMath;

public class CountPrimeTillN {
    public static  boolean findPrime(int n) {
        int count=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count==2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n=6;
        int count=0;
        for(int i=1;i<=n;i++) {
            if(findPrime(i)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
