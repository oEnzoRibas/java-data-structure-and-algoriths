package Course.Lists.L4.Exs.B;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class recursiveVectorReverserFileOut {
	public static void main(String[] args){
		int[] vector = {12,13,314,15,16};
		
		vector = reverter(vector);

		String strVector = Arrays.toString(vector);	
		
		fileOut(strVector);
	}
	
	public static void fileOut(String str){	
		try{
			FileWriter w = new FileWriter("src/main/java/Course/Lists/L4/Exs/B/out.txt");
			w.write(str);
			w.close();
			System.out.println("Arquivo Criado");
		}catch (IOException ex){
			System.out.println(ex.getMessage());
		}
	}

	public static int[] reverter (int[] v){
		int[] res = new int[v.length];

		reverterRec(v, res, 0, v.length-1);

		return res;
	}

	private static void reverterRec(int[] in, int[] out,int iIn, int iOut){

		if (iIn >= in.length){
			return;
		}
		out[iOut] = in[iIn];
		reverterRec(in, out, iIn+1, iOut-1);
	}
}
