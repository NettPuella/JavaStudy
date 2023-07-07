package ex10accessmodifier;
/* class를 정의할때는 반드시 public이나 default(생략형)만 
사용할 수 있다. private은 class정의에는 사용할 수 없다.*/

/* 해당 클래스는 접근지정자를 생략했으므로 default 클래스로 정의된다.
이경우 동일한 패키지 내에서만 접근 가능하다. */
class DefaultClass1 {
	
	void myFunc() { 
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출 "); 
	} 
}
/* public 클래스는 해당 Java파일을 대표하는 클래스로 파일명과 통일해야한다.
또한 public 클래스는 자바파일당 단 하나만 정의할 수 있다.
public으로 정의하는 경우 다른 패키지에서도 접근을 허용하게 되므로
하나의 Java파일에 하나의class만 정의하는 것을 권장한다. */
public class E01AccessModifier1{
	//멤버변수 : 3가지의 접근지정자를 통해 선언
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	//멤버메서드 : 변수와 동일하게 3가지의 접근지정자를 통해 정의
	private void privateMethod() {
		/* 동일 클래스 내에서는 private 멤버라 할지라도 접근을 
		허용한다. 즉 동일 클래스 내에서는 접근지정자의 영향을
		받지 않는다. */
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultMethod() {
		privateVar = 200;//사용가능
		System.out.println("defaultMethod()메소드 호출");
	}
	public void publicMethod() {
		privateVar = 300; //사용가능
		System.out.println("privateMethod() 메소드 호출");

	}
}
	