package Course.Lists.L1.Exs.E;

public class Mean {
    public static void main(String[] args) {
        double[] nums = {Math.PI, Math.sin(Math.PI), Math.E};

        System.out.println(mean(nums));
    }

    private static double mean(double [] nArr){
        double sum, result;
        sum = recursiveSum(nArr, 0);

        result = sum / nArr.length;
        return result;
    }

    private static double recursiveSum(double [] nArr, int index){
        if (index == nArr.length){
            return 0;
        }
        return nArr[index] + recursiveSum(nArr, index + 1 );
    }
}
