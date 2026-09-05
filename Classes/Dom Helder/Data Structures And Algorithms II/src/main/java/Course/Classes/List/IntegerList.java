package Course.Classes.List;

public class IntegerList {
	private int[] array;
	private int n;
	

	public void LinearList(int size){
		this.array = new int[size];
		this.n = 0;
	}

	public void insertStart(int x){
		if (n >= array.length) throw new RuntimeException("List is Full!");

		for (int i = n-1; i < 0; i--){
			array[i] = array[i-1];
		}
		array[0] = x;
		n++;
	}

	public void insertEnd(int x){
		if (n >= array.length) throw new RuntimeException("List is Full!");

		array[n] = x;
		n++;
	}

	public static void main(String args[]){

	
}

}

