package ex08class;


//과일 판매자를 추상화 한 클래스
class FruitSeller3{
	//멤버변수
	//보유한 사과의 재고수량
	int numOfApple; 
	//판매 수익금
	int myMoney;
	//기존에 상수로 선언했던 부분을 일반 멤버변수로 변경했다.
	final int APPLE_PRICE; 
	/* 멤버상수는 값의 변경이 불가능하고, 단 한번만 초기화되기
	때문에 일반 메서드에서는 초기화할 수 없다. 또한 초기값이
	없는 상태로 선언 자체가 불가능하다.
	하지만 새엇ㅇ자는 객체생성시 딱 한번만 호출되고, 개발자가 마음대로
	호출할 수 없으므로 한번 이상 초기화되지 않음이 보장된다.
	따라서 멤멉상수는 생성자에서 초기화할 수 있다. */
	
	/* 초기화 메서드를 선언하여 객체 생성 후 다양한 형태의
	초기화가 가능하다. */
	public FruitSeller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	//판매자의 현재 상태를 출력한다.
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//구매자의 현재상태 출력
	public void showsaleResult() {
		System.out.println("[판매자]남은 사과갯수:" + numOfApple);
		System.out.println("[판매자]판매수익:" + myMoney);
	}

	public void showSaleResult() {
		
	}
}

class FruitBuyer3{
	//멤버변수 : 보유금액, 구매한 사과의 갯수
	int myMoney;
	int numOfApple;
	
	//멤버변수의 초기값을 제거한 후 초기화메서드를 추가한다.
	public FruitBuyer3(int _myMoney, int _numOfApple ) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	//구매자의 현재상태 출력
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}

public class E06FruitSalesMain3 {

	public static void main(String[] args) {
		/* 생성자를 사용해서 인스턴스를 생성하면 생성과 동시에 초기화
		할 수 있으므로 초기화 메서드를 사용하는 것보다 적은 코드로
		작성할 수 있다. */

		//판매자와 구매자의 인스턴스를 생성한다.
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 50);
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showsaleResult();
		seller2.showsaleResult();
		buyer.showBuyResult();
	}
}
