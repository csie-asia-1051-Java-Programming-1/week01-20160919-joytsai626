package hw;
import java.util.*;
public class hw01_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("¿é¤Jn:");
		int n=scn.nextInt();
		double sum=Math.log(n)/Math.log(2);
		double a=Math.ceil(sum);
		System.out.println(a);
	}

}
