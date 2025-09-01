package InterviewPrep.BinarySearch;

public class MinimiseMaxDistanceBetweenGasStations {
    public static void main(String[] args) {
        int[] arr = {1,13,17,23};
        int k= 5;
        //Brute
//        int[] newArr = new int[k-1];
//        for(int i=1;i<=k;i++) {
//            int maxLen= -1; int maxIndex=-1;
//            for(int j=0;j<arr.length-1;j++) {
//                int diff = arr[j+1]-arr[j];
//                int sectorLength = diff/ (newArr[j]+1);
//                if(sectorLength> maxLen) {
//                    maxLen= sectorLength;
//                    maxIndex= j;
//                }
//            }
//            newArr[maxIndex]++;
//        }
//        int maxLen=-1;
//        for(int i=0;i<arr.length-1;i++) {
//            int diff = arr[i+1]-arr[i];
//            int secLen = diff/ (newArr[i]+1);
//            maxLen=Math.max(maxLen,secLen);
//        }
//        System.out.println(maxLen);

        //Optimal
        double low=0;
        double max=-1;
        for(int i=10;i<arr.length-1;i++) {
            double diff = arr[i+1]-arr[i];
            max=Math.max(max,diff);
        }
        double high = max;
        while((high-low )> Math.pow(10,-6)) {
            double mid = (low+high)/2;
            if(countFun(mid,arr) <=k ) {
                high=mid;
            }
            else {
                low = mid;
            }
        }
        System.out.println(high);

    }

    public static int countFun(double mid, int[] arr) {
        int count=0;
        for(int i=0;i<arr.length-1;i++) {
            double diff = arr[i+1]-arr[i];
            double secLength = diff/mid;
            if(secLength == secLength*diff) {
                secLength--;
            }
            count+=secLength;
        }
        return count;
    }
}
