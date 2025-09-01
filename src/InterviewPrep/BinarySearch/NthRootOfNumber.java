package InterviewPrep.BinarySearch;

public class NthRootOfNumber {
    public static void main(String[] args) {
        int num= (int) Math.pow(10,10);
        int n=3;
        //Brute
//        for(int i=1;i<=num;i++) {
//            if(Math.pow(i,n)==num) {
//                System.out.println(i);
//                break;
//            }
//            else if( Math.pow(i,n)>num){
//               break;
//            }
//        }

        //Optimal
        System.out.println(nthRoot(n,num));
    }

    public static int power(int n,int mid,int num) {
        int ans=1;
        for(int i=1;i<=n;i++) {
            ans = ans * mid;
            if (ans > num) return 2;
        }
        if(ans==num) return 1;
        else return 0;
    }
    public static int nthRoot(int n, int num) {
        int low=1,high=num;
        while(low<=high) {
            int mid=(low+high)/2;
            if(power(n,mid,num)==1) {
                return mid;
            } else if (power(n,mid,num)==0) {
               low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
}
