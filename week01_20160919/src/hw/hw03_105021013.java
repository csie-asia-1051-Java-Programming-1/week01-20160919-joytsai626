package hw;
import java.util.*;
public class hw03_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		float d = scn.nextFloat();
		float e = scn.nextFloat();
		float f = scn.nextFloat();
		
		float A = Math.min(a, b);
		float B = Math.min(A, c);
		float C = Math.min(B, d);
		float D = Math.min(C, e);
		float E = Math.min(D, f);
		
		System.out.println("³Ì¤p­È¬O" + Math.round(E));
	}

}
