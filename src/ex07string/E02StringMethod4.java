package ex07string;

import java.util.Scanner;

public class E02StringMethod4 {

	public static void main(String[] args) {
		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하시오:");
		String jumin = scanner.nextLine(); //주민번호 입력창 
		
		char gender = jumin.charAt(7); //8번째 인덱스
		
		String gender1 = null; //남자, 여자 변수로 출력
		
		if(gender == '3') {
			gender1 = "남자";
		}
		else if(gender == '4') {
			gender1 = "여자";
		}
		
		System.out.println(gender1);
		
		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
				
		
		
		/*
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/
		
		
		
		
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/

		String a = "my.file.images.jpg";
		

		
	}

}
