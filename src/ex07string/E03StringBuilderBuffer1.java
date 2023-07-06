package ex07string;

public class E03StringBuilderBuffer1 {

	public static void main(String[] args) {
/* 
*/		
		/*
		append() : 문자열의 끝에 새로운 문자열을 연결한다
		insert() : 지정한 인덱스 위치에 문자열을 삽입한다. 
		*/
		//문자열 연결
		StringBuffer strBuf = new StringBuffer("AB");
		//정수 연결
		strBuf.append(25);
		//boolean값 연결
		strBuf.append("Y").append(true);
		System.out.println("strBuf=" + true);
		
		strBuf.insert(2, false);
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println("strBuf=" + strBuf);
		
		System.out.println("String 과 StringBuffer의"
				+ "참조값 비교");
		String str1 = "Java&JSP";
		String str2 = "Java&JSP";
		if(str1==str2)
			System.out.println("연결전: 주소값 동일");
		else
			System.out.println("연결전: 주소값 다름");
		
		str1 = str1 + "&Spring";
		if(str1==str2)
			System.out.println("연결후: 주소값 동일");
		else
			System.out.println("연결후: 주소값 다름");
		
		StringBuffer buf =new StringBuffer();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
	}

}










































