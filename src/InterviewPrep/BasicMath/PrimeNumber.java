package InterviewPrep.BasicMath;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 31;
        int count = 0;
//        for(int i=1;i<=n;i++) {
//            if(n%i==0) {
//                count++;
//            }
//        }
//        if(count==2) {
//            System.out.println("Prime Number");
//        }
//        else {
//            System.out.println("Not Prime");
//        }

        //Optimal
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }

    }
}
