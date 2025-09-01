package InterviewPrep.BasicMath;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=1634;
        int sum=0;
        int original = n;
        int digits = String.valueOf(n).length();
        while(n>0) {
            int ld=n%10;
            sum=sum+powValue(ld,digits);
//            sum= (int) (sum+Math.pow(ld,digits));
            n=n/10;
        }
        System.out.println(sum);
        if(sum==original) {
            System.out.println("Arm");
        }
    }

    public static int powValue(int ld,int n) {
        int ans=1;
        for(int i=1;i<=n;i++) {
            ans=ans*ld;
        }
        return ans;
    }
}
