package ex16excepion;

import java.io.IOException;

/*
예외처리방법2
: 예외가 발생한 지점에서 예외를 직접 처리한다. 개발시 가장 많이
사용되는 방법으로 try~catch문을 통해 예외가 발생할수 있는 지점을
명시적으로 알수 있다.
*/

public class Ex03ExceptionCase2 {
	
	static void compileFunc() {
		try {
			//관련있는 로직을 하나로 묶어주는것이 좋다.
			System.out.println("하나의 문자를 입력하세요:");
			int userChr = System.in.read();
			System.out.println("입력한 문자는: " + (char)userChr);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		compileFunc();
	}

}
