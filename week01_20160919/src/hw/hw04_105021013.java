package hw;
import java.util.*;
public class hw04_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入 a 與 b:");
        double a = scn.nextInt();
        double b = scn.nextInt();
        double sum = Math.pow(a, 1/b);
        System.out.println(sum);
	}

}
