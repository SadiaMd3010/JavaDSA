package BasicMathPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        //BRUTE
//        int n=10;
//        int count=0;
//        for(int i=1;i<=n;i++) {
//            if(n%i==0) {
//                count++;
//            }
//        }
//        if(count==2) {
//            System.out.println("prime");
//        }
//        else {
//            System.out.println("not prime");
//        }

        //OPTIMAL
        int n=11;
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                count++;
                if(n/i!=i) {
                    count++;
                }
            }
        }
        if(count==2) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
