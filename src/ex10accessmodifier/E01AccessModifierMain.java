package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {

	public static void main(String[]args) {
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		E01AccessModifier1 one = new E01AccessModifier1();
		
		//System.out.println("one.privateVar=" + one.privateVar);
		System.out.println("one.defaultVar=" + one.defaultVar);
		System.out.println("one.publicVar=" + one.publicVar);
		//one.privateMethod();
		one.defaultMethod();
		/* private으로 선언된 멤버에 외부 클래스에서 접근하려면 public으로
		선언된 멤버메서드를 통해 간접적으로 접근해야 한다. 클래스 내부에서는 접근
		지정자의 영향을 받지 않으므로 해당 메서드를 통해 접근하는 것이 가능해지게 된다*/
		one.publicMethod();
		
		/* 동일한 패키지에서 선언된 클래스이므로 import 없이
		인스턴스 생성이 가능하다. 또한 default 클래스는 동일
		패키지 내에서 접근할 수 있다. */
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		/////////////////////////////////////
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		/* 다른 패키지에 선언된 클래스이므로 인스턴스 생성을 위해
		import 선언을 해야한다. 또한 패키지가 다르면 private, 
		default 멤버는 접근할 수 없다. */
		E01AccessModifier2 two = new E01AccessModifier2();
		
//		System.out.println("one.privateVar=" + two.privateVar);
//		System.out.println("one.defaultVar=" + two.defaultVar);
		System.out.println("one.publicVar=" + two.publicVar);
		
//		two.privateMethod();
//		two.defaultMethod();
		two.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
//		new E01AccessModifier2().myFunc();
	}
	
}
