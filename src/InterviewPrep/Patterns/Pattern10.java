package InterviewPrep.Patterns;

public class Pattern10 {
    public static void main(String[] args) {
//*
//**
//***
//****
//*****
//****
//***
//**
//*
        int n=5;
        int stars;
        for(int i=0;i<2*n;i++) {
            if(i>=n) {
                stars= 2*n-i-2;
            }
            else stars=i;
            for(int j=0;j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
