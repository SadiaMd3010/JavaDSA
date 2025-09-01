package InterviewPrep.Additional;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine {
    public static void main(String[] args) {
        int nums[][]=  {{0,1}, {2,3}, {4,5}, {1,2}, {3,4}, {2,2}};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            Map<Double,Integer> map = new HashMap<>();
            for(int j=i+1;j<nums.length;j++) {
                int dy = nums[j][1]-nums[i][1];
                int dx = nums[j][0]-nums[i][0];
                double slope = dx == 0 ? Double.POSITIVE_INFINITY : (double) dy / dx;
                map.put(slope,map.getOrDefault(slope,0)+1);
            }
            for(Map.Entry<Double,Integer> entry : map.entrySet()) {
                max = Math.max(max, entry.getValue()+1);
            }
        }
        System.out.println(max);


    }
}
