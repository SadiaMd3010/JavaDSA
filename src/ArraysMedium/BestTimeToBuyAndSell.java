package ArraysMedium;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int a[]= {7,1,5,3,2};
        int min=a[0];
        int profit=0;
        for(int i=1;i<a.length;i++) {
            int cost=a[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,a[i]);
        }
        System.out.println(profit);
    }

}
