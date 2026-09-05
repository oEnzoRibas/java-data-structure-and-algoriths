package Course.Lists.L4.Exs.A;

public class recursiveVectorReverser {
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7,8,9};
		reverser(nums,nums.length-1);

	}

	public static void reverser(int[] v, int length){

		if (length < 0) return;
		System.out.println(v[length]);
		reverser(v,length-1);
	}
}
