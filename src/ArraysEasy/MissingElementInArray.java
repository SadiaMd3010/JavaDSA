package ArraysEasy;

public class MissingElementInArray {
    public static void main(String[] args) {
        //BRUTE
//        int a[]={1,2,4,5};
//        int n=5;
//        for(int i=1;i<=n;i++) {
//            int flag=0;
//            for(int j=0;j<a.length;j++) {
//                if(a[j]==i) {
//                    flag=1;
//                }
//            }
//            if(flag==0) {
//                System.out.println(i);
//            }
//        }
        //BETTER - Hashing
//        int a[]={1,2,4,5};
//        int n=5;
//        int hash[]= new int[n+1];
//        for(int i=0;i<a.length;i++) {
//            hash[a[i]]++;
//        }
//
//        for(int i=1;i<hash.length;i++) {
//            if(hash[i]==0) {
//                System.out.println(i);
//            }
//        }

        //OPTIMAL
//        int a[]={1,2,4,5};
//        int sum=0;
//        int n=5;
//        int actualSum= n*(n+1)/2;
//        for(int i=0;i<a.length;i++) {
//            sum=sum+a[i];
//        }
//        int missingNumber = actualSum-sum;
//        System.out.println(missingNumber);

        //OPTIMAL
        int a[]={1,2,4,5};
        int n=5;
        int XOR1=0;
        int XOR2=0;
        for(int i=0;i<a.length;i++) {
            XOR1=XOR1^a[i];
            XOR2=XOR2^(i+1);
        }
        XOR2=XOR2^n;
        System.out.println(XOR1^XOR2);

    }
}
