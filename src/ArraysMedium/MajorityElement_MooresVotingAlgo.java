package ArraysMedium;

public class MajorityElement_MooresVotingAlgo {
    public static void main(String[] args) {
        int a[]= {2,2,3,3,1,2,2};
        int count=0;
        int ele = 0;
        for(int i=0;i<a.length;i++) {
            if(count==0) {
                count=1;
                ele=a[i];
            }
            else if(a[i]==ele) {
                count++;
            } else {
                count--;
            }

        }
        int count1=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==ele) {
                count1++;
            }
        }

        if(count1>(a.length/2)) {
            System.out.println(ele);
        }

    }
}
