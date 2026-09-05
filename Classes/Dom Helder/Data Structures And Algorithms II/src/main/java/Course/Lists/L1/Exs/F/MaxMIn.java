package Course.Lists.L1.Exs.F;

import java.util.HashMap;

public class MaxMIn {
    public static void main(String[] args) {
        double[] nums = {1,2,3, Math.sin(Math.PI/6)};

        HashMap<String, Double> maxmin = maxmin(nums);

        System.out.println("Min: " + maxmin.get("min"));
        System.out.println("Max: " + maxmin.get("max"));

    }

    public static HashMap<String,Double> maxmin(double[] nums){
        HashMap<String,Double> result =  new HashMap<>();

        double min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(double i : nums){
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
        }
        result.put("max",max);
        result.put("min",min);

        return result;
    }
}
