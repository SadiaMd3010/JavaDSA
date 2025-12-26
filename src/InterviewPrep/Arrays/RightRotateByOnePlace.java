package InterviewPrep.Arrays;

import java.util.Arrays;

public class RightRotateByOnePlace {
    public static void main(String[] args) {
        int[] val = {3,0,1,1,2,0,5,0,4};
        int j=-1;
        for(int i=val.length-1;i>=0;i--) {
            if(val[i]==0) {
                j=i;
                break;
            }
        }


    }
}
