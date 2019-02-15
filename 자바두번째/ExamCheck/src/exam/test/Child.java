package exam.test;

class Child extends Parent {
	int x = 3000;   //인스턴스변수는 그 클래스만의 독특한 특성- 나중에 행동이나 ~가할때 사용될뿐이다.

	Child() {
		this(1000);
	}

	Child(int x) {
		this.x = x;
	}
	
//	int getX() {
//		return x;
////		return super.X;
//	}
}
