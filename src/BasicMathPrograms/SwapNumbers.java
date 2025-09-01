package BasicMathPrograms;

public class SwapNumbers {
    public static void main(String[] args) {
        //Third variable
        int a= 10;
        int b=20;
        System.out.println("Before swapping : " +a+" and " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping : " +a+" and "+ b);
        //Without ThirdVariable
        int x=50;
        int y=60;
        System.out.println("Before swapping : " +x+" and "+ y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping : " +x+" and "+ y);
    }
}
