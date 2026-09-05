package Course.Lists.L4.Exs.J;

public class recursiveMinimumScalarSort {
    public static void main(String[] args) {
        int[] v = {1,2,3,4,2,0,-4};
        System.out.println(findMinimunScalar(v,0, v[0]));
    }

    static int findMinimunScalar(int[] v, int i, int min){
        if (i == v.length) return min;
        if ( v[i] <= min) min = v[i];

        return findMinimunScalar(v, ++i, min);
    }
}
