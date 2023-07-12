package ex12inheritance;
class Point {
	//멤버변수 : 중심점 표현을 위해 x,y좌표값을 설정
   	int xDot, yDot;
   	//생성자
   	public Point(int x, int y) {
         xDot=x;
         yDot=y;
   	}
   	//멤버변수인 좌표값을 출력
   	public void showPointInfo() {
   		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	//생성자
	public Circle(int radian,  int x, int y) {
		//멤버변수의 반지름을 초기화
		this.radian = radian;
		//인스턴스 생성 및 초기화
		center = new Point(x, y);
	}
	//원의 정보를 출력하는 멤버메서드
	public void showPointInfo() {
		//포인트 정보를 먼저 
		center.showPointInfo();
		System.out.println("반지름:" + this.radian);
	}
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	//생성자
	public Ring(int inX, int inY, int inRad, int outX, int outY, int outRad) {
		//안쪽 원 인스턴스 생성
		innerCircle = new Circle(inRad, inX, inY);
		//바깓쪽 원 인스턴스 생성
		outerCircle = new Circle(outRad, outX, outY);
	}
	//링의 정보를 출력하는 멤버메서드
	public void showRingInfo() {
		//링은 원2개의 정보를 동시에 출력하면 된다.
		System.out.println("안쪽 원의 정보:");
		innerCircle.showPointInfo();
		System.out.println("바깓쪽 원의 정보:");
		outerCircle.showPointInfo();
	}
}
class QuRingMake {
	public static void main(String[] args) {
//		안쪽원의 정보 :
//		반지름 : 3	
//		[x좌표:1, y좌표1]
//		바깥쪽원의 정보 :
//		반지름 : 9
//		[x좌표:2, y좌표2]
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
		



	}
}

