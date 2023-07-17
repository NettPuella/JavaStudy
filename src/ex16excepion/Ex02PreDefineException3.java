package ex16excepion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02PreDefineException3 {
	 
	public static void main(String[] args)  {	
 
		System.out.println("### InputMismatchException ###");
		Scanner sc = new Scanner(System.in);
		try {
			/* 입력시 정수가 아닌 문자 혹은 문자열을 입력하면
			정수로 변환이 불가능하므로 예외가 발생된다. */
			System.out.print("나이를 입력하세요:");
			int intAge = sc.nextInt(); 
			int ageAfter10 = intAge + 10;
			System.out.println("당신의 10년후 나이는:"+ ageAfter10);
		}
		catch(InputMismatchException e) {
			System.out.println("나이를 문자형태로 입력하면 앙데요");
			System.out.println("예외메세지:"+e.getMessage());
			e.printStackTrace();
		} 
		
	}////end of main 
}

