package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex03_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int a=src.nextInt();
		int b=src.nextInt();
		System.out.print(Math.pow(a, b));
	}

}
