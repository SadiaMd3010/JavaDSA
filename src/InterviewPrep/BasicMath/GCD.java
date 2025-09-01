package InterviewPrep.BasicMath;

public class GCD {
    public static void main(String[] args) {
        int n1=20;
        int n2=40;
//        int gcd=1;
//        for(int i=1;i<=Math.min(n1,n2);i++) {
//            if((n1%i)==0 && (n2%i)==0 ) {
//                gcd=i;
//            }
//        }
//        System.out.println(gcd);

        //Other way
//        for(int i=Math.min(n1,n2);i>=1;i--) {
//            if((n1%i)==0 && (n2%i)==0) {
//                System.out.println(i);
//                break;
//            }
//        }

        //Optimal - Equilodian Algo
        while(n1>0 && n2>0) {
            if(n1>n2) {
                n1=n1%n2;
            }
            else {
                n2=n2%n1;
            }
        }
        if(n1==0) {
            System.out.println(n2);
        }
        else {
            System.out.println(n1);
        }
    }
}
