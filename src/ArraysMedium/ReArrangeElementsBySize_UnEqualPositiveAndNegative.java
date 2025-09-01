package ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class ReArrangeElementsBySize_UnEqualPositiveAndNegative {
    public static void main(String[] args) {
        int a[]= {2,3,1,-2,-5,-6,-3,-9};
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            if(a[i]<0) {
                neg.add(a[i]);
            }
            else {
                pos.add(a[i]);
            }
        }

        if(pos.size()>neg.size()) {
            for(int i=0;i<neg.size();i++) {
                a[2*i]=pos.get(i);
                a[2*i+1]=neg.get(i);
            }

            int index=neg.size()*2;
            for(int i=neg.size();i<pos.size();i++) {
                a[index]=pos.get(i);
                index++;
            }
        }
        else {
            for(int i=0;i<pos.size();i++) {
                a[2*i]=pos.get(i);
                a[2*i+1]=neg.get(i);
            }

            int index=pos.size()*2;
            for(int i=pos.size();i<neg.size();i++) {
                a[index]=neg.get(i);
                index++;
            }
        }
        System.out.println(Arrays.toString(a));


    }
}
