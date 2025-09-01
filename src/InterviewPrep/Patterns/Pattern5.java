package InterviewPrep.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
//        for(int i=0;i<5;i++) {
//            for(int j=5;j>i;j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//*****
//****
//***
//**
//*

        //OR
        int n = 5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
